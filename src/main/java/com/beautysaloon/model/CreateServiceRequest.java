package com.beautysaloon.model;

import lombok.Data;
import java.math.BigDecimal;

@Data
public class CreateServiceRequest {
    private String serviceType;
    private BigDecimal price;
}
