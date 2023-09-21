package com.sih.water_management.Image;

import jakarta.persistence.*;

@Entity
@Table
public class Image {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "image_sequence"
    )
    private Long imageId;

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user1_sequence"
    )
    private Long userId;

    private Report reportId;
}
