package com.example.demo.controller;

import com.example.demo.acceptor.FixAcceptor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author oyrp
 * @date 2023/4/6 16:23
 */
@RestController
@Slf4j
public class StatusController {
    @GetMapping("/status")
    public ResponseEntity<String> status() {
        log.info("-----Call localhost:8080/status-----");
        try {
            FixAcceptor acceptor = new FixAcceptor();
            acceptor.init();
        }catch (Exception e){
            log.info("e:", e);
        }
        return new ResponseEntity<>("Up and Running!", HttpStatus.OK);
    }

}