# TDD con FizzBuzz en GitHub Codespaces

Este proyecto implementa el clásico ejercicio FizzBuzz utilizando la metodología de Desarrollo Guiado por Pruebas (TDD) en Java, dentro de un entorno de GitHub Codespaces con Maven y JUnit.

## 📌 Requisitos Previos
- Cuenta en GitHub.
- Repositorio habilitado con GitHub Codespaces.
- Conocimientos básicos de Java.
- Familiaridad con TDD y JUnit.

## 🚀 Configuración del Entorno
1. **Abrir GitHub Codespaces:**
   - Abre tu repositorio en GitHub.
   - Haz clic en el botón `Code` y selecciona `Codespaces`.
   - Inicia un nuevo Codespace o selecciona uno existente.

2. **Generar el proyecto con Maven:**  
   Ejecuta en la terminal:

   ```bash
   mvn archetype:generate -DgroupId=com.example.TDD -DartifactId=TDD-lab -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
   ```

Esto creará la estructura del proyecto:

```
TDD-lab/
│── src/
│   ├── main/java/com/example/TDD/
│   │   ├── FizzBuzz.java
│   ├── test/java/com/example/TDD/
│   │   ├── FizzBuzzTest.java
│── pom.xml
│── README.md
```

## 📝 Implementación Paso a Paso

### 📌 Escribir la Primera Prueba
Edita `src/test/java/com/example/TDD/FizzBuzzTest.java` y agrega:

```java
package com.example.TDD;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {
    @Test
    void testFizzBuzzReturnsNumber() {
        assertEquals("1", FizzBuzz.fizzbuzz(1));
    }
}
```

### 📌 Implementar la Función
En `src/main/java/com/example/TDD/FizzBuzz.java`:

```java
package com.example.TDD;

public class FizzBuzz {
    public static String fizzbuzz(int n) {
        if (n % 3 == 0 && n % 5 == 0) return "FizzBuzz";
        if (n % 3 == 0) return "Fizz";
        if (n % 5 == 0) return "Buzz";
        return String.valueOf(n);
    }
}
```

Ejecutamos las pruebas:

```bash
mvn test
```

## 📊 Ejemplo de Uso
Podemos probar el código manualmente con un `Main.java`:

```java
package com.example.TDD;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            System.out.println(FizzBuzz.fizzbuzz(i));
        }
    }
}
```

Ejecutamos:

```bash
mvn compile
mvn exec:java -Dexec.mainClass="com.example.TDD.Main"
```

## 📈 Mejoras Futuras
- 📌 Soporte para otros rangos de números.
- 📌 Personalización de palabras en lugar de "Fizz" y "Buzz".
- 📌 Implementación de API REST para llamar a FizzBuzz.

## ✅ Buenas Prácticas
- 🔹 Escribir pruebas antes del código.
- 🔹 Ejecutar `mvn test` después de cada cambio.
- 🔹 Mantener el código limpio y reutilizable.



## 📜 Autor
Jose Alejandro Correa Rodriguez. 🚀