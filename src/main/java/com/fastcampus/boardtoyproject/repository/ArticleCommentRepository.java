package com.fastcampus.boardtoyproject.repository;

import com.fastcampus.boardtoyproject.domain.ArticleComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleCommentRepository extends JpaRepository<ArticleComment, Long> {
}
