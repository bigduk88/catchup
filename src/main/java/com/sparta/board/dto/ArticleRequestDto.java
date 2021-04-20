package com.sparta.board.dto;

import lombok.Getter;

@Getter
public class ArticleRequestDto {
    private Long id;
    private String title;
    private String author;
    private String comment;
}
