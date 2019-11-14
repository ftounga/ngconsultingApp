package com.ngconsulting.api.mapper;

import com.ngconsulting.api.domain.ArticleDto;
import com.ngconsulting.api.entity.ArticleEntity;

public class ArticleMapper {

    public static ArticleDto articleEntityToArticleDto(ArticleEntity entity){

        ArticleDto articleDto = new ArticleDto();
        articleDto.setId(entity.getId());
        articleDto.setDateCreation(entity.getDateCreation());
        articleDto.setLocation(entity.getLocation());
        articleDto.setPreview(entity.getPreview());
        articleDto.setUrlImg(entity.getUrlImg());
        articleDto.setTitle(entity.getTitle());
        return  articleDto;
    }

    public static ArticleEntity articleDtoToArticleEntity(ArticleDto dto){
        ArticleEntity entity = new ArticleEntity();
        entity.setId(dto.getId());
        entity.setDateCreation(dto.getDateCreation());
        entity.setLocation(dto.getLocation());
        entity.setPreview(dto.getPreview());
        entity.setUrlImg(dto.getUrlImg());
        entity.setTitle(dto.getTitle());
        return  entity;
    }
}
