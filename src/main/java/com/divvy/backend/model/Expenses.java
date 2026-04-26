package com.divvy.backend.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Getter
@Setter
public class Expenses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "group_id")
    private Long groupId;


    @Column(name = "paid_by")
    private Long paidBy;


    private Long amount;

    private String description;


    @Column(name = "created_at")
    @CreationTimestamp
    private LocalDateTime createdAt;

}
