package com.hello.hellotester;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.LocalDateTime;

@RestController
@Slf4j
public class HelloController {
    @GetMapping(value = "/")
    public String sayHello() {
        log.info("Inside the hello1");
        return "HELLO-USER " + LocalDateTime.now();
    }

    @GetMapping(value = "/hello")
    public String sayHelloUser() throws UnknownHostException {
        log.info("Inside the hello2");
        return "HELLO-USER " + LocalDateTime.now() + " " + InetAddress.getLocalHost().getHostName();
    }
}
