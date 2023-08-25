package com.bluesky.demospringboot02.controller;
/*
Annotation để định nghĩa đường dẫn gồm:
    1. Controller
    ・ Dùng để định nghĩa đường dẫn để trả ra nội dung html
    ・ Muốn trả nội dung kiểu String thì controller phải kết hợp với ResponeBody

    2. RestController
    ・Dùng để định nghĩa đường dẫn, nội dung trả về String( chuyên dùng để viết API )
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//bước 1:
@RestController

//bước 2: định nghĩa đường dẫn
//ví dụ : /hello, /hello/cybersoft
@RequestMapping("/hello")

public class HelloController {

    //bước 3:
    @GetMapping("")
    //ý nghĩa GetMapping (phương thức get) ("") nghĩa là /hello thôi
    public  String hello(){
        return "Hello Spring Boot";
    }

    //  /hello/cybersot
    @GetMapping("/cybersoft")

    public String helloCybersof(){
        return "Hello Cybersoft";
    }

}
/*
nguyên tắc quét của spring boot: sẽ quét file, package cùng cấp với main (application.properties)
 */