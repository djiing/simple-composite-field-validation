package com.example.demo.model;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class DBUser {

    private String id;
    private long timestamp;
    private DemoUser demoUser;
}
