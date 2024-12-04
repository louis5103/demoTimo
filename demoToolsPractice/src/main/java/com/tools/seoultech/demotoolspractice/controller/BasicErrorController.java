package com.tools.seoultech.demotoolspractice.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BasicErrorController implements ErrorController {
    @RequestMapping(value = "/error", produces = MediaType.TEXT_HTML_VALUE)
    public String errorMessageshow(HttpServletRequest request, Model model){
        return "error";
    }
}



