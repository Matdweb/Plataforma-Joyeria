drop schema if exists joyeria;
drop user if exists admin;
CREATE SCHEMA joyeria;

create user 'admin' identified by 'admin';
grant all privileges on joyeria.* to 'admin';
flush privileges;

USE joyeria;


CREATE TABLE Usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50),
    apellidos VARCHAR(100),
    correo VARCHAR(100) UNIQUE,
    contraseña VARCHAR(255),
    fecha_registro VARCHAR(50)
);

CREATE TABLE Categorias (
    id_categoria INT AUTO_INCREMENT PRIMARY KEY,
    nombre_categoria VARCHAR(50)
);

CREATE TABLE Productos (
    id_producto INT AUTO_INCREMENT PRIMARY KEY,
    nombre_producto VARCHAR(100),
    descripcion TEXT,
    precio DECIMAL(10, 2),
    id_categoria INT,
    disponibilidad INT,
    imagen VARCHAR(255),
    FOREIGN KEY (id_categoria) REFERENCES Categorias(id_categoria)
);

CREATE TABLE Carritos (
    id_carritos INT AUTO_INCREMENT PRIMARY KEY,
    id_usuario INT,
    FOREIGN KEY (id_usuario) REFERENCES Usuarios(id)
);

CREATE TABLE ItemsCarrito (
    id INT AUTO_INCREMENT PRIMARY KEY,
    id_carrito INT,
    id_producto INT,
    cantidad INT,
    FOREIGN KEY (id_carrito) REFERENCES Carritos(id_carritos),
    FOREIGN KEY (id_producto) REFERENCES Productos(id_producto)
);

INSERT INTO Categorias (nombre_categoria) VALUES ('Anillos'), ('Collares'), ('Pulseras'), ('Relojes');


INSERT INTO Productos (nombre_producto, descripcion, precio, id_categoria, disponibilidad, imagen) 
VALUES ('Anillo de Oro', 'Anillo de oro 18k con diamantes', 299.99, 1, 10, 'anillo_oro.jpg');


