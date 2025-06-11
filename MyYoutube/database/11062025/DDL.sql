
-- my_youtube.rate definition

CREATE TABLE `rate` (
                        `id_user` int(11) DEFAULT NULL,
                        `id_video` int(11) DEFAULT NULL,
                        `star` int(11) DEFAULT NULL,
                        `is_like` bit(1) DEFAULT NULL,
                        KEY `id_user` (`id_user`),
                        KEY `id_video` (`id_video`),
                        CONSTRAINT `rate_ibfk_1` FOREIGN KEY (`id_user`) REFERENCES `user` (`id_user`),
                        CONSTRAINT `rate_ibfk_2` FOREIGN KEY (`id_video`) REFERENCES `video` (`id_video`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- my_youtube.`user` definition

CREATE TABLE `user` (
                        `id_user` int(11) NOT NULL AUTO_INCREMENT,
                        `username` varchar(50) DEFAULT NULL,
                        `full_name` varchar(100) DEFAULT NULL,
                        `password` varchar(50) DEFAULT NULL,
                        `is_admin` bit(1) DEFAULT NULL,
                        PRIMARY KEY (`id_user`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- my_youtube.video definition

CREATE TABLE `video` (
                         `id_video` int(11) NOT NULL AUTO_INCREMENT,
                         `title` varchar(100) DEFAULT NULL,
                         `duration` bigint(20) DEFAULT NULL,
                         `upload_by` int(11) DEFAULT NULL,
                         PRIMARY KEY (`id_video`),
                         KEY `upload_by` (`upload_by`),
                         CONSTRAINT `video_ibfk_1` FOREIGN KEY (`upload_by`) REFERENCES `user` (`id_user`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

INSERT INTO user (username, full_name, password, is_admin) VALUES
                                                               ('john_doe', 'John Doe', 'password123', 0),
                                                               ('jane_smith', 'Jane Smith', 'secure456', 0),
                                                               ('admin', 'Admin User', 'adminpass', 1),
                                                               ('alex_nguyen', 'Alex Nguyen', 'pass789', 0);


INSERT INTO video (title, duration, upload_by) VALUES
                                                   ('Learn SQL Basics', 900, 1),
                                                   ('Advanced Java Tutorial', 1800, 2),
                                                   ('Funny Cats Compilation', 300, 1),
                                                   ('How to Cook Pho', 1200, 4);


INSERT INTO rate (id_user, id_video, star, is_like) VALUES
                                                        (1, 1, 5, 1),
                                                        (2, 1, 4, 1),
                                                        (2, 2, 5, 1),
                                                        (3, 3, 2, 0),
                                                        (4, 4, 4, 1),
                                                        (1, 2, 3, 1);

#3.1. Liệt kê tất cả video có Duration từ cao => thấp.
select *from video v order by duration desc;


#3.2. Liệt kê video theo dạng
-- 			      id, title, duration, upload_user.
-- 				  1, xvideo1, 1000, fullname của user.

select v.id_video, v.title, v.duration, u.full_name upload_user from video v join `user` u on u.id_user  = v.upload_by;

#3.3. Liệt kê user, và số lượng video upload.
-- 					id, username, fullname, video_upload_total
-- 					1,  huypn, huy pham,     0
-- 					2,  minh, minh pham,     3

select * from video v;
select * from `user` u;

select * from `user` u inner join video v on u.id_user = v.upload_by;

select * from `user` u left join video v on u.id_user = v.upload_by;

select * from `user` u right join video v on u.id_user = v.upload_by;

select u.id_user, u.username, u.full_name, count(v.upload_by) video_upload_total from `user` u inner join video v on u.id_user = v.upload_by group by v.upload_by ;

#3.4 Liệt kê video
-- 			       id, title, rate_avg, total_like, upload_user
-- 				   1,  xvideo1, 2.5,      3, fullname của user.

select v.id_video, v. title, AVG(r.star), SUM(r.is_like), u.full_name upload_user from video v inner join `user` u on v.upload_by = u.id_user
                                                                                               inner join rate r on r.id_video = v.id_video group by v.id_video


select * from rate r inner join video v on r.id_video = v.id_video