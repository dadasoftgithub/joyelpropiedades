CREATE TABLE `inmobiliaria`.`inmobiliaria` (
  `id_inmobiliaria` INT NOT NULL AUTO_INCREMENT,
  `tipo_propiedad` INT NOT NULL,
  `tipo_operacion` INT NOT NULL,
  `importe` DOUBLE NOT NULL,
  `superficie` INT NULL,
  `direccion` VARCHAR(200) NOT NULL,
  `altura` INT NOT NULL,
  `localidad` VARCHAR(45) NOT NULL,
  `mapa` VARCHAR(200) NULL,
  `descripcion` VARCHAR(500) NULL,
  `estado` INT NOT NULL,
  `cant_ambientes` VARCHAR(45) NULL,
  `piso` VARCHAR(45) NULL,
  `dpto` VARCHAR(45) NULL,
  `id_edificio` INT NULL,
  PRIMARY KEY (`id_inmobiliaria`));



CREATE TABLE `inmobiliaria`.`usuario` (
  `id_usuario` INT NOT NULL,
  `username` VARCHAR(45) NOT NULL,
  `pwd` VARCHAR(500) NOT NULL,
  PRIMARY KEY (`id_usuario`));



