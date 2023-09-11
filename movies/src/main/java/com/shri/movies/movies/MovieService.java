package com.shri.movies.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> allMovies()
    {
        return movieRepository.findAll();
    }

    public Optional<Movie>SingleMovie(String imdbiId)
    {
        return movieRepository.findMovieByImdbId(imdbiId);
    }
}
