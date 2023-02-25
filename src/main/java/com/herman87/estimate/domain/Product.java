package com.herman87.estimate.domain;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private String name;
    private String description;
    private final List<EstimateLine> estimateLines = new ArrayList<>();
}
