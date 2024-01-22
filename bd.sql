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

LOAD DATA INFILE 'C:/Users/alvaro/Desktop/api-rest-peliculas/peliculas.csv'
INTO TABLE pelicula
FIELDS TERMINATED BY ';'
IGNORE 1 ROWS
(titulo, genero, agno, director, actores);



