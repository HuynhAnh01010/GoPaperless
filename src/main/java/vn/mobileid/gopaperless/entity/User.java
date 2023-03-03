///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package vn.mobileid.gopaperless.entity;
//
//import java.util.HashSet;
//import java.util.Set;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.JoinTable;
//import javax.persistence.ManyToMany;
//import javax.persistence.Table;
//import javax.persistence.UniqueConstraint;
//import javax.validation.constraints.NotBlank;
//import lombok.Data;
//
///**
// *
// * @author Mobile ID 21
// */
//@Entity
//@Data
//@Table(name = "users", 
//    uniqueConstraints = { 
//      @UniqueConstraint(columnNames = "username"),
//      @UniqueConstraint(columnNames = "email") 
//    })
//public class User {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    
//    @NotBlank
//    private String username;
//    
//    @NotBlank
//    private String password;
//    
//    @NotBlank
//    private String email;
//    
//    @ManyToMany(fetch = FetchType.LAZY)
//    @JoinTable(name = "user_roles",
//            joinColumns = @JoinColumn(name = "user_id"),
//            inverseJoinColumns = @JoinColumn(name = "role_id"))
//    private Set<Role> roles = new HashSet<>();
//    
//    public User(){}
//    
//    public User(String username, String password, String email) {
//        this.username = username;
//        this.password = password;
//        this.email = email;
//    }
//    
//    
//}
