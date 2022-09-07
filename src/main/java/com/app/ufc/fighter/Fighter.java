package com.app.ufc.fighter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Fighter {
  @Id
  @SequenceGenerator(
    name = "fighter_sequence",
    sequenceName = "fighter_sequence",
    allocationSize = 1
  )
  @GeneratedValue(
    strategy = GenerationType.SEQUENCE,
    generator = "fighter_sequence"
  )
  private Long id;
  private String name;
  private String weight_class;

  public Fighter() {
  }
  public Fighter(Long id, String name, String weight_class) {
    this.id = id;
    this.name = name;
    this.weight_class = weight_class;
  }
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public Fighter(String name, String weight_class) {
    this.name = name;
    this.weight_class = weight_class;
  }
  public String getWeight_class() {
    return weight_class;
  }
  public void setWeight_class(String weight_class) {
    this.weight_class = weight_class;
  }
}
