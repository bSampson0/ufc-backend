package com.app.ufc.fighter;

import com.ftpix.sherdogparser.exceptions.SherdogParserException;
import com.ftpix.sherdogparser.models.Fighter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

@RestController
public class FighterController {

    private final FighterService fighterService;

    public FighterController(FighterService fighterService) {
        this.fighterService = fighterService;
    }

    @RequestMapping(path = "api/v1/fighters")
    public List<String> getFighters() {
        return fighterService.getFighters();
    }

    @RequestMapping(path ="api/v1/fighter")
    public List<Fighter> getFighter() throws IOException, ParseException, SherdogParserException {
        return fighterService.getFighter();
    }
}
