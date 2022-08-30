package com.dh.movies.service.impl;

import com.dh.movies.dto.MovieDTO;
import com.dh.movies.entity.Movie;
import com.dh.movies.repository.MovieRepository;
import com.dh.movies.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieRepository repository;

    @Override
    public MovieDTO save(MovieDTO dto) {
        Movie entity = new Movie();
        entity.setName(dto.getName());
        entity.setGenre(dto.getGenre());
        entity.setUrlStream(dto.getUrlStream());
        return entityToDTO(repository.save(entity));
    }

    @Override
    public List<MovieDTO> findByGenre(String genre) {
        return repository.findByGenre(genre)
                .stream()
                .map(this::entityToDTO)
                .collect(Collectors.toList());
    }

    private MovieDTO entityToDTO(Movie movie) {
        return MovieDTO.builder()
                .id(movie.getId())
                .name(movie.getName())
                .genre(movie.getGenre())
                .urlStream(movie.getUrlStream())
                .build();
    }

}
