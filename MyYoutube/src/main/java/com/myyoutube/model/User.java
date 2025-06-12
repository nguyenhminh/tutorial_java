package com.myyoutube.model;

import jakarta.persistence.*;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user", nullable = false)
    private Integer userId;

    @Column(name = "username", length = 50)
    private String username;

    @Column(name = "full_name", length = 100)
    private String fullName;

    @Column(name = "password", length = 50)
    private String password;

    @Column(name = "is_admin")
    private Boolean isAdmin;

    // 1 User upload nhiều Video
    @OneToMany(mappedBy = "user")
    private List<Video> videos;

    // 1 User có thể đánh giá nhiều video
    @OneToMany(mappedBy = "user")
    private List<Rate> rates;

    /*
    Lưu ý
    Nếu bảng A có b_id là khóa ngoại → Class A:
        @ManyToOne
        @JoinColumn(name = "b_id")
        private B b;

    Và Class B
        @OneToMany(mappedBy = "b")
        private List<A> aList;
     */
}