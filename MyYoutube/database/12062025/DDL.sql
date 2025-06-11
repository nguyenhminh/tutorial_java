
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