## PRACTICO 6 - Respuestas


### EXERCISE 1

#### a. ¿Cuántos mutantes generó la herramienta?
La herramienta Pitest generó 9 mutantes en total.

```
>> Line Coverage: 8/9 (89%)
>> Generated 9 mutations Killed 8 (89%)
>> Mutations with no coverage 0. Test strength 89%
>> Ran 14 tests (1.56 tests per mutation)
```

#### b. ¿Cuántos tests definió para matar todos los mutantes?
Para matar a 8 de 9 mutantes, se utilizaron 2 casos de tests en el archivo de test `PalindromeTests.java`.

#### c. ¿Qué puntaje de mutación fue capaz obtener antes de analizar los mutantes equivalentes?

El puntaje de mutación fue del 89%, ya que los mutantes eliminados fueron (8/9).

#### d. ¿Cuántos mutantes equivalentes hay? Justifique.

Hay **1 mutante equivalente**. Esto significa que no existe ningún test que pueda distinguir este mutante del programa original, ya que ambos siempre producen la misma salida, lo que generó el reporte.

El reporte indica: **changed conditional boundary → SURVIVED**, lo que significa que el mutante sobrevivió, ya que ningún test falló debido a esta mutación.

La mutación realizada fue en la siguiente línea:

```java
while(index < (l - 1) && res)
```

La modificación consistió en cambiar el operador relacional de `index < (l - 1)` a otro.

### EXERCISE 2

#### a. ¿Cuántos mutantes generó la herramienta?
La herramienta Pitest generó 39 mutantes en total.

```
>> Line Coverage: 25/26 (96%)
>> Generated 39 mutations Killed 39 (100%)
>> Mutations with no coverage 0. Test strength 100%
>> Ran 71 tests (1.82 tests per mutation)
```

#### b. ¿Cuántos tests definió para matar todos los mutantes?
Para matar a todos los mutantes, se utilizaron 23 casos de tests parametrizados en el archivo de test 
`TriTypTest.java`. Estos casos cubrieron todas las combinaciones necesarias para clasificar los triángulos y 
detectar las mutaciones generadas.

#### c. ¿Qué puntaje de mutación fue capaz obtener antes de analizar los mutantes equivalentes?

El puntaje de mutación fue del 100%, ya que todos los mutantes fueron eliminados (39/39).

#### d. ¿Cuántos mutantes equivalentes hay? Justifique.
En este caso, no hubo mutantes equivalentes, dado que todos los mutantes fueron eliminados con éxito 
(100% de mutation coverage).
