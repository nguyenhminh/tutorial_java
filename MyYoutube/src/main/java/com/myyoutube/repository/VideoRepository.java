package com.myyoutube.repository;

import com.myyoutube.model.Video;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VideoRepository extends JpaRepository<Video, Integer> {
    @Override
    List<Video> findAll(Sort sort);


    @Query("select v.id_video, v.title, v.duration, u.fullName upload_user from Video v join User u on u.id  = v.uploadBy")
    List<Object[]> findVideoUser();

    public static String VIDEO_STAR_AVG = """
            select v.id_video, v. title, AVG(r.star), SUM(r.is_like), u.full_name upload_user from video v inner join `user` u on v.upload_by = u.id_user\s
            						inner join rate r on r.id_video = v.id_video group by v.id_video
            """;

    @Query(value = """
            select v.id_video, v. title, AVG(r.star), SUM(CASE WHEN r.isLike = true THEN 1 ELSE 0 END), u.fullName upload_user from Video v inner join User u on v.uploadBy = u.id\s
            						inner join Rate r on r.idVideo = v group by v.id_video
        """, nativeQuery = false)
    List<Object[]> findVideoStarAvg();
}
