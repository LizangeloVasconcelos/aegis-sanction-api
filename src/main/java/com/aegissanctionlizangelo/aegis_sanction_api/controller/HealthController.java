package com.aegissanctionlizangelo.aegis_sanction_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/")
    public String health() {
        return "Aegis Sanction is running";
    }


    @GetMapping("/teste")
    public String teste() {
        return "Rota teste funcionando";
    }
}