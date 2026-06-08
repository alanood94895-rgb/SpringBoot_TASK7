package com.example.Demo.Service;

public class LibraryDemo {
    public static void main(String[] args) {

        LibraryManager manager = new LibraryManager();

        manager.initializeMembers();

        System.out.println("Initial Members:");
        manager.displayMembers();

        String memberIdToDelete = "M102";

        System.out.println("\nDeleting Member ID: " + memberIdToDelete);

        boolean deleted = manager.deleteMemberById(memberIdToDelete);

        if (deleted) {
            System.out.println("Member found and deleted successfully.");
        } else {
            System.out.println("Member not found.");
        }

        System.out.println("\nUpdated Members List:");
        manager.displayMembers();
    }
}

