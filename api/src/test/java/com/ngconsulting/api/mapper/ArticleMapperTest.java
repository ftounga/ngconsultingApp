package com.ngconsulting.api.mapper;

import com.ngconsulting.api.domain.ArticleDto;
import com.ngconsulting.api.entity.ArticleEntity;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArticleMapperTest {

    @Test
    public void should_map_article_entity_to_dto(){

        ArticleEntity articleEntity =  new ArticleEntity();
        articleEntity.setPreview("preview");
        articleEntity.setId(1);
        articleEntity.setLocation("location");
        articleEntity.setTitle("title article");
        articleEntity.setUrlImg("url img");

        ArticleDto dto = ArticleMapper.articleEntityToArticleDto(articleEntity);

        Assertions.assertThat(dto).isEqualToIgnoringGivenFields(articleEntity, "dateCreation");
    }

    @Test
    public void should_map_article_dto_to_entity(){

        ArticleDto articleDto =  new ArticleDto();
        articleDto.setPreview("preview");
        articleDto.setId(1);
        articleDto.setLocation("location");
        articleDto.setTitle("title article");
        articleDto.setUrlImg("url img");

        ArticleEntity articleEntity = ArticleMapper.articleDtoToArticleEntity(articleDto);

        Assertions.assertThat(articleEntity).isEqualToIgnoringGivenFields(articleDto, "dateCreation");
    }
}
