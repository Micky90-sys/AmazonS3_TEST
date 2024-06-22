package com.example.s3videostreamer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VideoController {

    @GetMapping("/video/{bucket}/{file}")
    public String getVideoStream(@PathVariable String bucket, @PathVariable String file) {
        return "Streaming video from bucket: " + bucket + ", file: " + file;
    }
}
