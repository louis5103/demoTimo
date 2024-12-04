package com.tools.seoultech.demotoolspractice.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")  //http://localhost:8080/test
@Log4j2
public class BasicController {
    @GetMapping("test")
    public void test(){
       log.info("controller test............................................");
//       throws Exception("error가 발생했습니다");
    }
    @GetMapping("게시판")
    public String showPost(){
        return "redirect:/post/fragment_table";
    }
    @GetMapping("post/fragment_table")
    public void showtest(){
        log.info("controller test............................................");
    }
}
