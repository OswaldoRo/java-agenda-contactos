# Agenda Electrónica de Contactos

Aplicación de consola desarrollada en **Java** para la gestión eficiente de contactos personales. Este proyecto representa la primera entrega de mi portfolio de desarrollo Backend, enfocado en dominar las bases de la Programación Orientada a Objetos (POO), colecciones dinámicas y buenas prácticas de estructuración de código.

---

## Funcionalidades

La aplicación permite realizar todas las operaciones fundamentales de un CRUD (*Create, Read, Update, Delete*) mediante un menú interactivo en consola:

- **➕ Registrar Contacto:** Guarda nombre, teléfono y correo electrónico validando datos básicos.
- **📋 Listar Contactos:** Muestra la totalidad de la agenda ordenada.
- **🔍 Búsqueda Dual de Contactos:**
    - Búsqueda por índice utilizando iteración con `for` tradicional.
    - Búsqueda por nombre exacto implementando recorridos con `forEach`.
- **✏️ Modificar Contacto:** Actualiza la información de un contacto existente.
- **🗑️ Eliminar Contacto:** Remueve contactos de la agenda de forma segura.

---

## 🛠️ Tecnologías y Herramientas Utilizadas

- **Lenguaje:** Java (JDK 17+)
- **Paradigma:** Programación Orientada a Objetos (POO)
- **Estructura de Datos:** `java.util.ArrayList`
- **Lectura de Datos:** `java.util.Scanner`
- **Control de Versiones:** Git & GitHub (Convención *Conventional Commits*)
- **IDE:** IntelliJ IDEA

---

## 📁 Estructura del Proyecto

El código está organizado siguiendo la separación de responsabilidades en paquetes:

```text
src/
└── com/
    └── oswal/
        └── agendaborrador/       # Paquete principal
            ├── model/
            │   └── Contacto.java # Entidad del modelo con encapsulamiento
            ├── service/
            │   └── AgendaServicio.java # Lógica de negocio y métodos CRUD
            └── Main.java         # Interfaz de usuario por consola (Menú)