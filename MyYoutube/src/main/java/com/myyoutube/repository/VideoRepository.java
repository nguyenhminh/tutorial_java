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


  @Query("select v.videoId, v.title, v.duration, u.fullName upload_user from Video v join User u on u.userId  = v.uploadBy")
  List<Object[]> findVideoUser();

  @Query(value = """
          select v.videoId, v. title, AVG(r.star), SUM(CASE WHEN r.isLike = true THEN 1 ELSE 0 END), u.fullName upload_user from Video v inner join User u on v.uploadBy = u.userId\s
          						inner join Rate r on r.videoId = v group by v.videoId
      """, nativeQuery = false)
  List<Object[]> findVideoStarAvg();
}
