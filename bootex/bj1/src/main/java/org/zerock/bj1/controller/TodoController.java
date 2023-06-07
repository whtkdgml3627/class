package org.zerock.bj1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j2;

@Controller
@RequestMapping("/todo/")
@Log4j2
public class TodoController {
    
    // list
    @GetMapping("list")
    public void list(){
       
        log.info("GET | /todo/list");

    }

    // add
    @GetMapping("add")
    public void add(){
       
        log.info("GET | /todo/add");

    }

    @PostMapping("add")
    public String addPost(){
        
        log.info("POST | /todo/add");

        return "redirect:/todo/list";
    }

    // read
    @GetMapping("read/{tno}")
    public String read(
        @PathVariable("tno") Long tno
    ){
        log.info("GET | /todo/read/" + tno);
        return "todo/read";
    }

    // modify
    @GetMapping("modify/{tno}")
    public String modify(
        @PathVariable("tno") Long tno
    ){

        log.info("GET | /todo/modify/" + tno);
        return "todo/modify";
    }

    @PostMapping("modify/{tno}")
    public String Postmodify(
        @PathVariable("tno") Long tno
    ){

        log.info("Post | /todo/modify/" + tno);
        return "redirect:/todo/read/" + tno;
    }


    // remove
    @PostMapping("remove")
    public String remove(){
        
        log.info("POST | /todo/remove");

        return "redirect:/todo/list";
    }

}
