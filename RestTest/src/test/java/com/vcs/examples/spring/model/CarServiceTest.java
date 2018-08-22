package com.vcs.examples.spring.model;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class CarServiceTest {

	private CarService service;

	@Before
	public void init() {
		service = new CarServiceImpl();
	}

	@Test(expected = RuntimeException.class)
	public void getCarEmptyTest() {
		service.getCar(0);
	}

	@Test
	public void getCarTest() {
		Car car1 = service.addCar(new Car(null, "iuewyriew"));
		Car car2 = service.getCar(car1.getId());

		assertEquals(car1, car2);

	}

	@Test
	public void getCarOnlyOneTest() {

		Car car1 = service.addCar(new Car(null, "iuewyriew"));
		List<Car> cars = service.getAll();

		assertEquals(1, cars.size());
		assertEquals(car1, cars.get(0));

	}

}
