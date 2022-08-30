package com.dh.catalog.service.impl;

import com.dh.catalog.dto.MovieDTO;
import com.dh.catalog.service.CatalogService;
import com.dh.catalog.service.MovieFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogServiceImpl implements CatalogService {

    @Autowired
    private MovieFeign movieFeign;

    @Override
    public List<MovieDTO> findMovies(String genre) {
        return movieFeign.findByGenre(genre).getBody();
    }
}
