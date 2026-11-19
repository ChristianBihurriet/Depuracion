# Nivel 3 — Diagnóstico

En este nivel no se indica la ubicación de los fallos. Para cada ejercicio entrega una breve ficha con: caso usado, esperado, observado, hipótesis, evidencia del depurador, corrección y pruebas finales. Cambia una causa cada vez y comprueba que no has estropeado casos que ya funcionaban.

## Ejercicio 11 — Tarifas

**Archivo:** `03-diagnostico/Ejercicio11_Tarifas.java`

Reglas: tarifa general de 12 €; menores de 12 años, 6 €; personas de 65 años o más, 7 €. Después se descuentan 2 € si la persona es estudiante y escribe `si`.

| Edad | Estudiante | Precio esperado | Resultado inicial |
|---:|---|---:|---:|
| 10 | no | 6 € | 6 € |
| 65 | no | 7 € | 12 € |
| 20 | si | 10 € | 12 € |
| 70 | si | 5 € | 7 € |

Reproduce los casos, observa las decisiones con F10 y vigila `precio`, `edad` y el resultado de comparar el texto por contenido. Prueba los límites 11, 12, 64 y 65. ¿Los dos fallos tienen la misma naturaleza?

## Ejercicio 12 — Cajero

**Archivo:** `03-diagnostico/Ejercicio12_Cajero.java`

El saldo inicial es 500 €. Consultar no lo modifica; ingresar suma una cantidad; retirar la resta si hay saldo suficiente, incluyendo una retirada exactamente igual al saldo. La opción 0 termina.

En esta práctica, utiliza únicamente cantidades positivas para ingresos y retiradas.

Casos de prueba independientes (reinicia el programa para cada uno):

| Operaciones | Saldo final esperado | Resultado inicial |
|---|---:|---:|
| Ingresar 100, salir | 600 € | 400 € |
| Retirar 200, salir | 300 € | 300 € |
| Retirar 500, salir | 0 € | 500 € |

Coloca un breakpoint dentro del menú y otro justo antes de mostrar el saldo final. Añade `saldo` y `opcion` a Watch; cuando exista, observa también `cantidad`. Usa F5 para comparar varias vueltas del bucle. Localiza el momento exacto en que el estado deja de coincidir con tu predicción.

## Ejercicio 13 — Entradas de cine

**Archivo:** `03-diagnostico/Ejercicio13_EntradasCine.java`

Cada entrada cuesta 8 €. Los miércoles se descuenta el 25 %. Si además se tiene tarjeta, se descuenta después otro 10 % sobre el importe que quedaba. En otros días, la tarjeta aplica un 10 % al subtotal.

Para reproducir los casos, escribe las respuestas exactamente como aparecen en la tabla: `miercoles`, `si` o `no`, en minúsculas y sin tilde.

| Entradas | Día | Tarjeta | Total esperado | Resultado inicial |
|---:|---|---|---:|---:|
| 4 | lunes | no | 32,00 € | 12,00 € |
| 4 | lunes | si | 28,80 € | 10,80 € |
| 4 | miercoles | no | 24,00 € | 9,00 € |
| 4 | miercoles | si | 21,60 € | 10,80 € |

Sigue por separado la creación del subtotal y la aplicación de cada regla. En Watch resultan útiles `entradas * precioEntrada`, `subtotal - descuento` y las comparaciones de texto. ¿Qué valor debería conservarse cuando se aplica una segunda reducción?

## Ejercicio 14 — Estadísticas

**Archivo:** `03-diagnostico/Ejercicio14_Estadisticas.java`

El programa debe leer una cantidad positiva de valores y mostrar su media, máximo y mínimo, sin usar arrays.

| Valores | Media esperada | Máximo esperado | Mínimo esperado | Resultado inicial (media, máx., mín.) |
|---|---:|---:|---:|---|
| 2, 4, 6 | 4 | 6 | 2 | 6, 6, 0 |
| -2, -4, -6 | -4 | -2 | -6 | -6, 0, -6 |
| 5 | 5 | 5 | 5 | `Infinity`, 5, 0 |

Usa un breakpoint condicional que se active en la primera lectura (`posicion == 1`) y otro para la última (`posicion == cantidad`). Observa cómo deberían inicializarse los extremos a partir de datos reales y qué divisor representa el número de valores. No es necesario investigar el caso de cantidad cero: usa cantidades positivas.

## Ejercicio 15 — Reto final

**Archivo:** `03-diagnostico/Ejercicio15_RetoFinal.java`

La cafetería cobra 9,50 € por menú. El código exacto `DAM21` descuenta un 20 % y una recogida urgente añade 3 €. El nombre debe mostrarse completo. El número de menús debe ser positivo; si no lo es, el programa debe volver a pedirlo hasta recibir uno válido. Los pedidos de 5 o más menús son grandes.

| Nombre | Menús | Código | Urgente | Resultado esperado | Resultado inicial destacado |
|---|---:|---|---|---|---|
| Ana | 2 | ninguno | no | nombre Ana; total 19,00 € | nombre An; total 28,50 € |
| Luis | 5 | DAM21 | si | subtotal 47,50 €; descuento 9,50 €; total 41,00 € | subtotal 57,00 €; descuento 0 €; total 54,00 €; nombre Lui |
| Eva | 1 | DAM21 | no | total 7,60 € | total 19,00 €; nombre Ev |
| Nombre vacío | 1 | ninguno | no | vuelve a pedir un nombre | termina con error de ejecución |
| Eva | 0 | ninguno | no | rechaza 0 y vuelve a pedir los menús | continúa sin repetir; calcula 9,50 € |

Hay entre cuatro y seis causas intencionadas. Planifica la investigación:

1. Reproduce un caso y registra toda la salida.
2. Divide el cálculo en entrada, bucle de subtotal, descuento, suplemento y presentación.
3. Usa Watch para `menuActual`, `menus`, `subtotal`, `descuento`, `suplemento` y `subtotal - descuento + suplemento`.
4. Usa un breakpoint condicional en el bucle, por ejemplo `menuActual == menus`.
5. Ante un error de ejecución, mira la línea detenida y la parte superior de Call Stack.
6. Corrige una causa, reinicia y pasa todos los casos otra vez.

**Reflexión final:** clasifica cada causa encontrada como error de límite, comparación, operación, validación o uso de cadena. ¿Qué breakpoint aportó la evidencia más decisiva?

