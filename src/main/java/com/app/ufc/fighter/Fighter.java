package com.app.ufc.fighter;

public class Fighter {
  public Fighter() {
  }
  public Fighter(Long id, String name, String weight_class) {
    this.id = id;
    this.name = name;
    this.weight_class = weight_class;
  }
  private Long id;
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  private String name;
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  private String weight_class;
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
