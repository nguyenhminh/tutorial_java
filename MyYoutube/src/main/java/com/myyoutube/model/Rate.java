package com.myyoutube.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "rate")
public class  Rate {
    @EmbeddedId
    private RateKey rateKey;

    // Nhiều Rate thuộc 1 Video
    @ManyToOne
    @JoinColumn(name = "id_video")
    private Video videoId;

    // Nhiều Rate do 1 User thực hiện
    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;

    @Column(name = "star")
    private Integer star;

    @Column(name = "is_like")
    private Boolean isLike;

}