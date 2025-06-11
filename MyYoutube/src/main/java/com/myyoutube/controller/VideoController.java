package com.myyoutube.controller;

import com.myyoutube.model.Rate;
import com.myyoutube.model.Video;
import com.myyoutube.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VideoController {
    @Autowired
    private VideoRepository videoRepository;

    @GetMapping("/videos")
    public List<Video> getAllVideos() {
        Sort sort = Sort.by(Sort.Direction.DESC, "duration");
        return videoRepository.findAll(sort);
    }

    @GetMapping("/video/show-user")
    public List<Object[]> getVideoWithUser() {
        return videoRepository.findVideoUser();
    }

    @GetMapping("/video/star-avg")
    public List<Object[]> getVideoStarAvg() {
        return videoRepository.findVideoStarAvg();
    }

}
