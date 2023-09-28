package com.bordo.examplegithubaction.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/github-action")
public class GithubActionController {
    @GetMapping
    public ResponseEntity<String> getGithubAction(){
        return new ResponseEntity<>("Github Action Version:0.0.1", HttpStatus.OK);
    }
}
