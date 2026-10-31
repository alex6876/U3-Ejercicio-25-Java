Aquí tienes la estructura en formato Markdown lista para el `README.md` de este código de **Simulación de Catálogo de Biblioteca (Herencia, Polimorfismo y Arreglos Polimórficos en Java)**, manteniendo el enfoque exclusivo de **Programación Orientada a Objetos en memoria** (sin bases de datos):

---

# 📚 Simulación de Catálogo de Biblioteca (Herencia y Polimorfismo en Java)

Este proyecto es una aplicación en Java que modela un sistema de gestión para una biblioteca, implementando una jerarquía de clases mediante herencia para administrar distintos tipos de publicaciones (libros y revistas) almacenadas dentro de una colección polimórfica. Pone en práctica conceptos fundamentales de la **Programación Orientada a Objetos (POO)** como la **generalización de atributos protegidos (`protected`)**, la reutilización de constructores e invocación de métodos base mediante `super`, la sobrescritura de comportamientos (`@Override`) y el procesamiento dinámico de arreglos polimórficos en memoria.

---

## 🧩 Clases y Estructura del Sistema

El diseño del software se organiza a través de una clase base general, sus respectivas subclases especializadas y un punto de ejecución:

* **`MaterialBiblioteca`**: Clase base que centraliza los atributos y comportamientos comunes de cualquier elemento del catálogo de la biblioteca.
* **Atributos protegidos (`protected`)**: `titulo`, `anioEdicion` y `editorial`, permitiendo que las clases hijas accedan directamente a la información bibliográfica esencial.
* **Constructor**: Inicializa los datos comunes del material de lectura.
* **Método operativo**: `mostrarCatalogo()` para desplegar por consola el título, año de edición y editorial.


* **`Libro`**: Extiende de `MaterialBiblioteca` para modelar obras literarias o textos extensos.
* **Atributos privados (`private`)**: `autor` y `cantidadPaginas`.
* **Constructor**: Invoca a `super(...)` para inicializar los datos heredados y configura el autor y el número de páginas.
* **Sobrescritura (`@Override`)**: Personaliza la presentación invocando primero a `super.mostrarCatalogo()` y añadiendo los detalles específicos del libro precedidos por una cabecera identificativa.


* **`Revista`**: Extiende de `MaterialBiblioteca` para modelar publicaciones periódicas.
* **Atributos privados (`private`)**: `numeroEdicion` y `mesPublicacion`.
* **Constructor**: Utiliza `super(...)` y asigna el número de edición y el mes de publicación.
* **Sobrescritura (`@Override`)**: Extiende el comportamiento base mediante `super.mostrarCatalogo()` e incorpora los datos particulares de la revista.


* **`Main`**: Punto de entrada del programa. Declara un arreglo polimórfico de tipo `MaterialBiblioteca` con capacidad para 4 elementos, instancia una combinación de libros y revistas, recorre la colección mediante un bucle e invoca dinámicamente el método `mostrarCatalogo()` para imprimir el reporte completo por consola.

---

## ⚙️ Reglas de Negocio y Control de Validación

1. **Uso de Arreglos Polimórficos:** Permite almacenar objetos de diferentes subclases (`Libro` y `Revista`) bajo un tipo de dato común (`MaterialBiblioteca`), simplificando el recorrido y tratamiento masivo de la información.
2. **Ligadura Dinámica (Polimorfismo):** Al iterar sobre el arreglo e invocar `mostrarCatalogo()`, Java ejecuta automáticamente la versión sobrescrita correspondiente al tipo real del objeto en tiempo de ejecución.
3. **Reutilización Estructural con `super`:** Las subclases evitan duplicar lógica al delegar la impresión de los atributos genéricos a la superclase, enriqueciendo la salida con sus propiedades particulares.

---

## 💻 Salida por Consola

Al ejecutar la clase `Main`, el programa genera el siguiente resultado:

```text
=== LIBRO ===
Título: El Principito
Año de edición: 1943
Editorial: Salamandra
Autor: Antoine de Saint-Exupéry
Cantidad de páginas: 96

=== REVISTA ===
Título: National Geographic
Año de edición: 2025
Editorial: National Geographic
Número de edición: 150
Mes de publicación: Marzo

=== LIBRO ===
Título: Don Quijote de la Mancha
Año de edición: 1605
Editorial: Francisco de Robles
Autor: Miguel de Cervantes
Cantidad de páginas: 863

=== REVISTA ===
Título: Muy Interesante
Año de edición: 2026
Editorial: Zinet Media
Número de edición: 280
Mes de publicación: Octubre

```

---

## 🚀 Conceptos de Programación Aplicados

* **Polimorfismo de Inclusión:** Capacidad de tratar objetos de distintas clases derivadas de manera uniforme a través de referencias de la clase base.
* **Sobrescritura y Reutilización de Código:** Implementación de comportamientos especializados mediante `@Override` y el uso de la palabra clave `super`.
* **Diseño Modular:** Clara separación entre la jerarquía del dominio bibliográfico y la ejecución de la lógica de procesamiento en el cliente (`Main`).
