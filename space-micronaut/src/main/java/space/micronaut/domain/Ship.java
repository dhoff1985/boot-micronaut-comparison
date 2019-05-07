package space.micronaut.domain;

import io.micronaut.core.annotation.Introspected;

@Introspected
public class Ship {
  private String name;
  private String captain;
  private Location location;

  public Ship(String name, String captain, Location location) {
    this.name = name;
    this.captain = captain;
    this.location = location;
  }

  public String getName() {
    return name;
  }

  public String getCaptain() {
    return captain;
  }

  public Location getLocation() {
    return location;
  }
}
