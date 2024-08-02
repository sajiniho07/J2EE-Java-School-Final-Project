package org.example.carselect.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.carselect.entity.Car;
import org.example.carselect.repository.CarRepository;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class CarService {

    private final CarRepository carRepository;

    public Car getCarById(Long id) {
        return carRepository.findById(id).orElse(null);
    }
}
