package com.dh.movies.service;

import com.dh.movies.dto.MovieDTO;

import java.util.List;

public interface MovieService {

    MovieDTO save(MovieDTO dto);

    List<MovieDTO> findByGenre(String genre);

}
