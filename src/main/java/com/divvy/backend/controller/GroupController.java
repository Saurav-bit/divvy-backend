package com.divvy.backend.controller;

import com.divvy.backend.model.ExpenseGroups;
import com.divvy.backend.model.User;
import com.divvy.backend.service.GroupService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/group")
public class GroupController {
    private final GroupService groupService;

    public GroupController(GroupService groupService) {
        this.groupService = groupService;
    }


    @PostMapping
    public ExpenseGroups createGroup(@RequestBody ExpenseGroups expenseGroups){
        return groupService.createExpenseGroup(expenseGroups);
    }

}
