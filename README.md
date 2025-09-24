# 📚 Proyecto LMS – Agile Development

Este repositorio forma parte del curso **Agile Development** y contiene el desarrollo de un **Learning Management System (LMS)** para la gestión académica en línea. El objetivo es analizar, diseñar, implementar y desplegar un sistema funcional aplicando buenas prácticas de desarrollo ágil.

---

## 🎯 Objetivo del Proyecto
El sistema permitirá gestionar cursos, usuarios y sesiones académicas en un entorno web. Incluye funcionalidades diferenciadas según roles:

- **Administrador**
    - Crear y gestionar docentes.
    - Crear cursos y asignar docentes a cursos.

- **Docente**
    - Crear, actualizar y publicar tareas.
    - Publicar y filtrar sesiones de clase por fecha.

- **Estudiante**
    - Subir entregas de tareas.
    - Filtrar sesiones por fecha.
    - Comentar en sesiones de clase.

---

## 🛠️ Tecnologías Utilizadas

### **Backend**
- **Java 17+**
- **Spring Boot** (REST API, seguridad, validaciones)
- **Spring Data JPA + Hibernate** (persistencia de datos)
- **Lombok** (simplificación de modelos)
- **Maven** (gestión de dependencias)
- **JWT + Spring Security** (autenticación y autorización)

## **Frontend**
- **Angular 17** (framework para la interfaz de usuario)
- **TypeScript** (lenguaje base para Angular)
- **HTML5 + CSS3** (estructura y estilos)
- **Angular Material** (componentes UI preconstruidos)
- **Node.js** (ejecución del entorno y dependencias npm)
- **npm** (gestión de paquetes para Angular)

### **Base de Datos**
- **MySQL8.4** (entorno productivo)
- **H2 Database** (entorno de desarrollo/pruebas)

---

## 🚀 Roadmap del Proyecto

### 📌 Módulo 1 (Sprint 1)
- Registro de usuarios con roles (Administrador, Docente, Estudiante).
- Gestión de cursos (creación, asignación de docentes).
- Gestión de tareas por docentes.
- Subida de entregas de tareas por estudiantes.
- Publicación y comentarios en sesiones.

### 📌 Módulo 2 (Sprint 2)
- **EN DESARROLLO**

---

## 📂 Estructura del Repositorio
src/
- └── main/ 
- - └── java/com/cursos/app
- - - ├── controller
- - - ├── entity
- - - ├── repository
- - - ├── service
- - - └── security

