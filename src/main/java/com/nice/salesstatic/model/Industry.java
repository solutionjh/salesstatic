package com.nice.salesstatic.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.ToString;

@ToString(includeFieldNames=true)
@AllArgsConstructor
@Data public class Industry {
    @NonNull private final String industryCode;
    private String industryName;
}
