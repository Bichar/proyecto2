CREATE DATABASE `dbparadigmas` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;


-- dbparadigmas.Usuarios definition

CREATE TABLE `Usuarios` (
  `id_usuario` int NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(30) DEFAULT NULL,
  `ApellidoPa` varchar(20) DEFAULT NULL,
  `ApellidoMa` varchar(30) DEFAULT NULL,
  `Contraseña` varchar(30) DEFAULT NULL,
  `rol_id` int DEFAULT NULL,
  `venta_id` int DEFAULT NULL,
  PRIMARY KEY (`id_usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- dbparadigmas.DetallesVenta definition

CREATE TABLE `DetallesVenta` (
  `detalle_id` int NOT NULL AUTO_INCREMENT,
  `Costototal` int DEFAULT NULL,
  `CantidadPrducto` int DEFAULT NULL,
  `venta_id` int DEFAULT NULL,
  `id_producto` int DEFAULT NULL,
  PRIMARY KEY (`detalle_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- dbparadigmas.Rol definition

CREATE TABLE `Rol` (
  `rol_id` int NOT NULL AUTO_INCREMENT,
  `nombrerol` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`rol_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- dbparadigmas.Venta definition

CREATE TABLE `Venta` (
  `Venta_id` int NOT NULL AUTO_INCREMENT,
  `PrecioTotal` int DEFAULT NULL,
  `id_producto` int DEFAULT NULL,
  PRIMARY KEY (`Venta_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- dbparadigmas.Producto definition

CREATE TABLE dbparadigmas.Producto (
	id_producto INT auto_increment NOT NULL,
	NombreProd varchar(30) NULL,
	precio INT NULL,
	Cantidad INT NULL,
	CONSTRAINT Producto_PK PRIMARY KEY (id_producto)
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_0900_ai_ci;
DROP TABLE IF EXISTS dbparadigmas.Producto;

-- dbparadigmas.Inventario definition

CREATE TABLE dbparadigmas.Inventario (
	id_producto INT auto_increment NOT NULL,
	cantidad varchar(100) NULL,
	CONSTRAINT Inventario_PK PRIMARY KEY (id_producto)
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_0900_ai_ci;
DROP TABLE IF EXISTS dbparadigmas.Inventario;

-- dbparadigmas.unidaddeMedida definition

CREATE TABLE `unidaddeMedida` (
  `id_um` int NOT NULL AUTO_INCREMENT,
  `tipo de medida` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id_um`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- dbparadigmas.Departamento definition

CREATE TABLE `Departamento` (
  `id_depto` int NOT NULL AUTO_INCREMENT,
  `nombreDepto` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id_depto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- dbparadigmas.Tipo definition

CREATE TABLE `Tipo` (
  `id_tipo` int NOT NULL AUTO_INCREMENT,
  `nombreT` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id_tipo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
