/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.mobileid.gopaperless.controller;

import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import vn.mobileid.gopaperless.entity.Flight;

/**
 *
 * @author Mobile ID 21
 */
@Controller
@Slf4j
public class HomeController {
    @GetMapping("/")
    public String getHome() {
        return "index";
    }
    
    @GetMapping("/api/v1/test")
    public ResponseEntity<?> getTest() {
        log.info("call api test");
        List<Flight> list = new ArrayList<>();
        list.add(new Flight("1", "vanh"));
        list.add(new Flight("2", "eo"));
        
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}
