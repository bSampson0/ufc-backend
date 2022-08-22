package com.app.ufc.event;

import com.ftpix.sherdogparser.Sherdog;
import com.ftpix.sherdogparser.exceptions.SherdogParserException;
import com.ftpix.sherdogparser.models.*;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

@Service
public class EventService {
    Sherdog parser = new Sherdog.Builder().build();
    Organization ufc = parser.getOrganization(Organizations.UFC);

    Event event = new Event();

    public EventService() throws IOException, ParseException, SherdogParserException {
    }
    @Cacheable("events")
    public List<Organization> getEvents() {
        return List.of(ufc);
    }

    @Cacheable("event")
    public List<Event> getEvent(int id) throws IOException, ParseException, SherdogParserException {
        event = parser.getEvent(ufc.getEvents().get(id).getSherdogUrl());
        return List.of(event);
    }

    @Cacheable("fight")
    public List<Fight> getFight(int eventId, int fightId) throws IOException, ParseException, SherdogParserException {
        if (event != null) {
            event = parser.getEvent(ufc.getEvents().get(eventId).getSherdogUrl());
        }
        Fight fight = event.getFights().get(fightId);
        return List.of(fight);
    }

    @Cacheable("fighter")
    public List<Fighter> getFighter(int eventId, int fightId, int fightIndex) throws IOException, ParseException, SherdogParserException {
        Event event = parser.getEvent(ufc.getEvents().get(eventId).getSherdogUrl());
        Fight fight = event.getFights().get(fightId);
        Fighter fighter;
        if (fightIndex == 1) {
            fighter = parser.getFighter(fight.getFighter1().getSherdogUrl());
        }
        else {
            fighter = parser.getFighter(fight.getFighter2().getSherdogUrl());
        }
        return List.of(fighter);
    }
}
