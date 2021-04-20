package com.sparta.board.controller;

import com.sparta.board.domain.Article;
import com.sparta.board.dto.ArticleRequestDto;
import com.sparta.board.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class ArticleController {

    private final ArticleRepository articleRepository;

    @GetMapping("/hh99/article/list")
    public List<Article> getArticle() {
        return articleRepository.findAllByOrderByIdDesc();
    }

    @GetMapping("/hh99/article/view/{id}")
    public Article getDetail (@PathVariable Long id) {
        return articleRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("null"));
    }

    @PostMapping("/hh99/article/post")
    public Article createArticle(@RequestBody ArticleRequestDto requestDto) {
        Article article = new Article(requestDto);
        articleRepository.save(article);
        return article;
    }
}