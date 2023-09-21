package com.sih.water_management.Description;

import com.sih.water_management.Report.Report;
import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table
public class Description {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "description_sequence"
    )
    private Long descriptionId;
    @OneToOne
    private Report reportId;
    private String issueContent;

    public Description() {}

    public Description(Long descriptionId, String issueContent) {
        this.descriptionId = descriptionId;
        this.issueContent = issueContent;
    }
}
