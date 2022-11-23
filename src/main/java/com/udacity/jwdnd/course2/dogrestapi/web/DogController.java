package com.udacity.jwdnd.course2.dogrestapi.web;

import com.udacity.jwdnd.course2.dogrestapi.entity.Dog;
import com.udacity.jwdnd.course2.dogrestapi.service.DogService;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@ApiResponses(value = {
        @ApiResponse(code = 400, message = "This is a bad request."),
        @ApiResponse(code = 401, message = "Due to security constraints, your access request cannot be authorized."),
        @ApiResponse(code = 500, message = "The server is down.")
})
public class DogController {
    private DogService dogService;

    @Autowired
    public void setDogService(DogService dogService){
        this.dogService = dogService;
    }

    @GetMapping("/dogs")
    public ResponseEntity<List<Dog>> getAllDogs(){
        List<Dog> dogs = dogService.retrieveDogs();
        return new ResponseEntity<>(dogs, HttpStatus.OK);
    }

    @GetMapping("/dogs/breed")
    public ResponseEntity<List<String>> getDogBreeds(){
        List<String> breeds = dogService.retrieveDogBreed();
        return new ResponseEntity<>(breeds, HttpStatus.OK);
    }

    @GetMapping("/{id}/breed")
    public ResponseEntity<String> getBreedById(@PathVariable Long id){
        String breed = dogService.retrieveDogBreedById(id);
        return new ResponseEntity<>(breed, HttpStatus.OK);
    }

    @GetMapping("/dogs/name")
    public ResponseEntity<List<String>> getDogNames(){
        List<String> names = dogService.retrieveDogNames();
        return new ResponseEntity<>(names, HttpStatus.OK);
    }

}
