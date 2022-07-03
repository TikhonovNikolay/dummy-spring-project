package org.example.entity;

import com.google.cloud.spring.data.spanner.core.mapping.Column;
import com.google.cloud.spring.data.spanner.core.mapping.Interleaved;
import com.google.cloud.spring.data.spanner.core.mapping.PrimaryKey;
import com.google.cloud.spring.data.spanner.core.mapping.Table;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
@Table(name = "Influencers")
public class Influencer {
    @PrimaryKey
    @Column(name = "InfluencerUsername")
    String influencerUsername;

    @Column(name = "Email")
    String email;

    @Column(name = "DisplayName")
    String displayName;

    @Column(name = "AvatarImgUrl")
    String avatarImgUrl;

    @Column(name = "BackgroundImgUrl")
    String backgroundImgUrl;

    @Interleaved
    List<InfluencerStuff> albums;
}
