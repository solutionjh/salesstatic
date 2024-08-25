package com.nice.salesstatic.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.ToString;

@ToString(includeFieldNames=true)
@AllArgsConstructor
@Data public class Maintenance {
    @NonNull private final String customerId;
    @NonNull private final String solutionName;
    @NonNull private final LocalDate startDate;
    private final String area;
    private final LocalDate endDate;
    private final String mainAccountManager;
    private final String subAccountManager;
}
