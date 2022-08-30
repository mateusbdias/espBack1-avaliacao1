package com.dh.movies.controller;

import com.dh.movies.dto.MovieDTO;
import com.dh.movies.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class MovieController {

    @Autowired
    private MovieService service;

    @PostMapping
    private ResponseEntity<MovieDTO> save(@RequestBody MovieDTO dto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(dto));
    }

    @GetMapping("/{genre}")
    private ResponseEntity<List<MovieDTO>> findByGenre(@PathVariable String genre) {
        return ResponseEntity.ok(service.findByGenre(genre));
    }

}
