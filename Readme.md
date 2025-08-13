# **DayOfWeekManager**  
**Aprendiendo a poner orden en la semana** 🗓️  

Este proyecto es una clase Java sencilla que gestiona días de la semana.  
Su objetivo no es impresionar con complejidad, sino demostrar cómo aplicar buenas prácticas de desarrollo y **reforzar el aprendizaje** de conceptos como **TDD** y la importancia de escribir código claro y mantenible.  

---

## **🎯 Propósito del Proyecto**  
- Practicar **Test-Driven Development** en un ejemplo concreto.  
- Comprender cómo las pruebas unitarias ayudan a construir código más seguro.  
- Mejorar la organización y legibilidad del código desde el inicio del desarrollo.  

Cada método aquí ha sido creado siguiendo un proceso paso a paso, con el aprendizaje como prioridad.  

---

## **🧪 Metodología TDD (Rojo → Verde → Refactor)**  
1. **🔴 Rojo** – Escribir un test que falle, confirmando que la funcionalidad aún no existe.  
2. **🟢 Verde** – Escribir el código mínimo para que el test pase.  
3. **🔄 Refactor** – Mejorar el código sin cambiar su comportamiento.  

Este ciclo asegura que cada cambio tenga un propósito y esté validado por pruebas.  

---

## **🛠️ Funcionalidades Implementadas**  
La clase `DayOfWeekManager` incluye métodos simples para gestionar días:  

- **`addDayOfWeek(String day)`** → Añade un día a la lista.  
- **`removeDay(String day)`** → Elimina un día existente.  
- **`getListLength()`** → Devuelve el número de días guardados.  
- **`getDay(int index)`** → Obtiene el día por su posición.  
- **`checkIfDayExists(String day)`** → Comprueba si un día está en la lista.  
- **`sortDaysAlphabetically()`** → Ordena los días alfabéticamente.  
- **`clearList()`** → Borra todos los días guardados.  

---

## **💻 Tecnologías Utilizadas**  
- **Java 17** – Lenguaje principal.  
- **Maven** – Gestión de dependencias y construcción.  
- **JUnit 5** – Framework para pruebas unitarias.  

---

## **🚀 Cómo Ejecutar las Pruebas**  
En la raíz del proyecto:  

```bash
mvn test
```

Para generar un reporte de cobertura con **JaCoCo**:  

```bash
mvn test jacoco:report
```

📍 El reporte estará en:  
```
/target/site/jacoco/index.html
```

---

## **📌 Nota Personal**  
Este proyecto es parte de mi formación como desarrolladora.  
No busca ser perfecto, sino mostrar mi progreso y el esfuerzo por aplicar buenas prácticas desde el principio.  
