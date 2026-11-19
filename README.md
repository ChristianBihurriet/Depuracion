# Depuración con Java 21 y Visual Studio Code · 1.º DAM

📚 **Material didáctico | CFGS Desarrollo de Aplicaciones Multiplataforma**

**Curso:** 1.º DAM  
**Módulo:** Entornos de Desarrollo  
**Unidad:** UD03 — Depuración  
**Profesor y autor:** Christian Bihurriet  
**Centro educativo:** CESUR

Repositorio de prácticas para 1.º de DAM. Los 15 ejercicios enseñan a observar la ejecución de un programa, investigar comportamientos inesperados y diagnosticar errores con el depurador integrado de Visual Studio Code.

> Los ejercicios 01–05 funcionan correctamente. Los ejercicios 06–15 contienen fallos intencionados: forman parte de la práctica y no son errores de compilación.

## Objetivos de aprendizaje

- Iniciar y controlar una sesión de depuración.
- Detener la ejecución con breakpoints e inspeccionar variables.
- Avanzar con Step Over y Continue, iniciarse en Step Into y ver Step Out como demostración opcional.
- Añadir expresiones a Watch y usar breakpoints condicionales.
- Diferenciar un error de ejecución de un error lógico.
- Interpretar de forma básica el panel Call Stack (pila de llamadas).
- Aplicar una metodología ordenada para localizar, corregir y verificar fallos.

## Requisitos

- Visual Studio Code.
- JDK 21 instalado (no es necesario ejecutar `javac` desde una terminal).
- Extension Pack for Java de Microsoft, o al menos las extensiones oficiales Language Support for Java y Debugger for Java.

No se utiliza Maven, Gradle, paquetes Java ni `launch.json`.

## Abrir, ejecutar y depurar

1. Abre Visual Studio Code.
2. Selecciona **Archivo > Abrir carpeta** y elige la carpeta `DAM1-Entornos-UD03-Depuracion`.
3. Espera a que Java termine de cargar. Abre el archivo del ejercicio.
4. Para una ejecución normal, pulsa **Run** sobre `main`.
5. Para depurar, haz clic a la izquierda del número de una línea ejecutable para crear un breakpoint y pulsa **F5**. Si VS Code pregunta, elige **Java**.
6. Introduce los datos en la terminal integrada cuando el programa los solicite.

Cada archivo contiene una clase pública del mismo nombre y puede ejecutarse de manera independiente. Si F5 no se detiene, comprueba que el breakpoint esté sobre una instrucción ejecutable y que la extensión de Java haya terminado de iniciarse.

## Controles principales

| Acción | Atajo habitual | Para qué sirve |
|---|---:|---|
| Iniciar / Continue | F5 | Inicia o continúa hasta el siguiente breakpoint. |
| Step Over | F10 | Ejecuta la línea actual sin entrar en las llamadas que contiene. |
| Step Into | F11 | Intenta entrar en la llamada de la línea actual. |
| Step Out (opcional) | Shift + F11 | Termina la llamada actual y vuelve al nivel anterior. |
| Detener | Shift + F5 | Finaliza la sesión de depuración. |
| Activar/desactivar breakpoint | F9 | Cambia el breakpoint de la línea actual. |

Los atajos pueden variar si el sistema operativo los reserva. También están disponibles en la barra de depuración.

## Breakpoints, Variables y Watch

Un **breakpoint** detiene el programa *antes* de ejecutar la línea marcada. Es útil colocarlo justo antes de que cambie un dato importante o se tome una decisión. Se crea o elimina pulsando en el margen izquierdo del editor.

Cuando el programa está detenido, el panel **Variables** muestra los valores disponibles en ese momento. Una variable declarada en un bloque puede desaparecer al salir de él; eso es normal.

El panel **Watch** permite escribir expresiones que se recalculan en cada parada, por ejemplo `subtotal - descuento`, `contador <= limite` o `texto.length()`. No cambies valores desde el depurador durante estas prácticas: queremos observar la ejecución real.

