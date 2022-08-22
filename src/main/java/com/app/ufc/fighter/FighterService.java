package com.app.ufc.fighter;

import com.ftpix.sherdogparser.Sherdog;
import com.ftpix.sherdogparser.exceptions.SherdogParserException;
import com.ftpix.sherdogparser.models.*;
import com.ftpix.sherdogparser.models.Fighter;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

@Service
public class FighterService {

    Sherdog parser = new Sherdog.Builder().build();
    Organization ufc = parser.getOrganization(Organizations.UFC);

    public FighterService() throws IOException, ParseException, SherdogParserException {
    }

    public List<String> getFighters() {
        return List.of("test");
    }

    public List<Fighter> getFighter() throws IOException, ParseException, SherdogParserException {
        Event ufc1 = parser.getEvent(ufc.getEvents().get(0).getSherdogUrl());
        Fight firstFight = ufc1.getFights().get(0);
        Fighter fighter = parser.getFighter(firstFight.getFighter1().getSherdogUrl());


        return List.of(fighter);
    }
}
