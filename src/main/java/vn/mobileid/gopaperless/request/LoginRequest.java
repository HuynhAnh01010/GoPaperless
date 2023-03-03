/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.mobileid.gopaperless.request;

import javax.validation.constraints.NotBlank;
import lombok.Data;

/**
 *
 * @author Mobile ID 21
 */
@Data
public class LoginRequest {

    @NotBlank
    private String username;

    @NotBlank
    private String password;
}
