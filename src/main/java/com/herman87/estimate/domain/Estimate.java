package com.herman87.estimate.domain;

import java.util.ArrayList;
import java.util.List;

public class Estimate {
    private String title;
    private String description;
    List<EstimateLine> estimateLines = new ArrayList<>();
    private Client client;
}
