package apirest.repositories;

import apirest.entities.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PeliculaRepository extends JpaRepository<Pelicula, Long> {

    //List<Pelicula> findByTituloLikeAndGeneroLikeAndAgnoEqualsAndDirectorLikeAndActoresLike(String titulo, String genero, Integer agno, String director, String actores);

    @Query("SELECT p FROM Pelicula p " +
            "WHERE (:title IS NULL OR p.titulo LIKE %:title%) " +
            "AND (:genre IS NULL OR p.genero LIKE %:genre%) " +
            "AND (:year IS NULL OR p.agno = :year) " +
            "AND (:director IS NULL OR p.director LIKE %:director%) " +
            "AND (:actors IS NULL OR p.actores LIKE %:actors%)")
    List<Pelicula> findByArgs(
            @Param("title") String title,
            @Param("genre") String genre,
            @Param("year") Long year,
            @Param("director") String director,
            @Param("actors") String actors);
}
