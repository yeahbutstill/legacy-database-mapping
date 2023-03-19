package com.yeahbutstill.legacydatabasemapping.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "wp_usermeta")
public class UserMeta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "umeta_id")
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "meta_key")
    private String metaKey;

    @Lob
    @Column(name = "meta_value", columnDefinition = "LONGTEXT")
    private String metaValue;

}
