package com.example.Demo.Service;

import com.example.Demo.Entities.BulkDeleteResponse;
import com.example.Demo.Entities.EventRegistration;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RegistrationService {

    private Map<Integer, EventRegistration> registrations =
            new HashMap<>();

    @PostConstruct
    public void initializeData() {

        registrations.put(101, new EventRegistration(101, "Ahmed"));

        registrations.put(102, new EventRegistration(102, "Sara"));

        registrations.put(103, new EventRegistration(103, "John"));

        registrations.put(104, new EventRegistration(104, "Ali"));

        registrations.put(105, new EventRegistration(105, "Fatima"));
    }

    public BulkDeleteResponse deleteMultipleByIds(List<Integer> ids) {

        List<Integer> deletedIds = new ArrayList<>();
        List<Integer> notFoundIds = new ArrayList<>();

        for (Integer id : ids) {

            if (registrations.containsKey(id)) {

                registrations.remove(id);
                deletedIds.add(id);

            } else {

                notFoundIds.add(id);
            }
        }

        return new BulkDeleteResponse(
                ids.size(),
                deletedIds.size(),
                deletedIds,
                notFoundIds
        );
    }

    public Map<Integer, EventRegistration> getAllRegistrations() {
        return registrations;
    }
}

