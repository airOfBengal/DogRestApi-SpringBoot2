package com.udacity.jwdnd.course2.dogrestapi.service;

import com.udacity.jwdnd.course2.dogrestapi.entity.Dog;

import java.util.List;

public interface DogService {
    List<Dog> retrieveDogs();
    List<String> retrieveDogBreed();
    String retrieveDogBreedById(Long id);
    List<String> retrieveDogNames();
}
