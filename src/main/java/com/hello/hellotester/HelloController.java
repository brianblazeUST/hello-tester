package com.hello.hellotester;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.LocalDateTime;

@RestController
public class HelloController {
    @GetMapping(value = "/")
    public String sayHello() {
        return "HELLO-USER " + LocalDateTime.now();
    }

    @GetMapping(value = "/hello")
    public String sayHelloUser() throws UnknownHostException {
        return "HELLO-USER " + LocalDateTime.now() + " " + InetAddress.getLocalHost().getHostName();
    }
}
