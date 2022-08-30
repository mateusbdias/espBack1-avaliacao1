package com.dh.catalog.service;

import com.dh.catalog.dto.MovieDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "MOVIES-SERVICE")
public interface MovieFeign {

    @GetMapping("/movies/{genre}")
    ResponseEntity<List<MovieDTO>> findByGenre(@PathVariable String genre);

}
