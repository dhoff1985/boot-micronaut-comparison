package com.dthoffman.spaceboot.controller;

import com.dthoffman.spaceboot.domain.Ship;
import com.dthoffman.spaceboot.service.ShipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ShipController {

  @Autowired
  ShipService shipService;


  @GetMapping("/ships")
  @ResponseBody
  public List<Ship> ships() {
    return shipService.getShips();
  }


}
