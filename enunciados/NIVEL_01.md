# Nivel 1 — Fundamentos

Estos programas funcionan correctamente. No debes corregirlos: utilízalos para aprender a controlar la ejecución. Antes de avanzar una línea, intenta predecir el resultado.

## Ejercicio 01 — Variables

**Archivo:** `01-fundamentos/Ejercicio01_Variables.java`

1. Coloca un breakpoint en `puntos = puntos + bonus;` y pulsa F5.
2. Observa `puntos`, `bonus` y `penalizacion` en Variables.
3. Pulsa F10 una vez. Recuerda: el breakpoint detiene el programa antes de ejecutar la línea.
4. Avanza con F10 hasta el final y completa:

| Momento | `puntos` predicho | `puntos` observado |
|---|---:|---:|
| Al detenerse por primera vez | | |
| Tras sumar el bonus | | |
| Tras multiplicar por 2 | | |
| Tras restar la penalización | | |

**Reflexión:** ¿por qué el valor inicial todavía aparece al detenerse por primera vez? ¿Qué salida final esperabas?

## Ejercicio 02 — Operaciones

**Archivo:** `01-fundamentos/Ejercicio02_Operaciones.java`

Coloca un breakpoint en la declaración de `subtotal`. Inicia con F5 y usa F10 para seguir el cálculo. Localiza el momento exacto en que aparece cada variable.

| Variable | Operación que la produce | Valor observado |
|---|---|---:|
| `subtotal` | | |
| `descuento` | | |
| `base` | | |
| `impuesto` | | |
| `total` | | |

Añade `base + impuesto` a Watch. ¿Cuándo puede evaluarse por primera vez? ¿Coincide con `total` después de ejecutar su asignación? Pulsa F5 para continuar hasta terminar.

## Ejercicio 03 — Condicionales

**Archivo:** `01-fundamentos/Ejercicio03_Condicionales.java`

1. Coloca breakpoints en la primera condición y en `System.out.println(consejo);`.
2. Antes de ejecutar, predice la rama elegida para `temperatura = 27`.
3. Usa F10 y observa qué líneas se omiten.
4. Sin guardar cambios definitivos, prueba después con 8, 15 y 35.

| Temperatura | Consejo predicho | Consejo observado |
|---:|---|---|
| 8 | | |
| 15 | | |
| 27 | | |
| 35 | | |

**Reflexión:** cuando una condición resulta verdadera, ¿se evalúan las ramas posteriores del mismo `if/else if/else`?

## Ejercicio 04 — Bucles

**Archivo:** `01-fundamentos/Ejercicio04_Bucles.java`

Coloca un breakpoint en `acumulador = acumulador + contador;`. Pulsa F5 y observa `contador` y `acumulador`. En cada parada, predice el nuevo acumulador y ejecuta la asignación con F10.

| Iteración | `contador` | Acumulador antes | Acumulador después |
|---:|---:|---:|---:|
| 1 | | | |
| 2 | | | |
| 3 | | | |
| 4 | | | |
| 5 | | | |

Después, vuelve a iniciar y usa F5 en lugar de F10 para saltar de una iteración a la siguiente. ¿Qué diferencia práctica observas?

## Ejercicio 05 — Scanner

**Archivo:** `01-fundamentos/Ejercicio05_Scanner.java`

Usa como datos `Alicia` y `18`.

1. Coloca un breakpoint en `String nombre = teclado.nextLine();`.
2. Pulsa F5 y después F10. La terminal pedirá el nombre: escríbelo y pulsa Intro.
3. Comprueba cuándo adquiere valor `nombre`.
4. Repite la observación con `edad` y `edadSiguiente`.

| Momento | `nombre` | `edad` | `edadSiguiente` |
|---|---|---:|---:|
| Tras leer el nombre | | — | — |
| Tras leer la edad | | | — |
| Tras calcular el próximo año | | | |

**Reflexión:** ¿por qué el dato no aparece en la variable hasta después de completar la lectura? ¿Qué diferencia hay entre detenerse antes y después de la instrucción de `Scanner`?

