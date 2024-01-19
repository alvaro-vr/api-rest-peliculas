package apirest.service;

import apirest.entities.Pelicula;
import apirest.repositories.PeliculaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PeliculaServiceImpl implements PeliculaService {

    PeliculaRepository repository;

    public PeliculaServiceImpl(PeliculaRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Pelicula> findAll() {
        return this.repository.findAll();
    }

    @Override
    public Optional<Pelicula> findById(Long id) {
        return this.repository.findById(id);
    }

    @Override
    public Optional<Pelicula> findByNombre(String nombre) {
        return this.repository.findByTitulo(nombre);
    }

    @Override
    public List<Pelicula> findByGenero(String genero) {
        return this.repository.findByGenero(genero);
    }

    @Override
    public Pelicula save(Pelicula pelicula) {
        return this.repository.save(pelicula);
    }

    @Override
    public void deleteById(Long id) {
        this.repository.deleteById(id);
    }
}
