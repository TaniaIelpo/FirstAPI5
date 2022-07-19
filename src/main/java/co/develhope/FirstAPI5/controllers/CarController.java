package co.develhope.FirstAPI5.controllers;

import co.develhope.FirstAPI5.DTO.CarDTO;
import co.develhope.FirstAPI5.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

/**
 * @author Tania Ielpo
 */

@RestController
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping
    public CarDTO newCar(@RequestParam String id,
                         @RequestParam String model,
                         @RequestParam (required = false) Double price){
        return new CarDTO(id, model, price);
    }

    @PostMapping
    public ResponseEntity<String> postRequest(@Valid @RequestBody CarDTO car){
            carService.showMessage(car);
            return new ResponseEntity<String>("Created", HttpStatus.OK);
    }

}
