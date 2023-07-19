package com.tech.car.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tech.car.entity.Car;
import com.tech.car.repository.CarRepository;

@Repository
public class CarDao {
	
	@Autowired
	CarRepository vehDao; //object creation
	public String addVehicle(Car e) {
		vehDao.save(e);
		return "Successfully saved";
	}

}
