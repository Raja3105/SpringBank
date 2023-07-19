package com.tech.car.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.car.dao.CarDao;
import com.tech.car.entity.Car;

@Service
public class CarService {
	
	
		
		@Autowired //to create object
		CarDao vehDao ; //object creation
		public String addVehicle(Car e) {
	     return  vehDao.addVehicle(e);
	}
}