Para crear un **breakpoint condicional**, haz clic con el botón derecho sobre un breakpoint, elige **Edit Breakpoint...**, selecciona **Expression** y escribe una condición booleana, como `contador == 5`. El programa solo se detendrá cuando se cumpla.

## Step Into y pila de llamadas

F11 intenta entrar en la llamada de la línea actual. En estas prácticas solo aparecen `main` y métodos ya conocidos de `String` o `Scanner`. VS Code puede omitir el código interno de la biblioteca estándar; si ocurre, la línea se ejecutará sin mostrar su implementación y es correcto. **Call Stack** indica dónde está detenida la ejecución: normalmente verás `main`; si se entra en una llamada, aparecerá encima. Usa Shift + F11 para volver. No es necesario comprender el funcionamiento interno de Java.

## Método de investigación

1. Escribe qué debería ocurrir con un caso concreto.
2. Ejecuta el programa y anota qué ocurre realmente.
3. Formula una hipótesis; no cambies código al azar.
4. Coloca breakpoints antes de decisiones, cálculos o bucles relevantes.
5. Avanza, inspecciona Variables y Watch, y contrasta la hipótesis.
6. Identifica la causa, realiza un cambio pequeño y vuelve a probar.
7. Verifica tanto el caso que fallaba como uno que ya funcionaba.

## Índice

| Ejercicio | Nivel | Archivo | Foco principal |
|---:|---|---|---|
| 01 | Fundamentos | `Ejercicio01_Variables.java` | Variables y F10 |
| 02 | Fundamentos | `Ejercicio02_Operaciones.java` | Cálculos encadenados |
| 03 | Fundamentos | `Ejercicio03_Condicionales.java` | Flujo en `if/else` |
| 04 | Fundamentos | `Ejercicio04_Bucles.java` | Contador y acumulador |
| 05 | Fundamentos | `Ejercicio05_Scanner.java` | Entrada y variables |
| 06 | Investigación | `Ejercicio06_Descuentos.java` | Límites y Watch |
| 07 | Investigación | `Ejercicio07_ClasificacionNotas.java` | Orden de condiciones |
| 08 | Investigación | `Ejercicio08_SumaAcumulada.java` | Límite del bucle y breakpoint condicional |
| 09 | Investigación | `Ejercicio09_Cadenas.java` | `String`, error de ejecución y F11 |
| 10 | Investigación | `Ejercicio10_ValidacionEntrada.java` | Validación y lógica booleana |
| 11 | Diagnóstico | `Ejercicio11_Tarifas.java` | Límites y comparación de texto |
| 12 | Diagnóstico | `Ejercicio12_Cajero.java` | Estado y menú repetitivo |
| 13 | Diagnóstico | `Ejercicio13_EntradasCine.java` | Cálculos y descuentos sucesivos |
| 14 | Diagnóstico | `Ejercicio14_Estadisticas.java` | Media, máximo y mínimo |
| 15 | Diagnóstico | `Ejercicio15_RetoFinal.java` | Investigación integral |

Los enunciados están en [`enunciados/NIVEL_01.md`](enunciados/NIVEL_01.md), [`enunciados/NIVEL_02.md`](enunciados/NIVEL_02.md) y [`enunciados/NIVEL_03.md`](enunciados/NIVEL_03.md).

## Sobre este repositorio

Este proyecto forma parte de una colección de recursos educativos desarrollados por **Christian Bihurriet** para sus clases del módulo de **Entornos de Desarrollo** en el Ciclo Formativo de Grado Superior en Desarrollo de Aplicaciones Multiplataforma.

Los ejercicios están adaptados deliberadamente al nivel del alumnado de 1.º de DAM y priorizan la claridad didáctica, la investigación guiada y el aprendizaje progresivo del depurador sobre la complejidad técnica.

---

**Autor:** Christian Bihurriet · **Centro educativo:** CESUR · **Módulo:** Entornos de Desarrollo

