package com.example.Demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class RegistrationController {
    @Autowired
    private RegistrationService registrationService;

    @DeleteMapping("/registrations")
    public BulkDeleteResponse deleteRegistrations(
            @RequestParam String ids) {

        List<Integer> idList = Arrays.stream(ids.split(","))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        return registrationService.deleteMultipleByIds(idList);
    }

    @GetMapping("/registrations")
    public Object getRegistrations() {
        return registrationService.getAllRegistrations();
    }

}
