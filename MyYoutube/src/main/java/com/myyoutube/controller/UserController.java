package com.myyoutube.controller;

import com.myyoutube.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("/user/video/report")
    public List<Object[]> getReportUserVideo() {
        return userRepository.reportUser();
    }
}
