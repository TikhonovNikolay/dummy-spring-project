package org.example.repository;

import com.google.cloud.spring.data.spanner.repository.SpannerRepository;
import org.example.entity.Influencer;

public interface InfluencerRepository extends SpannerRepository<Influencer, String> {
}
