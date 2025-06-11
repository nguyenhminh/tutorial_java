package com.myyoutube.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Getter
@Setter
public class Video {
    @Id
    private Integer id_video;
    @Column(length = 100, nullable = false)
    private String title;
    private Long duration;
    @Column(name = "upload_by")
    private Integer uploadBy;

    @OneToMany
    private Set<com.myyoutube.model.Rate> rates = new LinkedHashSet<>();

}
