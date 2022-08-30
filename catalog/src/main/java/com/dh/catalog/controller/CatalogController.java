package com.dh.catalog.controller;

import com.dh.catalog.dto.MovieDTO;
import com.dh.catalog.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class CatalogController {

    @Autowired
    private CatalogService service;

    @GetMapping("/movies/{genre}")
    private ResponseEntity<List<MovieDTO>> findMoviesByGenre(@PathVariable String genre) {
        return ResponseEntity.ok(service.findMovies(genre));
    }

}
