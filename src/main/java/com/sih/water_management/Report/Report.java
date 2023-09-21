package com.sih.water_management.Report;

import com.sih.water_management.Description.Description;
import com.sih.water_management.Image.Image;
import com.sih.water_management.Progress.Progress;
import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table
public class Report {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "report_sequence"
    )
    private Long reportId;
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user2_sequence"
    )
    private Long userId;

    @OneToOne
    private Image image;
    @OneToOne
    private Description description;
    @OneToOne
    private Progress progress;

}
