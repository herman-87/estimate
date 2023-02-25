package com.herman87.estimate.domain;

import java.util.ArrayList;
import java.util.List;

public class Organization extends Client{
    private String name;
    private String taxIdentifier;
    List<Person> representatives = new ArrayList<>();
}
