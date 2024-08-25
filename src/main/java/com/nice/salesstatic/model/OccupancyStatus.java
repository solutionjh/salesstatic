package com.nice.salesstatic.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.ToString;

/**
 * 
 */
@ToString(includeFieldNames=true)
@AllArgsConstructor
@Data public class OccupancyStatus {
    @NonNull private final String customerId;
    @NonNull private final String solutionName;
    @NonNull private final String area;
    private String winBackYN;
    private String solutionVersion;
    private String licenseInfo;
    private String etc;
}
