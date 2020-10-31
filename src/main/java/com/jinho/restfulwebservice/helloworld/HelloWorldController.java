package com.jinho.restfulwebservice.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
// RESPONSEBODY에 포함하지 않더라도 JSON으로 반환
// @Controller + @ResponseBody
public class HelloWorldController {
    // GET
    // /hello-world (end point)
    @GetMapping("/hello-world")
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping("/hello-world-bean")
    public HelloWorldBean helloWorldBean() {
        // JSON형태로 변환해서 반환함
        return new HelloWorldBean("Hello World");
    }

    @GetMapping("/hello-world-bean/path-variable/{name}")
    public HelloWorldBean helloWorldBean(@PathVariable String name) {
        // JSON형태로 변환해서 반환함
        return new HelloWorldBean(String.format("Hello World, %s", name));
    }



}
