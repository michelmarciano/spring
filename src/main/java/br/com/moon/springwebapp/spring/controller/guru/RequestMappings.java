package br.com.moon.springwebapp.spring.controller.guru;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("home")
public class RequestMappings {

    @RequestMapping("retorna-string")
    public String uniqueMapping(){
        return "Ola Mundo";
    }

    @RequestMapping(value={"", "/page", "page*","view/*"})
    public String multipleMapping(){
        return "Ola Mundo";
    }
}
