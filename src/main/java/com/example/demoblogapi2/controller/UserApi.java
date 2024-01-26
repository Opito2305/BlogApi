package com.example.demoblogapi2.controller;

import com.example.demoblogapi2.model.User;
import com.example.demoblogapi2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/users")
public class UserApi {
    @Autowired
    UserRepository userRepository;

    @GetMapping
    public ResponseEntity findAll() {
        return new ResponseEntity<>(userRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity create(@RequestBody User user) {
        return new ResponseEntity<>(userRepository.save(user), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity edit(@RequestBody User user , @PathVariable Long id) {
        user.setId(id);
        return new ResponseEntity<>(userRepository.save(user), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        userRepository.deleteById(id);
        return new ResponseEntity<>( "Xoa roi day",HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable Long id){
        return new ResponseEntity<>(userRepository.findById(id),HttpStatus.OK);
    }
}