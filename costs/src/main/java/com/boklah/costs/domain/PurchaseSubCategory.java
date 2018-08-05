package com.boklah.costs.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 */
@Data
@Document
public class PurchaseSubCategory {

    @Id
    private String id;

    private String name;

    private PurchaseCategory category;
}
