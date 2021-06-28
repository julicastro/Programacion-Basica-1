CREATE SCHEMA IF NOT exists ejercicio01;

CREATE TABLE almacen(nro INT PRIMARY KEY AUTO_INCREMENT, nombre VARCHAR(40), responsable VARCHAR(40));
CREATE TABLE articulo(cod_art INT PRIMARY KEY auto_increment, descripcion VARCHAR(40), precio DECIMAL(3,2));
CREATE TABLE material(cod_mat INT PRIMARY KEY auto_increment, descripcion VARCHAR(40));
CREATE TABLE provedor(cod_prov INT primary KEY auto_increment, nombre VARCHAR(40), domicilio VARCHAR(80), foreign key (cod_ciu) REFERENCES ciudad(cod_ciu), fecha_alta DATE);
CREATE TABLE ciudad(cod_ciu INT(11), nombre VARCHAR(20));
CREATE TABLE contiene(nro INT primary KEY);


drop database ejercicio1;

