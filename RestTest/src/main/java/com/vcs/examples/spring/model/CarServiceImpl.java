package com.vcs.examples.spring.model;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl implements CarService {

	private static List<Car> cars = new ArrayList<>();
	private static int uniqId = 0;

	@Override
	public Car getCar(int id) {

		for (Car car : cars) {
			if (car.getId().equals(id)) {
				return car;
			}
		}

		throw new RuntimeException("Not found by id: " + id);
	}

	@Override
	public Car addCar(Car car) {

		car.setId(uniqId++);
		cars.add(car);

		return car;
	}

	@Override
	public void update(int id, Car car) {

		Car original = getCar(id);
		if (StringUtils.isNotBlank(car.getName())) {
			original.setName(car.getName());
		}
	}

	@Override
	public void remove(int id) {
		Car car = getCar(id);
		if (!cars.remove(car)) {
			throw new RuntimeException("Can't remove by id: " + id);
		}
	}

	@Override
	public List<Car> search(Car carSearch) {

		List<Car> result = new ArrayList<>();

		for (Car car : cars) {

			if (StringUtils.isNotBlank(carSearch.getName())) {
				if (car.getName().startsWith(carSearch.getName())) {
					result.add(car);
				}
			}
		}

		return result;
	}

	@Override
	public List<Car> getAll() {
		return cars;
	}

}
