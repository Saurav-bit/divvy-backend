package com.divvy.backend.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "settlements")
public class Settlements {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name= "group_id")
    private Long groupId;

    @Column(name= "paidBy")
    private Long paidby;

    @Column(name= "paidTo")
    private Long paidTo;


    @Column(name = "created_at")
    @CreationTimestamp
    private LocalDateTime createdAt;

    private Long amount;
}
