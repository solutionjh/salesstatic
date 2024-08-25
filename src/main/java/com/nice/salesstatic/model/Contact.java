package com.nice.salesstatic.model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.ToString;

@ToString(includeFieldNames=true)
@AllArgsConstructor
@Data public class Contact {
    @NonNull private final String customerId;
    @NonNull private final String contactName;
    @NonNull private final String solutionName;
    private final String position;
    private final String area;
    private final String workGB;
    private final String officeNumber;
    private final String phoneNumber;
    private final String email;
    private final long lastSurvey;
    private final LocalDateTime lastUpdate;
}
