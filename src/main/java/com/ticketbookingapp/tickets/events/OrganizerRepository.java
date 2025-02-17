package com.ticketbookingapp.tickets.events;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class OrganizerRepository {
    private final List<Organizer> organizers  = List.of(
        new Organizer(101, "Globamantics", "Globamantics Technology Corporation"),
        new Organizer(102, "Carved Rock", "Carved Rock Space Equipments")
    );

    public List<Organizer> findAll() {
        return organizers;
    }
}
