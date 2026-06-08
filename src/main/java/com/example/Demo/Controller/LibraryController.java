package com.example.Demo.Controller;

import com.example.Demo.Service.LibraryManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {
    @Autowired
    private LibraryManager libraryManager;

    @DeleteMapping("/members/{memberId}")
    public String deleteMember(@PathVariable String memberId) {

        boolean deleted = libraryManager.deleteMemberById(memberId);

        if (deleted) {
            return "Member deleted successfully";
        }

        return "Member not found";
    }

}
