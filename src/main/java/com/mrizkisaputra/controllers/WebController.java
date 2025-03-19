package com.mrizkisaputra.controllers;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping(path = {"/", "/home"}, produces = MediaType.TEXT_HTML_VALUE)
    public String getHome(Model model) {
        model.addAttribute("Title", "Home");
        return "index";
    }
}
