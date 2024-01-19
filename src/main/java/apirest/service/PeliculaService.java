package apirest.service;

import apirest.entities.Pelicula;

import java.util.List;
import java.util.Optional;

public interface PeliculaService {

    // SELECT
    List<Pelicula> findAll();
    Optional<Pelicula> findById(Long id);
    Optional<Pelicula> findByNombre(String nombre);
    List<Pelicula> findByGenero(String genero);

    //CREATE UPDATE
    Pelicula save(Pelicula pelicula);

    //DELETE
    void deleteById(Long id);
}
