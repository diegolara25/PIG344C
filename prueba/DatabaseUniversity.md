
**COMANDOS PARA CREAR UNA BASE DE DATOS EN POSTGRESS** 


# 📚 Documentación de Base de Datos - Universidad

Este documento contiene la estructura y comandos básicos para la gestión de la base de datos en PostgreSQL.

---

## 📝 Notas sobre Comentarios y Sintaxis
* `/* Comentario multilínea */`: Se usa para bloques de código que no queremos ejecutar.
* `-- Comentario de 1 línea`: Ideal para notas rápidas.
* **SERIAL**: Tipo de dato para números automáticos (1, 2, 3...).
* **UNIQUE**: Restricción para que un valor no se repita (ej. emails o nombres de programa).

---

## 🏫 Estructura de la Tabla: Programa
Contiene los programas académicos (Ingeniería, Derecho, etc.).

```sql
/*
CREATE TABLE PROGRAMA (
    ID_PROGRAMA SERIAL PRIMARY KEY,      -- Identificador único automático
    NOMBRE VARCHAR(100) NOT NULL UNIQUE  -- Nombre obligatorio y único
);
*/

/*
-- INSERTAR DATOS EN TABLA PROGRAMA
INSERT INTO programa(nombre) VALUES
('Ingenieria de sistemas'),
('Derecho');
*/

-- Consultar tabla programa
-- SELECT * FROM programa;
```
## 🎓 Estructura de la Tabla: Estudiante
```
    /*
CREATE TABLE estudiante(
    id_estudiante SERIAL PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    numero_documento VARCHAR(50),
    email VARCHAR(120) NOT NULL UNIQUE,
    id_programa_fk INT NOT NULL,

    CONSTRAINT fk_estudiante_programa
        FOREIGN KEY (id_programa_fk) REFERENCES programa(id_programa)
        ON DELETE RESTRICT -- Evita borrar un programa si tiene estudiantes
);
*/
```
💡 Guía para Llaves Foráneas (FK)
```
Para recordar la lógica de la línea CONSTRAINT:

CONSTRAINT nombreRegla: Recomendado usar fk_tablaOrigen_tablaDestino.

FOREIGN KEY: Es el nombre que le diste a la columna en la tabla actual (id_programa_fk).

REFERENCES: Es el nombre de la tabla que contiene la llave primaria original y su campo (programa(id_programa)).
```

🛠️ Insertar Registros 
```
/*
INSERT INTO estudiante(nombre, email, numero_documento, id_programa_fk) VALUES
('diego', 'diego@gmail.com', 123987, 1);
*/

/*
INSERT INTO estudiante(nombre, email, numero_documento, id_programa_fk) VALUES
('Fred', 'fred@gmail.com', 79784, 2);
*/    
```
