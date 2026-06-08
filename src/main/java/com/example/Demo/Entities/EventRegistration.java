package com.example.Demo.Entities;

public class EventRegistration {
    private int registrationId;
    private String attendeeName;

    public EventRegistration(int registrationId, String attendeeName) {
        this.registrationId = registrationId;
        this.attendeeName = attendeeName;
    }

    public int getRegistrationId() {
        return registrationId;
    }

    public String getAttendeeName() {
        return attendeeName;
    }
}
