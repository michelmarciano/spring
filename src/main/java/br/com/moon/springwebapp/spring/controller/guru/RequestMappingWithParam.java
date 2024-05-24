package br.com.moon.springwebapp.spring.controller.guru;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class RequestMappingWithParam {

    @RequestMapping(value = "/id")
    public String requestMappingComParamComValor(@RequestParam("id") String id){
        return "Request com Param com id: " + id;
    }

    @RequestMapping(value = "/personId")
    public String requestMappingComParamSemValor(@RequestParam String personId){
        return "Request com Param com id: " + personId;
    }

    @RequestMapping(value = "/name/required")
    public String requesMappingComParamRequeired(@RequestParam(value = "name", required = true) String name){
        return "Request com Param com name: " + name;
    }

    @RequestMapping(value = "/name/not-required")
    public String requesMappingComParamNotRequeired(@RequestParam(value = "name", required = false) String name){
        return "Request com Param not Required: ";
    }

    @RequestMapping(value = "/name/default")
    public String requesMappingComParamNotRequeiredAndDefaultValue(@RequestParam(value = "name", defaultValue = "Mike") String name){
        return "Request com Param not Required: " + name;
    }
}
