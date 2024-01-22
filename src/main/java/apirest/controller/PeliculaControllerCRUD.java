package apirest.controller;

import apirest.entities.Pelicula;
import apirest.service.PeliculaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/peliculas")
public class PeliculaControllerCRUD {

    PeliculaService service;

    public PeliculaControllerCRUD(PeliculaService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Pelicula>> findAll(){
        List<Pelicula> peliculas = this.service.findAll();
        return ResponseEntity.ok(peliculas);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pelicula> findById(@PathVariable Long id){
        return this.service.findById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.noContent().build());
    }

    @PostMapping
    public ResponseEntity<String> create(@RequestBody Pelicula pelicula){
        if(pelicula.getId() == null){
            this.service.save(pelicula);
            return ResponseEntity.status(HttpStatus.CREATED).body("Usuario insertado");
        }else{
            return ResponseEntity.badRequest().build();
        }
    }

    @PutMapping
    public ResponseEntity<Pelicula> update(@RequestBody Pelicula pelicula){
        this.service.save(pelicula);
        return ResponseEntity.status(HttpStatus.CREATED).body(pelicula);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Pelicula> deleteById(@PathVariable Long id){
        this.service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
