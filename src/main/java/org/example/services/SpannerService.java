package org.example.services;

import org.example.entity.Influencer;
import org.example.entity.InfluencerStuff;
import org.example.repository.InfluencerRepository;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

@Service
public class SpannerService {
    private final InfluencerRepository repository;

    public SpannerService(InfluencerRepository repository) {
        this.repository = repository;
    }

    @Scheduled(fixedDelay = 2L, initialDelay = 2L, timeUnit = TimeUnit.SECONDS)
    public void tick() {
        int i = ThreadLocalRandom.current().nextInt();
        String influencerUsername = "name" + i;
        InfluencerStuff stuff = new InfluencerStuff(
                influencerUsername,
                "stuff" + i,
                "email",
                "staff" + i,
                "ADMIN",
                List.of("create", "update", "delete")
        );
        Influencer influencer = new Influencer(
                influencerUsername,
                "testmail",
                "testname" + i,
                "url",
                "background",
                List.of(stuff)
        );
        repository.save(influencer);
    }
}
