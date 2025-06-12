package com.myyoutube.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Getter
@Setter
public class Video {
    @Id
    @Column(name = "id_video", nullable = false)
    private Integer videoId;

    @Column(length = 100, nullable = false)
    private String title;

    private Long duration;

    @Column(name = "upload_by", updatable = false, insertable = false)
    private Integer uploadBy;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "upload_by")
//    private User users;
//
//    @OneToMany(mappedBy = "id_video")
//    List<Rate> rates;

    // upload_by → user.id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "upload_by")
    private User user;

    // Một video có thể được nhiều người đánh giá
    @OneToMany(mappedBy = "videoId")
    private List<Rate> rates;

}
