package apirest.controller;

import apirest.entities.Pelicula;
import apirest.service.PeliculaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/peliculas")
public class PeliculaController {

    PeliculaService service;

    public PeliculaController(PeliculaService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Pelicula>> findAll(){
        List<Pelicula> peliculas = this.service.findAll();
        return ResponseEntity.ok(peliculas);
    }
}
