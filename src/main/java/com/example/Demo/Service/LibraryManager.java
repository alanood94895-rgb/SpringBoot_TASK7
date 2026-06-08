package com.example.Demo.Service;

import com.example.Demo.Entities.LibraryMember;

import java.util.ArrayList;

public class LibraryManager {
    private ArrayList<LibraryMember> members = new ArrayList<>();

    public void initializeMembers() {

        members.add(new LibraryMember("M101", "Ahmed", "Standard"));
        members.add(new LibraryMember("M102", "Sara", "Premium"));
        members.add(new LibraryMember("M103", "John", "Standard"));
    }

    public void addMember(LibraryMember member) {
        members.add(member);
    }

    public void displayMembers() {

        for (LibraryMember member : members) {

            System.out.println(
                    member.getMemberId() + " - " +
                            member.getFullName() + " - " +
                            member.getMembershipType());
        }
    }

    public boolean deleteMemberById(String memberId) {

        for (int i = 0; i < members.size(); i++) {

            if (members.get(i).getMemberId().equals(memberId)) {

                members.remove(i);
                return true;
            }
        }

        return false;
    }
}