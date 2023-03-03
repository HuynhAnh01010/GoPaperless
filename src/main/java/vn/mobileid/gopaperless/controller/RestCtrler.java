///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package vn.mobileid.gopaperless.controller;
//
//import java.util.Map;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import vn.mobileid.gopaperless.utils.ApiResult;
//import vn.mobileid.gopaperless.utils.CommonUtil;
//
///**
// *
// * @author Mobile ID 21
// */
//@RestController
//@Slf4j
//@RequestMapping("/api")
//public class RestCtrler {
//
//    @PostMapping("/login")
//    public ResponseEntity authenticate(HttpServletRequest request, HttpServletResponse response,
//            @RequestBody Map<String, String> mapData
//    ) {
//        try {
//            log.info("Login: {}", CommonUtil.convertObjectToString(mapData));
//            log.info("userName: {}", CommonUtil.convertObjectToString(mapData.get("userName")));
//            if ("mobileid".equals(mapData.get("userName")) && "123456".equals(mapData.get("passWord"))) {
//                return new ResponseEntity(ApiResult.ok(), HttpStatus.OK);
//            } else {
//                return new ResponseEntity(ApiResult.fail(), HttpStatus.UNAUTHORIZED);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//            return new ResponseEntity(ApiResult.fail(), HttpStatus.UNAUTHORIZED);
//        }
//
//    }
//}
