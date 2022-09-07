package com.app.ufc.fighter;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FighterController {

  private final FighterService fighterService;

  @Autowired
  public FighterController(FighterService fighterService) {
    this.fighterService = fighterService;
  }
  
  @RequestMapping(path = "api/v1/fighters")
  public List<Fighter> getFighters() {
    return fighterService.getFighters();
  }
}
