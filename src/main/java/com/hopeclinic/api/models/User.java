package com.hopeclinic.api.models;
import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "document_number", length = 8, nullable = false, unique = true)
    private String documentNumber;

    @Column(name = "name", length = 100, nullable = false)
    private String name;

    @Column(name = "last_name", length = 100, nullable = false)
    private String lastName;

    @Column(name = "last_name2", length = 100, nullable = false)
    private String lastName2;

    @Column(name = "email", length = 100, nullable = false, unique = true)
    private String email;

    @Column(name = "phone", length = 20, nullable = true)
    private String phone;

    @Column(name = "mobile_phone", length = 20, nullable = true)
    private String mobilePhone;

    @Column(name = "password_hash", length = 255, nullable = false)
    private String passwordHash;

    @Enumerated(EnumType.STRING)
    @Column(name = "role", nullable = false)
    private UserRole role;

    @Column(name = "profile_picture_url", length = 255, nullable = true)
    private String profilePictureUrl;

    @Column(name = "created_at", nullable = true, updatable = false)
    @CreationTimestamp
    private java.sql.Timestamp createdAt;

    @ManyToOne
    @JoinColumn(name = "specialty_id", nullable = true)
    private Specialty specialty;

    @Column(name = "document_type", length = 50, nullable = true)
    private String documentType;

    @Column(name = "birthdate", nullable = true)
    private java.sql.Date birthdate;

    @Column(name = "gender", length = 20, nullable = true)
    private String gender;

    @Column(name = "marital_status", length = 20, nullable = true)
    private String maritalStatus;

    @Column(name = "domicile_street", length = 255, nullable = true)
    private String domicileStreet;
}
