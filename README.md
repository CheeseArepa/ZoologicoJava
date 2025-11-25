# Sistema de Gestión de Zoológico

Proyecto para el curso **Paradigma Orientado a Objetos – Ingeniería de Software**

Este proyecto implementa un sistema para registrar y gestionar animales de un zoológico, aplicando los principios de **Herencia** y **Polimorfismo**, según los requisitos del taller asignado.

---

## 📌 Características principales

- Registro de animales del zoológico
- Dos categorías principales: **Mamíferos** y **Reptiles**
- Clases específicas: **León**, **Elefante**, **Cocodrilo**, **Iguana**
- Cada animal tiene atributos y comportamientos únicos
- Implementación de métodos abstractos sobrescritos
- Demostración de polimorfismo mediante arrays de tipo `Animal`

---

## 🧱 Arquitectura y Jerarquía de Clases

### 🟦 1. Clase Abstracta Base – `Animal`

Define el contrato común para todos los animales del zoológico:

* Atributos: nombre, edad, peso
* Métodos abstractos: `emitirSonido()`, `moverse()`, `alimentarse()`
* Método concreto: `mostrarInfo()`

```java
Animal animal = new Leon("Simba", 5, 190.5, 8);
animal.emitirSonido(); // Polimorfismo
```

---

### 🟧 2. Clases Abstractas Intermedias

**`Mamifero`** – Hereda de Animal
* Atributo adicional: tipoPelaje
* Método específico: `amamantar()`

**`Reptil`** – Hereda de Animal
* Atributo adicional: esPonzoñoso
* Método específico: `regularTemperatura()`

---

### 🟩 3. Clases Concretas

Cada especie implementa los métodos abstractos con comportamientos únicos:

* **León**: rugir, melena característica
* **Elefante**: usar trompa.
* **Cocodrilo**: nadar, fuerza de mordida
* **Iguana**: trepar

```java
Leon leon = new Leon("Simba", 5, 190.5, 8);
leon.rugir();
```

---

## 🗂️ Estructura del Proyecto

```
zoologico/
 ├── src/
 │     ├── main/
 │     │     └── App.java
 │     └── modelos/
 │           ├── Animal.java
 │           ├── Mamifero.java
 │           ├── Reptil.java
 │           ├── Leon.java
 │           ├── Elefante.java
 │           ├── Cocodrilo.java
 │           └── Iguana.java
 └── README.md
```

---

## 🔄 Funcionamiento del Sistema

El archivo `App.java` realiza:

1. Creación de un array polimórfico de tipo `Animal[]`
2. Instanciación de 4 animales diferentes (León, Elefante, Cocodrilo, Iguana)
3. Recorrido del array mostrando información de cada animal
4. Llamada a métodos sobrescritos (polimorfismo en tiempo de ejecución)
5. Ejecución de métodos específicos usando casting

---

## 🎯 Justificación del diseño

**Herencia**:
Se implementa una jerarquía de 3 niveles que permite reutilizar código común y especializar comportamientos. La clase `Animal` define el contrato base, mientras que `Mamifero` y `Reptil` añaden características específicas de cada grupo.

**Polimorfismo**:
Se utiliza un array de tipo `Animal[]` que contiene diferentes especies. Esto permite tratar a todos los animales de forma uniforme, mientras cada uno ejecuta sus propias implementaciones de los métodos abstractos.

Esto permite:
* Reducir la duplicación de código
* Facilitar la extensión del sistema (agregar nuevas especies)
* Demostrar el comportamiento polimórfico en tiempo de ejecución
* Aplicar el principio de sustitución de Liskov

---

## ▶️ Cómo ejecutar

1. Clonar el repositorio
2. Compilar el proyecto:

```bash
javac src/**/*.java
```

3. Ejecutar:

```bash
java main.App
```

## Trabajo final
[PooZoologico.pdf](https://github.com/user-attachments/files/23734412/PooZoologico.pdf)
