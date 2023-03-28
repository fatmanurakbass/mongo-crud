package com.example.mongocrud;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CityService {
    @Autowired
    private CityRepository cityRepository;
    public List<City> allCities(){
        return cityRepository.findAll();
    }

    public Optional<City> city(ObjectId id){
        return cityRepository.findById(id);
    }
}
