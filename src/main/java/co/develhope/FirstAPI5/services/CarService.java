package co.develhope.FirstAPI5.services;

import co.develhope.FirstAPI5.DTO.CarDTO;
import org.springframework.stereotype.Service;

/**
 * @author Tania Ielpo
 */

@Service

public class CarService {


    public void showMessage(CarDTO car) {
        System.out.println(car.toString());
    }
}
