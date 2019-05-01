package space.micronaut.controller;

import io.micronaut.context.annotation.Context;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import space.micronaut.domain.Ship;
import space.micronaut.service.ShipService;

import javax.inject.Inject;
import java.util.List;

@Controller
@Context
public class ShipController {

  @Inject
  ShipService shipService;

  @Get("/ships")
  public List<Ship> ships() {
    return shipService.getShips();
  }
}
