package com.example.Demo.Entities;

public class LibraryMember {
    private String memberId;
    private String fullName;
    private String membershipType;

    public LibraryMember(String memberId, String fullName, String membershipType) {
        this.memberId = memberId;
        this.fullName = fullName;
        this.membershipType = membershipType;
    }

    public String getMemberId() {
        return memberId;
    }

    public String getFullName() {
        return fullName;
    }

    public String getMembershipType() {
        return membershipType;
    }
}
