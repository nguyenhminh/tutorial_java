package com.myyoutube.model;

import jakarta.persistence.*;
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
    private Integer id;

    @Column(name = "username", length = 50)
    private String username;

    @Column(name = "full_name", length = 100)
    private String fullName;

    @Column(name = "password", length = 50)
    private String password;

    @Column(name = "is_admin")
    private Boolean isAdmin;

    @OneToMany
    private Set<com.myyoutube.model.Rate> rates = new LinkedHashSet<>();

    @OneToMany(mappedBy = "uploadBy")
    private Set<Video> videos = new LinkedHashSet<>();

}