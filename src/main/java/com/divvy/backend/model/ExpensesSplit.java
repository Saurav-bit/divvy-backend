package com.divvy.backend.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "expenses_split")
public class ExpensesSplit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "expense_id")
    private Long expenseId;

    @Column(name = "user_id")
    private Long user_id;


    @Column(name = "amount_owned")
    private Long amountOwned;

}
