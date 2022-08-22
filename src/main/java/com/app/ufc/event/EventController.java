package com.app.ufc.event;

import com.ftpix.sherdogparser.exceptions.SherdogParserException;
import com.ftpix.sherdogparser.models.Event;
import com.ftpix.sherdogparser.models.Fight;
import com.ftpix.sherdogparser.models.Fighter;
import com.ftpix.sherdogparser.models.Organization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

@RestController
public class EventController {

    private final EventService eventService;

    @Autowired
    public EventController(EventService eventService) {
        this.eventService = eventService;
    }


    @RequestMapping(path = "api/v1/events")
    public List<Organization> getEvents() throws IOException, ParseException, SherdogParserException {
        return eventService.getEvents();
    }

    @RequestMapping(path = "api/v1/events/{id}")
    public List <Event> getEvent(@PathVariable("id") int id) throws IOException, ParseException, SherdogParserException {
        return eventService.getEvent(id);
    }

    @RequestMapping(path = "api/v1/events/{eventId}/{fightId}")
    public List <Fight> getFight(@PathVariable("eventId") int eventId, @PathVariable("fightId") int fightId) throws IOException, ParseException, SherdogParserException {
        return eventService.getFight(eventId, fightId);
    }

    @RequestMapping(path ="api/v1/events/{eventId}/{fightId}/{fightIndex}")
    public List <Fighter> getFighter(@PathVariable("eventId") int eventId, @PathVariable("fightId") int fightId, @PathVariable("fightIndex") int fightIndex) throws IOException, ParseException, SherdogParserException {
        return eventService.getFighter(eventId, fightId, fightIndex);
    }

}
