package com.sih.water_management.Image;

import com.sih.water_management.Report.Report;
import jakarta.persistence.*;

import java.sql.Blob;

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
    @OneToOne
    private Report reportId;
    @Lob
    private Blob image;
}
