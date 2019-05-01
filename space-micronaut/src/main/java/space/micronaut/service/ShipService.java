package space.micronaut.service;

import io.micronaut.context.annotation.Context;
import space.micronaut.domain.Location;
import space.micronaut.domain.Ship;

import java.util.ArrayList;
import java.util.List;

@Context
public class ShipService {

  private List<Ship> ships;

  public ShipService() {
    ships = new ArrayList<>();
    ships.add(new Ship("firefly", "Malcom Reynolds", new Location(100, 200, 300)));
    ships.add(new Ship("Planet Express", "Leela", new Location(450, 550, 650)));
  }

  public List<Ship> getShips() {
    return ships;
  }
}
