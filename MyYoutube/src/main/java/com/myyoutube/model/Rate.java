package com.myyoutube.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "rate")
public class Rate {
    @EmbeddedId
    private RateKey rateKey;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_user", insertable = false, updatable = false)
    private User idUser;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_video", insertable = false, updatable = false)
    private Video idVideo;

    @Column(name = "star")
    private Integer star;

    @Column(name = "is_like")
    private Boolean isLike;

}