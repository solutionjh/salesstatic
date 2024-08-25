package com.nice.salesstatic.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.ToString;

@ToString(includeFieldNames=true)
@AllArgsConstructor
@Data public class Solution {
    @NonNull private final String solutionName;
    @NonNull private final String company;
    @NonNull private final String solutionGb;
}
