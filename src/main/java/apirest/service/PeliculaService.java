package apirest.service;

import apirest.entities.Pelicula;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public interface PeliculaService {

    // SELECT
    List<Pelicula> findAll();
    Optional<Pelicula> findById(Long id);
    List<Pelicula> findByArgs(String titulo, String genero, Long agno, String director, String actor);

    //CREATE UPDATE
    Pelicula save(Pelicula pelicula);

    //DELETE
    void deleteById(Long id);
}
