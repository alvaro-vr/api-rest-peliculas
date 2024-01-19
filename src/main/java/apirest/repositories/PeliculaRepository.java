package apirest.repositories;

import apirest.entities.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PeliculaRepository extends JpaRepository<Pelicula, Long> {
    Optional<Pelicula> findByTitulo(String nombre);
    List<Pelicula> findByGenero(String genero);
}
