package com.group_member.validation;

import com.group_member.model.GroupMember;
import org.springframework.stereotype.Component;

@Component
public class Validation {
    public boolean checkGroupMemberEntry(GroupMember groupMember) {
        if(groupMember.getGroupId() == 0 && groupMember.getUserId() == 0){
            return false;
        }
        else {
            return true;
        }
    }
}
