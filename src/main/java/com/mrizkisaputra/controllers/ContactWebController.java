package com.mrizkisaputra.controllers;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContactWebController {

    @GetMapping(path = "/contact", produces = MediaType.TEXT_HTML_VALUE)
    public String getContact(Model model) {
        model.addAttribute("Title", "Contact");
        return "index";
    }
}
