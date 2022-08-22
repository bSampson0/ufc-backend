package com.app.ufc.repository;

import com.app.ufc.fighter.Fighter;
import org.springframework.data.repository.CrudRepository;

public interface FighterRepository extends CrudRepository<Fighter, Long> {
}
