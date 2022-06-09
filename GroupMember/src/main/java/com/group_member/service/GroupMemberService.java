package com.group_member.service;

import com.group_member.validation.Validation;
import com.group_member.GroupMemberRepository.GroupMemberRepository;
import com.group_member.model.GroupMember;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class GroupMemberService {
    @Autowired
    GroupMemberRepository groupMemberRepository;
    @Autowired
    Validation validation;
    public String removeGroupMember(GroupMember receivedGroupMember){
        GroupMember groupMember = groupMemberRepository.fetchGroupMember(receivedGroupMember.getUserId());
        Date date = new Date();
        groupMember.setUpdatedDate(date);
        groupMember.setActive(false);
        groupMemberRepository.save(groupMember);
        return "Member removed Successfully";
    }
    public String addUserInGroup(GroupMember receivedGroupMember){
            if(validation.checkGroupMemberEntry(receivedGroupMember)){
                GroupMember groupMember = new GroupMember();
                groupMember.setGroupId(receivedGroupMember.getGroupId());
                groupMember.setUserId(receivedGroupMember.getUserId());
                groupMember.setActive(true);
                Date date = new Date();
                groupMember.setJoinedOn(date);
                groupMember.setCreatedDate(date);
                groupMember.setUpdatedDate(date);
                groupMemberRepository.save(groupMember);
                return "User Saved";
            }
            return "User id and Group should not be Zero or empty";

    }
}
