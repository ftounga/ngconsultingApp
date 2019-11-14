package com.ngconsulting.api.service.impl;

import com.ngconsulting.api.domain.ArticleDto;
import com.ngconsulting.api.mapper.ArticleMapper;
import com.ngconsulting.api.repository.ArticleRepository;
import com.ngconsulting.api.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleRepository articleRepository;

    @Override
    public List<ArticleDto> getAllArticles(){
        return articleRepository.findAll().stream().map(ArticleMapper::articleEntityToArticleDto).collect(Collectors.toList());
    }
}
