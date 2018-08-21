package com.vcs.examples.spring.RestTest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vcs.examples.spring.model.Car;
import com.vcs.examples.spring.model.CarService;

@RestController
@RequestMapping("/car")
public class CarController {

	@Autowired
	private CarService service;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Car carGet(@PathVariable("id") int id) {
		return service.getCar(id);
	}

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<Car> getAll() {
		return service.getAll();
	}

	@RequestMapping(value = "/", method = RequestMethod.PUT)
	public Car addCar(@RequestBody Car car) {
		return service.addCar(car);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Void> update(@PathVariable("id") int id, @RequestBody Car car) {

		service.update(id, car);

		return ResponseEntity.ok().build();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> remove(@PathVariable("id") int id) {

		service.remove(id);

		return ResponseEntity.ok().build();
	}

	@RequestMapping(value = "/search/name/{name}", method = RequestMethod.POST)
	public ResponseEntity<List<Car>> searchByName(@PathVariable("name") String nameSearch) {

		List<Car> result = service.search(new Car(null, nameSearch));
		if (result.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		} else {
			return ResponseEntity.accepted().body(result);
		}

	}

	@RequestMapping(value = "/search", method = RequestMethod.POST)
	public List<Car> searchByName(@RequestBody Car car) {
		return service.search(car);
	}

}
