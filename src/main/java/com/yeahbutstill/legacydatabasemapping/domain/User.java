package com.yeahbutstill.legacydatabasemapping.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.hibernate.validator.constraints.URL;

import java.sql.Timestamp;
import java.util.Set;

@Entity
@Table(name = "wp_users", indexes = {
        @Index(name = "user_login_key", columnList = "user_login"),
        @Index(name = "user_nicename", columnList = "user_nicename"),
        @Index(name = "user_email", columnList = "user_email")
})
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_login")
    @Size(max = 60)
    @NotNull
    private String login;

    @Column(name = "user_pass")
    @Size(max = 255)
    @NotNull
    private String password;

    @Column(name = "user_nicename")
    @Size(max = 50)
    @NotNull
    private String nicename;

    @Email
    @NotNull
    @Size(max = 100)
    @Column(name = "user_email")
    private String email;

    @URL
    @NotNull
    @Size(max = 100)
    @Column(name = "user_url")
    private String url;

    @NotNull
    @Column(name = "user_registered")
    private Timestamp registerd;

    @NotNull
    @Size(max = 255)
    @Column(name = "user_activation_key")
    private String activationKey;

    @NotNull
    @Column(name = "user_status")
    private Integer status;

    @NotNull
    @Size(max = 250)
    @Column(name = "display_name")
    @Basic(optional = false)
    private String displayName;

    @OneToMany
    @JoinColumn(name = "user_id")
    private Set<UserMeta> userMetaSet;

    @OneToMany(mappedBy = "user")
    private Set<Comment> comments;

}
