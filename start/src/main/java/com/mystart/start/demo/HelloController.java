package com.mystart.start.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    /** Message 내용 수정 */
    @Value("${hello.message}")
    private String helloMessage;

    @GetMapping("/hello")
    public String getHello() {
        return helloMessage;
    }
}
