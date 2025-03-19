package com.mrizkisaputra.controllers;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ResumeWebController {

    @GetMapping(path = "/resume", produces = MediaType.TEXT_HTML_VALUE)
    public String getResume(Model model) {
        model.addAttribute("Title", "Resume");
        return "index";
    }

    @RequestMapping(path = "/download-resume")
    public void downloadResume() {

    }
}
