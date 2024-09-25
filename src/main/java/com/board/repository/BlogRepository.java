package com.board.repository;

import com.board.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

//JpaRepo의 경우 인터페이스고, <테이블클래스, 해당테이블의PK> 를 줘야함 반드시
public interface BlogRepository extends JpaRepository<Article, Long> {

}

