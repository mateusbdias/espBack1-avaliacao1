package com.dh.catalog.service;

import com.dh.catalog.dto.MovieDTO;

import java.util.List;

public interface CatalogService {

    List<MovieDTO> findMovies(String genre);

}
