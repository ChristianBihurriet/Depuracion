# Nivel 2 — Investigación

Los programas de este nivel compilan, pero presentan uno o dos comportamientos problemáticos. Reproduce primero el fallo y formula una hipótesis antes de modificar el código. No se indica la línea responsable.

## Ejercicio 06 — Descuentos

**Archivo:** `02-investigacion/Ejercicio06_Descuentos.java`

La tienda aplica un 5 % al comprar entre 5 y 9 artículos y un 15 % al comprar 10 o más. Con menos de 5 no hay descuento.

| Cantidad | Precio | Esperado | Resultado inicial |
|---:|---:|---:|---:|
| 4 | 10 | 40,00 € | 40,00 € |
| 5 | 10 | 47,50 € | 47,50 € |
| 10 | 10 | 85,00 € | 95,00 € |
| 11 | 10 | 93,50 € | 93,50 € |

**Investiga:** ¿qué valores límite debes probar? Detén la ejecución antes de decidir el descuento. Añade `cantidad >= 10`, `subtotal`, `descuento` y `subtotal - descuento` a Watch. ¿Qué condición debería cumplirse con 10? Corrige y repite los cuatro casos.

## Ejercicio 07 — Clasificación de notas

**Archivo:** `02-investigacion/Ejercicio07_ClasificacionNotas.java`

La clasificación esperada es: menos de 5, Suspenso; desde 5 y menos de 7, Aprobado; desde 7 y menos de 9, Notable; desde 9 hasta 10, Sobresaliente.

| Nota | Esperado | Resultado inicial |
|---:|---|---|
| 4,9 | Suspenso | Suspenso |
| 5,0 | Aprobado | Aprobado |
| 7,5 | Notable | Aprobado |
| 9,2 | Sobresaliente | Aprobado |

**Investiga:** recorre las condiciones con F10. Cuando una condición es verdadera, ¿se siguen probando las demás? ¿En qué orden conviene comprobar intervalos que se solapan? Corrige el flujo y verifica también 7,0 y 9,0.

## Ejercicio 08 — Suma acumulada

**Archivo:** `02-investigacion/Ejercicio08_SumaAcumulada.java`

El programa debe sumar todos los enteros desde 1 hasta el número introducido, ambos incluidos.

| Entrada | Esperado | Resultado inicial |
|---:|---:|---:|
| 1 | 1 | 0 |
| 5 | 15 | 10 |
| 10 | 55 | 45 |

Coloca un breakpoint dentro del bucle y añade `numero`, `limite` y `suma` a Watch. Después usa un breakpoint condicional con `numero == limite - 1` para llegar a la última iteración ejecutada. **Investiga:** ¿qué valor falta por sumar? ¿Qué condición controla la permanencia en el bucle? Corrige y verifica los tres casos.

## Ejercicio 09 — Cadenas

**Archivo:** `02-investigacion/Ejercicio09_Cadenas.java`

Si se escribe exactamente `Java21`, el programa debe permitir el acceso, mostrar longitud 6 y último carácter `1`. Inicialmente deniega el acceso y después termina con un error de ejecución.

1. Usa `Java21` como entrada y observa ambas variables de texto.
2. Añade `claveIntroducida.equals(claveCorrecta)`, `claveIntroducida.length()` y `claveIntroducida.length() - 1` a Watch.
3. Compara el resultado de la expresión de Watch con la condición usada por el programa.
4. Antes de la última línea, observa el índice utilizado y los índices válidos para seis caracteres.

Prueba F11 sobre `length()`, `equals()` o `charAt()`. El depurador puede omitir el código interno de `String`; en ese caso observa simplemente el resultado y la pila de llamadas. Si entra, usa Shift + F11 para salir. **Reflexión:** ¿en qué se distingue este error de ejecución del error lógico anterior? Corrige ambos y prueba también `java21` (debe denegarse sin fallar).

## Ejercicio 10 — Validación de entrada

**Archivo:** `02-investigacion/Ejercicio10_ValidacionEntrada.java`

Solo deben aceptarse edades entre 0 y 120, ambas incluidas. Un valor fuera del intervalo debe mostrar un aviso y volver a solicitarse.

| Secuencia introducida | Comportamiento esperado | Resultado inicial |
|---|---|---|
| `25` | Acepta 25 | Acepta 25 |
| `-1`, después `20` | Rechaza -1 y acepta 20 | Acepta -1 |
| `121`, después `40` | Rechaza 121 y acepta 40 | Acepta 121 |
| `0` / `120` | Los acepta | Los acepta |

Añade a Watch `edad < 0`, `edad > 120` y la expresión completa empleada por el programa. ¿Puede una misma edad cumplir las dos comparaciones simples a la vez? Detén el programa en la decisión y formula la condición que significa “fuera por abajo **o** fuera por arriba”. Corrige las apariciones necesarias y vuelve a probar.

