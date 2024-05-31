package com.fastcampus.boardtoyproject.repository;

import com.fastcampus.boardtoyproject.domain.Article;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
