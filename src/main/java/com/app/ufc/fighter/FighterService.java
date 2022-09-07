package com.app.ufc.fighter;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class FighterService {
  public List<Fighter> getFighters() {
    return List.of(
      new Fighter(
        (long) 1, 
        "bryce", 
        "light weight"
      )
    );
  }
}
