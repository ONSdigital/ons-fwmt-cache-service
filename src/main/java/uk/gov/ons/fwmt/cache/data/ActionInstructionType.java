package uk.gov.ons.fwmt.cache.data;

public enum ActionInstructionType {
  CANCEL("Cancel"),
  CREATE("Create"),
  UPDATE("Update");

  public final String name;

  ActionInstructionType(String name) {
    this.name = name;
  }

  @Override public String toString() {
    return name;
  }
}
