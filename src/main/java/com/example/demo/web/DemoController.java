package com.example.demo.web;

import com.example.demo.model.DBUser;
import com.example.demo.model.DemoUser;
import com.example.demo.repository.DemoRepository;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

@Controller
public class DemoController {

    private final DemoRepository demoRepository;

    public DemoController(DemoRepository demoRepository) {
        this.demoRepository = demoRepository;
    }

    @PostMapping(path = "/api/users/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity save(@PathVariable String id, @Valid @RequestBody DemoUser demoUser, BindingResult result) {
        if (result.hasErrors()) {
            return ResponseEntity.badRequest().build();
        }

        demoRepository.save(DBUser.builder()
                .id(id)
                .timestamp(System.currentTimeMillis())
                .demoUser(demoUser)
                .build());

        return ResponseEntity.ok().build();
    }
}
