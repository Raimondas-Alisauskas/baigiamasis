package com.vcs.examples.spring.model;

import java.util.List;

public interface CarService {

	public Car getCar(int id);

	public List<Car> getAll();

	public Car addCar(Car car);

	public void update(int id, Car car);

	public void remove(int id);

	public List<Car> search(Car car);

}
