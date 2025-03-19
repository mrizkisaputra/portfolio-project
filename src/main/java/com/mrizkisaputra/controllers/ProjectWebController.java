package com.mrizkisaputra.controllers;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProjectWebController {

    @GetMapping(path = "/projects", produces = MediaType.TEXT_HTML_VALUE)
    public String getResume(Model model) {
        model.addAttribute("Title", "Projects");
        return "index";
    }
}
