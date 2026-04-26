package com.divvy.backend.service;

import com.divvy.backend.model.ExpenseGroups;
import com.divvy.backend.repository.GroupRepository;
import org.springframework.stereotype.Service;

@Service
public class GroupService {

    private final GroupRepository groupRepository;

    public GroupService(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    public ExpenseGroups createExpenseGroup(ExpenseGroups expenseGroups){
        if(groupRepository.existsByGroupName(expenseGroups.getGroupName())){
            throw new RuntimeException("User already exist");
        }

        return groupRepository.save(expenseGroups);
    }
}
