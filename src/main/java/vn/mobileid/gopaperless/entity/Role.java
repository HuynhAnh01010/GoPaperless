///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package vn.mobileid.gopaperless.entity;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.EnumType;
//import javax.persistence.Enumerated;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import lombok.Data;
//
///**
// *
// * @author Mobile ID 21
// */
//@Entity
//@Data
//@Table(name = "roles")
//public class Role {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    
//    @Enumerated(EnumType.STRING)
//    @Column(name = "role_name")
//    private ERole name;
//    
//    public Role(){}
//    
//    public Role(ERole name) {
//        this.name = name;
//    }
//}
