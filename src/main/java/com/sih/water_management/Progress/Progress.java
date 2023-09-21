package com.sih.water_management.Progress;

import com.sih.water_management.Report.Report;
import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@Entity
@Table
public class Progress {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "progress_sequence"
    )
    private Long progressId;
    private LocalDate issueDate;
    private LocalDate verificationDate;
    private LocalDate actionDate;
    private LocalDate completionDate;
    @OneToOne
    private Report reportId;

    public Progress() {}

    public void setProgressId(Long progressId) {
        this.progressId = progressId;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public void setVerificationDate(LocalDate verificationDate) {
        this.verificationDate = verificationDate;
    }

    public void setActionDate(LocalDate actionDate) {
        this.actionDate = actionDate;
    }

    public void setCompletionDate(LocalDate completionDate) {
        this.completionDate = completionDate;
    }
}
