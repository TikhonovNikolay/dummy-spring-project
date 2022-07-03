package org.example.entity;

import com.google.cloud.spring.data.spanner.core.mapping.Column;
import com.google.cloud.spring.data.spanner.core.mapping.PrimaryKey;
import com.google.cloud.spring.data.spanner.core.mapping.Table;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
@Table(name = "InfluencerStuff")
public class InfluencerStuff {
    @PrimaryKey(keyOrder = 1)
    @Column(name = "InfluencerUsername")
    String influencerUsername;

    @PrimaryKey(keyOrder = 2)
    @Column(name = "StuffUsername")
    String stuffUsername;

    @Column(name = "Email")
    String email;

    @Column(name = "DisplayName")
    String displayName;

    @Column(name = "Role")
    String role;

    @Column(name = "Authorities")
    List<String> authorities;
}
