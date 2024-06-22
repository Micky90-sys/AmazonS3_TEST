package com.example.s3videostreamer.controller;

import com.example.s3videostreamer.S3VideoStreamerApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(classes = S3VideoStreamerApplication.class)
@AutoConfigureMockMvc
public class VideoControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetVideoStream() throws Exception {
        String bucketName = "test-bucket";
        String fileName = "test-video.mp4";

        mockMvc.perform(MockMvcRequestBuilders.get("/video/" + bucketName + "/" + fileName))
                .andExpect(status().isOk());
    }
}
