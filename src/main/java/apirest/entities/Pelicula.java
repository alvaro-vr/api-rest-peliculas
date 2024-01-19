package apirest.entities;

import jakarta.persistence.*;

@Entity
@Table
public class Pelicula {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private String titulo;
    private String genero;
    private Integer agno;
    private String director;
    private String actores;

    public Pelicula(Long id, String titulo, String genero, Integer agno, String director, String actores) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.agno = agno;
        this.director = director;
        this.actores = actores;
    }

    public Pelicula() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getAgno() {
        return agno;
    }

    public void setAgno(Integer agno) {
        this.agno = agno;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActores() {
        return actores;
    }

    public void setActores(String actores) {
        this.actores = actores;
    }
}
