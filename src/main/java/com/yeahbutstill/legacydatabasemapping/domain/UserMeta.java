package com.yeahbutstill.legacydatabasemapping.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Data
@Table(name = "wp_usermeta")
public class UserMeta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "umeta_id")
    private Long id;

    @ManyToOne
    private User user;

    @Size(max = 255)
    @Column(name = "meta_key")
    private String metaKey;

    @Lob
    @Column(name = "meta_value", columnDefinition = "LONGTEXT")
    private String metaValue;

}
