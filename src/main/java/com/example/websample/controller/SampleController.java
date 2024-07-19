package com.example.websample.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController // componenet로 등록
public class SampleController {

    @GetMapping("order/1") // 유저 request와 맵핑
    public String getOrder(){
        log.info("getOrder");
        return "orderId:1, orderAmount:1000";
    }

    @PostMapping("order/1") // 유저 request와 맵핑
    public String createOrder(){
        log.info("createOrder");
        return "order created : orderId:1, orderAmount:1000";
    }
}
