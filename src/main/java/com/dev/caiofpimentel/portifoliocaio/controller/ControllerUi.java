package com.dev.caiofpimentel.portifoliocaio.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/caio/ui")
public class ControllerUi {

    @GetMapping("/index")
    public String paginaInicial(){

        return "index";
    }

}
