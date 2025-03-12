package com.eazybytes.eazyschool.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class BaseEntity {
    private LocalDate createdAt;
    private String createdBy;
    private LocalDate updatedAt;
    private String updatedBy;
}
