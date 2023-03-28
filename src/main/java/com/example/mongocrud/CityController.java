package com.example.mongocrud;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/cities")
public class CityController {
    @Autowired
    private CityService cityService;
    @GetMapping
    public ResponseEntity<List<City>> getAllCities(){
        return new ResponseEntity<List<City>>(cityService.allCities(), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<City>> getCityById(@PathVariable ObjectId id){
        return new ResponseEntity<Optional<City>>(cityService.city(id), HttpStatus.OK);
    }

}
