package com.example.tv4;

import java.util.ArrayList;
import java.util.List;

public final class VideoList {
    public static final String VIDEO_CATEGORY[] = {
            "Bayi",
            "Bocil",
            "Kids",
    };

    private static List<Video> list;
    private static long count = 0;

    public static List<Video> getList() {
        if (list == null) {
            list = setupVideos();
        }
        return list;
    }

    public static List<Video> setupVideos() {
        list = new ArrayList<>();
        String title[] = {
                "Ini Bayi",
                "Ini Bayi Lagi",
                "Intinya Bayi",
        };

        String description = "Peran orang tua sangat berkaitan sekali dengan perkembangan anak "
                + "dari mulai lahir hingga tumbuh kembang dewasa untuk menanamkan moral dan etika, "
                + "juga bekal anak di masa depan yang akan datang. "
                + "Perubahan pola pikir anak pun sebaiknya orang tua selalu mengawasi tumbuh kembangnya, "
                + "sehingga anak mulai terlatih dari kecil untuk melakukan kebiasaan baik di masyarakat. ";
        String videoUrl[] = {
                "https://res.cloudinary.com/dlmjnzi46/video/upload/v1680994036/samples/sea-turtle.mp4",
                "https://res.cloudinary.com/dlmjnzi46/video/upload/v1680994039/samples/elephants.mp4",
                "https://res.cloudinary.com/dlmjnzi46/video/upload/v1680994042/samples/cld-sample-video.mp4",
        };
        String bgImageUrl[] = {
                "https://res.cloudinary.com/dlmjnzi46/image/upload/v1680994030/samples/landscapes/beach-boat.jpg",
                "https://res.cloudinary.com/dlmjnzi46/image/upload/v1680994025/samples/food/pot-mussels.jpg",
                "https://res.cloudinary.com/dlmjnzi46/image/upload/v1680994023/samples/ecommerce/analog-classic.jpg",
        };
        String cardImageUrl[] = {
                "https://res.cloudinary.com/dlmjnzi46/image/upload/v1682540663/images_bhmuho.jpg",
                "https://res.cloudinary.com/dlmjnzi46/image/upload/v1682551928/download_izmpqk.jpg",
                "https://res.cloudinary.com/dlmjnzi46/image/upload/v1682552061/images_jsiyr9.jpg",
        };
        for (int index = 0; index < title.length; ++index) {
            list.add(
                    buildVideoInfo(
                            title[index],
                            description,
                            videoUrl[index],
                            cardImageUrl[index],
                            bgImageUrl[index]));
        }

        return list;
    }

    private static Video buildVideoInfo(
            String title,
            String description,
            String videoUrl,
            String cardImageUrl,
            String backgroundImageUrl) {
        Video video = new Video();
        video.setId(count++);
        video.setTitle(title);
        video.setDescription(description);
        video.setCardImageUrl(cardImageUrl);
        video.setBackgroundImageUrl(backgroundImageUrl);
        video.setVideoUrl(videoUrl);
        return video;
    }
}