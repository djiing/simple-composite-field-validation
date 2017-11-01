package com.example.demo.model;

import com.example.demo.validation.MatchingLanguage;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MatchingLanguage
public class DemoUser {

    @NotNull
    private String name;
    private String baseLanguage;
    private List<String> languages;
}
