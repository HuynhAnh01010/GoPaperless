/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.mobileid.gopaperless.entity;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Mobile ID 21
 */
@Getter
@Setter
public class Flight {
    private String id;
    private String name;

    public Flight(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
