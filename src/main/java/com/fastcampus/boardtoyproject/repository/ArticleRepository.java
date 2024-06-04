package com.fastcampus.boardtoyproject.repository;

import com.fastcampus.boardtoyproject.domain.Article;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import javax.swing.text.html.Option;
import java.util.Optional;

@RepositoryRestResource
public interface ArticleRepository extends JpaRepository<Article, Long> {
}
