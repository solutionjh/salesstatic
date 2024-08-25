package com.nice.salesstatic.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.ToString;

@ToString(includeFieldNames=true)
@AllArgsConstructor
@Data public class Customer {
    @NonNull private final String industryCode;
    @NonNull private final String customerId;
    private String customerName;

}
