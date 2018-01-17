-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema inmobiliaria
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `inmobiliaria` ;

-- -----------------------------------------------------
-- Schema inmobiliaria
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `inmobiliaria` DEFAULT CHARACTER SET latin1 ;
USE `inmobiliaria` ;

-- -----------------------------------------------------
-- Table `inmobiliaria`.`EDIFICIO`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `inmobiliaria`.`EDIFICIO` ;

CREATE TABLE IF NOT EXISTS `inmobiliaria`.`EDIFICIO` (
  `id_edificio` INT(11) NOT NULL AUTO_INCREMENT,
  `titulo` VARCHAR(100) NOT NULL,
  `sum` INT(11) NULL DEFAULT NULL,
  `piscina` INT(11) NULL DEFAULT NULL,
  `gimnacio` INT(11) NULL DEFAULT NULL,
  `laundry` INT(11) NULL DEFAULT NULL,
  `spa` INT(11) NULL DEFAULT NULL,
  `direccion` VARCHAR(200) NULL DEFAULT NULL,
  `altura` INT(11) NULL DEFAULT NULL,
  `mapa` VARCHAR(200) NULL DEFAULT NULL,
  `descripcion` VARCHAR(500) NULL DEFAULT NULL,
  PRIMARY KEY (`id_edificio`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `inmobiliaria`.`ESTADO`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `inmobiliaria`.`ESTADO` ;

CREATE TABLE IF NOT EXISTS `inmobiliaria`.`ESTADO` (
  `id_estado` INT(11) NOT NULL,
  `dc_estado` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_estado`),
  UNIQUE INDEX `dc_estado_UNIQUE` (`dc_estado` ASC))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `inmobiliaria`.`LOCALIDAD`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `inmobiliaria`.`LOCALIDAD` ;

CREATE TABLE IF NOT EXISTS `inmobiliaria`.`LOCALIDAD` (
  `id_localidad` INT(11) NOT NULL,
  `dc_localidad` VARCHAR(45) NOT NULL,
  `estado` INT(11) NOT NULL COMMENT 'ver tabla ESTADO_LOCALIDAD',
  PRIMARY KEY (`id_localidad`),
  UNIQUE INDEX `dc_localidad_UNIQUE` (`dc_localidad` ASC),
  INDEX `fk_estado_idx` (`estado` ASC),
  INDEX `idx_estado_localidad` (`estado` ASC),
  CONSTRAINT `fk_estado_localidad`
    FOREIGN KEY (`estado`)
    REFERENCES `inmobiliaria`.`ESTADO` (`id_estado`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `inmobiliaria`.`TIPO_OPERACION`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `inmobiliaria`.`TIPO_OPERACION` ;

CREATE TABLE IF NOT EXISTS `inmobiliaria`.`TIPO_OPERACION` (
  `id_operacion` INT(11) NOT NULL,
  `dc_operacion` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_operacion`),
  UNIQUE INDEX `dc_operacion_UNIQUE` (`dc_operacion` ASC))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `inmobiliaria`.`TIPO_PROPIEDAD`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `inmobiliaria`.`TIPO_PROPIEDAD` ;

CREATE TABLE IF NOT EXISTS `inmobiliaria`.`TIPO_PROPIEDAD` (
  `id_propiedad` INT(11) NOT NULL,
  `dc_propiedad` VARCHAR(45) NOT NULL,
  `estado` INT(11) NOT NULL COMMENT 'ver tabla ESTADO',
  PRIMARY KEY (`id_propiedad`),
  UNIQUE INDEX `dc_propiedad_UNIQUE` (`dc_propiedad` ASC),
  INDEX `idx_estado_tipo_propiedad` (`estado` ASC),
  CONSTRAINT `fk_estado_tipo_propiedad`
    FOREIGN KEY (`estado`)
    REFERENCES `inmobiliaria`.`ESTADO` (`id_estado`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `inmobiliaria`.`INMUEBLE`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `inmobiliaria`.`INMUEBLE` ;

CREATE TABLE IF NOT EXISTS `inmobiliaria`.`INMUEBLE` (
  `id_inmueble` INT(11) NOT NULL AUTO_INCREMENT,
  `tipo_propiedad` INT(11) NOT NULL,
  `tipo_operacion` INT(11) NOT NULL,
  `importe` DOUBLE NOT NULL,
  `superficie` INT(11) NULL DEFAULT NULL,
  `direccion` VARCHAR(200) NOT NULL,
  `altura` INT(11) NOT NULL,
  `localidad` INT(11) NOT NULL,
  `mapa` VARCHAR(200) NULL DEFAULT NULL,
  `descripcion` VARCHAR(500) NULL DEFAULT NULL,
  `estado` INT(11) NOT NULL,
  `cant_ambientes` VARCHAR(45) NULL DEFAULT NULL,
  `piso` VARCHAR(45) NULL DEFAULT NULL,
  `dpto` VARCHAR(45) NULL DEFAULT NULL,
  `id_edificio` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id_inmueble`),
  INDEX `idx_tipo_propiedad` (`tipo_propiedad` ASC),
  INDEX `idx_tipo_operacion` (`tipo_operacion` ASC),
  INDEX `idx_estado_inmueble` (`estado` ASC),
  INDEX `fk_localidad_inmueble_idx` (`localidad` ASC),
  CONSTRAINT `fk_edificio_inmueble`
    FOREIGN KEY (`estado`)
    REFERENCES `inmobiliaria`.`EDIFICIO` (`id_edificio`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_estado_inmueble_inmueble`
    FOREIGN KEY (`estado`)
    REFERENCES `inmobiliaria`.`ESTADO` (`id_estado`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_localidad_inmueble`
    FOREIGN KEY (`localidad`)
    REFERENCES `inmobiliaria`.`LOCALIDAD` (`id_localidad`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_tipo_operacion_inmueble`
    FOREIGN KEY (`tipo_operacion`)
    REFERENCES `inmobiliaria`.`TIPO_OPERACION` (`id_operacion`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_tipo_propiedad_inmueble`
    FOREIGN KEY (`tipo_propiedad`)
    REFERENCES `inmobiliaria`.`TIPO_PROPIEDAD` (`id_propiedad`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `inmobiliaria`.`TIPO_DISPOSITIVO`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `inmobiliaria`.`TIPO_DISPOSITIVO` ;

CREATE TABLE IF NOT EXISTS `inmobiliaria`.`TIPO_DISPOSITIVO` (
  `id_dispositivo` INT(11) NOT NULL,
  `dc_dispositivo` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_dispositivo`),
  UNIQUE INDEX `dc_dispositivo_UNIQUE` (`dc_dispositivo` ASC))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `inmobiliaria`.`FOTO`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `inmobiliaria`.`FOTO` ;

CREATE TABLE IF NOT EXISTS `inmobiliaria`.`FOTO` (
  `id_foto` INT(11) NOT NULL AUTO_INCREMENT,
  `id_inmueble` INT(11) NOT NULL,
  `tipo_dispositivo` INT(11) NOT NULL,
  `foto` VARCHAR(500) NOT NULL,
  PRIMARY KEY (`id_foto`),
  UNIQUE INDEX `u01_foto` (`id_inmueble` ASC, `tipo_dispositivo` ASC, `foto` ASC),
  INDEX `idx_tipo_dispositivo` (`tipo_dispositivo` ASC),
  CONSTRAINT `fk_edificio_foto`
    FOREIGN KEY (`id_inmueble`)
    REFERENCES `inmobiliaria`.`EDIFICIO` (`id_edificio`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_inmueble_foto`
    FOREIGN KEY (`id_inmueble`)
    REFERENCES `inmobiliaria`.`INMUEBLE` (`id_inmueble`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_tipo_dispositivo`
    FOREIGN KEY (`tipo_dispositivo`)
    REFERENCES `inmobiliaria`.`TIPO_DISPOSITIVO` (`id_dispositivo`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `inmobiliaria`.`USUARIO`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `inmobiliaria`.`USUARIO` ;

CREATE TABLE IF NOT EXISTS `inmobiliaria`.`USUARIO` (
  `id_usuario` INT(11) NOT NULL,
  `username` VARCHAR(45) NOT NULL,
  `pwd` VARCHAR(500) NOT NULL,
  PRIMARY KEY (`id_usuario`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
