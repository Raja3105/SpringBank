package com.tech.car.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tech.car.entity.Car;
import com.tech.car.service.CarService;

public class CarController {
	
	@RestController
	public class VehicleController {
		@Autowired //To create the object
		CarService vehSer; //object creation
		@PostMapping(value="/insertVehicle")
		public String addVehicle(@RequestBody Car e) {
			return vehSer.addVehicle(e);
		}

	}

}
