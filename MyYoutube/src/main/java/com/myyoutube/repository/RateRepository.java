package com.myyoutube.repository;

import com.myyoutube.model.Rate;
import com.myyoutube.model.RateKey;
import com.myyoutube.model.User;
import com.myyoutube.model.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RateRepository extends JpaRepository <Rate, RateKey> {

}
