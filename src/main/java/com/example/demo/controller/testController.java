package com.example.demo.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {
    @GetMapping("/secured")
//    public String secured(OAuth2AuthenticationToken token){
//        return "Welchome, " +
//                token.getPrincipal().getAttribute("name")
//                + " These are your roles "
//                + token.getAuthorities().toString();
//    }
    public String secured(@AuthenticationPrincipal Jwt jwt){
        return "Welchome, " +
                jwt.getClaim("name");
    }
    @GetMapping("/unsecured")
    public String unsecured(){
        return " Hello unsecured";
    }
}