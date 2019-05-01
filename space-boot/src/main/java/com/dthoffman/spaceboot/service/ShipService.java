package com.dthoffman.spaceboot.service;


import com.dthoffman.spaceboot.domain.Location;
import com.dthoffman.spaceboot.domain.Ship;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
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
