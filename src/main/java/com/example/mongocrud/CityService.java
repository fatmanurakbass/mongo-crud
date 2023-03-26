package com.example.mongocrud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {
    @Autowired
    private CityRepository cityRepository;
    public List<City> allCities(){
        return cityRepository.findAll();
    }
}
