package com.myyoutube.model;

import com.myyoutube.repository.RateRepository;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class RateKey implements Serializable {
    @Column(name = "id_video", updatable = false, insertable = false)
    Integer idVideo;

    @Column(name = "id_user", updatable = false, insertable = false)
    Integer idUser;
}
