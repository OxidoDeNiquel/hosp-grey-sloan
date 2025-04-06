# 🏥 Sistema de Gestión Hospitalaria en Java

Este proyecto es una aplicación Java orientada a la gestión de pacientes, médicos y consultas médicas en un entorno hospitalario. Permite registrar pacientes, médicos, y gestionar el historial clínico de los pacientes a través de sus consultas médicas.

---

## 📋 Descripción del Proyecto

El sistema permite:

- Registrar pacientes con datos básicos y su estado de asegurado.
- Registrar médicos junto con su especialidad.
- Registrar consultas médicas con diagnóstico y tratamiento.
- Asociar cada consulta con un paciente y un médico.
- Consultar el historial clínico completo de cada paciente.

Además, se implementa un sistema de **historial clínico**, donde cada paciente puede tener múltiples consultas registradas con su respectivo diagnóstico y tratamiento.

---

## 🧱 Estructura de la Base de Datos

La base de datos se llama **`Hospital`** y contiene las siguientes tablas:

### 🧑‍🤝‍🧑 Tabla: `Pacientes`

| Campo             | Tipo                        | Descripción                |
|------------------|-----------------------------|----------------------------|
| `id`             | INT, PRIMARY KEY, AUTO_INCREMENT | Identificador único       |
| `nombre`         | VARCHAR(50)                 | Nombre del paciente        |
| `apellido`       | VARCHAR(50)                 | Apellido del paciente      |
| `edad`           | INT                         | Edad del paciente          |
| `estado_asegurado` | ENUM('ASEGURADO', 'NO_ASEGURADO') | Estado de aseguramiento |

### 🧑‍⚕️ Tabla: `Medicos`

| Campo        | Tipo                | Descripción                  |
|-------------|---------------------|------------------------------|
| `id`        | INT, PRIMARY KEY, AUTO_INCREMENT | Identificador único         |
| `nombre`    | VARCHAR(50)         | Nombre del médico            |
| `especialidad` | VARCHAR(50)      | Especialidad médica          |

### 📆 Tabla: `Consultas`

| Campo            | Tipo              | Descripción                        |
|------------------|-------------------|------------------------------------|
| `id`             | INT, PRIMARY KEY, AUTO_INCREMENT | Identificador único       |
| `paciente_id`    | INT, FOREIGN KEY (`Pacientes.id`) | Referencia al paciente    |
| `medico_id`      | INT, FOREIGN KEY (`Medicos.id`)   | Referencia al médico      |
| `fecha_consulta` | DATE              | Fecha de la consulta               |
| `diagnostico`    | TEXT              | Diagnóstico del médico             |
| `tratamiento`    | TEXT              | Tratamiento recetado               |

---

## ⚙️ Tecnologías Utilizadas

- **Java** (versión X)
- **JDBC** para conexión con la base de datos
- **MySQL** como sistema de gestión de base de datos
- (Opcional) **Maven** o **Gradle** como gestor de dependencias
- (Opcional) **Swing/JavaFX** si usaste interfaz gráfica
