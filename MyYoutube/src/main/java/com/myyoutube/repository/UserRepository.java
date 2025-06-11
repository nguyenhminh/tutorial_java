package com.myyoutube.repository;

import com.myyoutube.model.User;
import com.myyoutube.model.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {


    public static String REPORT_SQL = """
            select u.id_user, u.username, u.full_name, count(v.upload_by) video_upload_total from `user` u inner join video v on u.id_user = v.upload_by group by v.upload_by ;
            """;

    @Query(value = REPORT_SQL, nativeQuery = true)
    List<Object[]> reportUser();
}
