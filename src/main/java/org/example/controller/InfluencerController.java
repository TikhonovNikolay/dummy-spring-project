package org.example.controller;

import com.google.common.collect.ImmutableList;
import lombok.RequiredArgsConstructor;
import org.example.entity.Influencer;
import org.example.repository.InfluencerRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class InfluencerController {
    private final InfluencerRepository repository;

    @GetMapping("/influencers")
    public List<Influencer> getAll() {
        return ImmutableList.copyOf(repository.findAll());
    }
}
