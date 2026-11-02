Aquí tienes la estructura en formato Markdown lista para el `README.md` de este código de **Simulación de Jerarquía de Animales y Polimorfismo de Comportamiento (Herencia y Sobrescritura en Java)**, manteniendo el enfoque exclusivo de **Programación Orientada a Objetos en memoria** (sin bases de datos):

---

# 🐾 Simulación de Jerarquía de Animales y Sonidos (Herencia y Polimorfismo en Java)

Este proyecto es una aplicación en Java que modela un sistema zoológico elemental, implementando una jerarquía de clases mediante herencia para representar diferentes especies de animales (perros, gatos y pájaros) que comparten una estructura común pero manifiestan comportamientos sonoros especializados. Pone en práctica conceptos fundamentales de la **Programación Orientada a Objetos (POO)** como la **generalización de atributos protegidos (`protected`)**, la reutilización de constructores mediante `super`, la sobrescritura de métodos polimórficos (`@Override`) y la ejecución dinámica de acciones en memoria.

---

## 🧩 Clases y Estructura del Sistema

El diseño del software se organiza a través de una clase base general y sus respectivas subclases especializadas, acompañadas por un punto de ejecución:

* **`Animal`**: Clase base que centraliza los atributos y comportamientos comunes de cualquier ser vivo del sistema.
* **Atributos protegidos (`protected`)**: `nombre` y `edad`, permitiendo que las clases hijas accedan directamente a la identidad básica del animal.
* **Constructor**: Inicializa los datos comunes de identificación y edad del animal.
* **Métodos operativos**:
* `hacerSonido()`: Comportamiento base genérico que emite un mensaje predeterminado, diseñado para ser especializado por las subclases.
* `mostrarInformacion()`: Imprime de forma estructurada el nombre y la edad del animal.




* **`Perro`**: Extiende de `Animal` para modelar un canino.
* **Constructor**: Invoca a `super(nombre, edad)` para reutilizar la inicialización de la superclase.
* **Sobrescritura (`@Override`)**: Implementa su propio comportamiento para `hacerSonido()`, imprimiendo `"Guau"`.


* **`Gato`**: Extiende de `Animal` para modelar un felino.
* **Constructor**: Utiliza `super(...)` para configurar los datos heredados.
* **Sobrescritura (`@Override`)**: Personaliza el método `hacerSonido()` imprimiendo `"Miau"`.


* **`Pajaro`**: Extiende de `Animal` para modelar aves.
* **Constructor**: Utiliza `super(...)` para la asignación de atributos base.
* **Sobrescritura (`@Override`)**: Adapta el comportamiento sonoro imprimiendo `"Pío"`.


* **`Main`**: Punto de entrada del programa. Instancia un objeto de tipo `Perro`, un `Gato` y un `Pájarro` con nombres y edades específicos, invoca la visualización de su información general y ejecuta sus respectivos sonidos polimórficos, imprimiendo los resultados por consola.

---

## ⚙️ Reglas de Negocio y Control de Validación

1. **Reutilización de Atributos por Herencia:** La identidad básica de los animales (`nombre`, `edad`) se centraliza en la superclase `Animal`, evitando la duplicación de código en las subclases.
2. **Polimorfismo en el Comportamiento:** Cada especie implementa su propia regla específica para emitir sonidos mediante la sobrescritura de métodos (`@Override`), permitiendo que un mismo mensaje (`hacerSonido`) produzca resultados diferentes según el tipo de objeto.
3. **Encapsulamiento y Acceso Controlado:** Los atributos protegidos permiten un intercambio fluido y seguro dentro de la jerarquía de clases de dominio.

---

## 💻 Salida por Consola

Al ejecutar la clase `Main`, el programa genera el siguiente resultado:

```text
=== PERRO ===
Nombre: Rocky
Edad: 4 años
Guau

=== GATO ===
Nombre: Michi
Edad: 2 años
Miau

=== PÁJARO ===
Nombre: Piolín
Edad: 1 años
Pío

```

---

## 🚀 Conceptos de Programación Aplicados

* **Jerarquía de Clases:** Modelado de entidades del mundo real mediante una estructura limpia de herencia (`Animal` como superclase de `Perro`, `Gato` y `Pajaro`).
* **Sobrescritura de Métodos (`@Override`):** Adaptación del comportamiento genérico de la superclase para reflejar las características acústicas particulares de cada animal.
* **Diseño Modular:** Clara separación entre la lógica del dominio zoológico y la ejecución de casos de prueba simulados en el cliente (`Main`).
