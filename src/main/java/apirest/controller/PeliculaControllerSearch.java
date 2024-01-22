package apirest.controller;

import apirest.entities.Pelicula;
import apirest.service.PeliculaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/peliculas/search")
public class PeliculaControllerSearch {


    PeliculaService service;

    public PeliculaControllerSearch(PeliculaService service) {
        this.service = service;
    }

    @GetMapping()
    public ResponseEntity<List<Pelicula>> findByArgs(
            @RequestParam(name = "title", required = false, defaultValue = "") String title,
            @RequestParam(name = "genre", required = false, defaultValue = "") String genre,
            @RequestParam(name = "year", required = false) Long year,
            @RequestParam(name = "director", required = false, defaultValue = "") String director,
            @RequestParam(name = "actor", required = false, defaultValue = "") String actor) {

        List<Pelicula> peliculas = this.service.findByArgs(
                title.equals("") ? null : title,
                genre.equals("") ? null : genre,
                (year != null) ? year : null,
                director.equals("") ? null : director,
                actor.equals("") ? null : actor
        );

        return peliculas.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(peliculas);
    }


}
