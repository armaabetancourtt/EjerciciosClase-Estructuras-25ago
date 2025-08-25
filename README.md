# README del Programa

**Autor:** Armando Betancourt Esparza  
**Descripción:** Proyecto en Java que implementa una cola de prioridad (heap mínimo) usando `PriorityQueue` y `PriorityNode`.  
Genera elementos aleatorios y los muestra en **orden ascendente de prioridad**.

---

## Estructura del proyecto

- `PriorityNode.java` → Clase genérica que representa un nodo con `priority` y `data`.  
- `PriorityQueue.java` → Cola de prioridad con métodos `push()` y `pop()`.  
- `Main.java` → Clase principal que genera elementos aleatorios y los imprime en consola.

---

## Requisitos

- Visual Studio Code con Java JDK 8 o superior o NetBeans

---

## Compilar desde línea de comandos

1. Abrir terminal y navegar a la carpeta raíz del proyecto.
2. Crear la estructura de paquetes:

```bash
mkdir -p Priority
```
3. Colocar PriorityNode.java, PriorityQueue.java y Main.java dentro de Priority/.

4. Compilar todos los archivos:
```bash
javac Priority/*.java
```

5. Ejecutar la clase Main:
```bash
java Priority.Main
```

6. Al ejecutar Main:

Se generan 10 elementos aleatorios con prioridad entre 1 y 100

Cada elemento se agrega a la PriorityQueue usando push()

Se imprimen los números aleatorios generados

Luego se extraen con pop() en orden ascendente de prioridad

Ejemplo de salida:

Agregando elementos aleatorios a la PriorityQueue:
```bash
62 90 48 22 71 42 86 81 62 84
```
Mostrando en orden ascendente de prioridad:
```bash
22 42 48 62 62 71 81 84 86 90
```
