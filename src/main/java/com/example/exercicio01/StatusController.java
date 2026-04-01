package com.example.exercicio01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class StatusController {

@GetMapping("/status")

    public String getStatus (){

    return "Sistema operacional detectado: Middleware Spring Boot em operação";


}

}
