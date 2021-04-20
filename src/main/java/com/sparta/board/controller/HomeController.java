package com.sparta.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping("/hh99/article/post")
    public String post() {
     return "post";
    }

    @GetMapping("/hh99/article")
    public String article() {
        return "index";
    }

    @GetMapping("hh99/article/view")
    public String detail(@RequestParam("id") Long id) {
        return "detail.html";
    }

}
