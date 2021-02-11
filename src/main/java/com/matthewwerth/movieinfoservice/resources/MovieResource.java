package com.matthewwerth.movieinfoservice.resources;

import com.matthewwerth.movieinfoservice.models.Movie;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieResource {

    @RequestMapping("/{movieID}")
    public Movie getMovieInfo(@PathVariable("movieID") String movieID) {
        return new Movie(movieID, "Name"); // this is where we connect to a movie db api!
    }
}
