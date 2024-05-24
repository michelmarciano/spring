package br.com.moon.springwebapp.spring.controller.guru;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/method")
public class RequestMappingMethod {


    @RequestMapping(method = RequestMethod.GET)
    public String methodGet(){
        return "Method Get";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String methodPost(){
        return "Method Post";
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public String methodDelete (){
        return "Method Delete";
    }

    @RequestMapping(method = RequestMethod.PUT)
    public String methodPut(){
        return "Method Put";
    }
}
