package com.ngconsulting.api.service;

import com.ngconsulting.api.entity.UserEntity;
import com.ngconsulting.api.repository.UserRepository;
import org.springframework.boot.autoconfigure.security.oauth2.resource.UserInfoTokenServices;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.oauth2.common.exceptions.InvalidTokenException;
import org.springframework.security.oauth2.provider.OAuth2Authentication;

import java.time.LocalDate;
import java.util.LinkedHashMap;

public class CustomUserInfoTokenServices extends UserInfoTokenServices {

    private UserRepository userRepository;

    public CustomUserInfoTokenServices(String userInfoEndpointUrl, String clientId, UserRepository userRepo) {
        super(userInfoEndpointUrl, clientId);
        this.userRepository = userRepo;
    }

    @Override
    public OAuth2Authentication loadAuthentication(String accessToken) throws AuthenticationException, InvalidTokenException {
        OAuth2Authentication oAuth2Authentication = super.loadAuthentication(accessToken);
        LinkedHashMap details = (LinkedHashMap) oAuth2Authentication.getUserAuthentication().getDetails();
        UserEntity userEntity;
        if(!userRepository.existsByEmail((String) details.get("email"))){
            userEntity = buildUserEntity(details);
        } else {
            userEntity = userRepository.findByEmail((String) details.get("email"));
            updateUserEntity(details, userEntity);
        }
        userRepository.save(userEntity);
        return oAuth2Authentication;
    }

    private void updateUserEntity(LinkedHashMap details, UserEntity userEntity) {
        userEntity.setDateConnexion(LocalDate.now());
        userEntity.setName((String) details.get("name"));
        userEntity.setPicture((String) details.get("picture"));
    }

    private UserEntity buildUserEntity(LinkedHashMap details) {
        UserEntity user = new UserEntity();
        user.setEmail((String) details.get("email"));
        user.setName((String) details.get("name"));
        user.setPicture((String) details.get("picture"));
        user.setDateCreation(LocalDate.now());
        user.setDateConnexion(LocalDate.now());
        return user;
    }
}
