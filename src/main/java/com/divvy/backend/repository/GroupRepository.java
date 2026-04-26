package com.divvy.backend.repository;

import com.divvy.backend.model.ExpenseGroups;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<ExpenseGroups, Long> {
    boolean existsByGroupName(String groupName);

}
