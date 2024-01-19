# API REST Peliculas
Con esta Api Rest, conseguí aprender nociones sobre el Framework Spring Boot.
He utilizado Spring Data Jpa para la persistencia de los datos en una base de datos MySQL.
También he usado Spring Web para hacer el RestController y poder procesar las peticiones HTTP.

Para probar la aplicación en local se deberá de hacer una base de datos e importar el csv de todas las películas. Hay un archivo llamado 'bd.sql' el cual es un script que crea la base de datos y todo.
Lo único que deberéis de hacer es cambiar la ruta donde se situa el peliculas.csv

```
CREATE DATABASE IF NOT EXISTS peliculasdb;

USE peliculasdb;

CREATE TABLE pelicula (
    id BIGINT NOT NULL AUTO_INCREMENT,
    actores VARCHAR(255),
    agno INTEGER,
    director VARCHAR(255),
    genero VARCHAR(255),
    titulo VARCHAR(255),
    PRIMARY KEY (id)
);

ALTER TABLE pelicula DROP INDEX UK_94jwam3f1prexp7hod5vg6dpv;

LOAD DATA INFILE 'ruta/del/archivo/csv' 
INTO TABLE pelicula
FIELDS TERMINATED BY ';'
IGNORE 1 ROWS
(titulo, genero, agno, director, actores);
```
