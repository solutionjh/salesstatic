package com.nice.salesstatic.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.ToString;

@ToString(includeFieldNames=true)
@AllArgsConstructor
@Data public class Contract {
    @NonNull private final String customerId;
    @NonNull private final String solutionName;
    @NonNull private final String projectName;
    @NonNull private final Long contractAmt;
    @NonNull private final LocalDate contractStartDate;
    @NonNull private final LocalDate contractEndDate;
    @NonNull private final String contractYear;
    @NonNull private final String contractMonth;
    @NonNull private final Integer contractPeriod;
    private final String contractGB;
    private final String etc;
}
