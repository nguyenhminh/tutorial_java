package com.myyoutube;

import com.myyoutube.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyYoutubeApplication {


	public static void main(String[] args) {
		SpringApplication.run(MyYoutubeApplication.class, args);
	}

}
