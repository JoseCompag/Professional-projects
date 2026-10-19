## Ejercicio 1
### 1) 
p = a ∨ (b ∧ c)

#### a) Identificar las cláusulas de p:
Estas son las siguientes: a, b y c.

#### b) Construya la tabla de verdad para p.

| `a` | `b` | `c` | `b ∧ c` | `a ∨ (b ∧ c)`|
|-----|-----|-----|---------|--------------|
|  T  |  T  |  T  |    T    |      T       |
|  T  |  T  |  F  |    F    |      T       |
|  T  |  F  |  T  |    F    |      T       |
|  T  |  F  |  F  |    F    |      T       |
|  F  |  T  |  T  |    T    |      T       |
|  F  |  T  |  F  |    F    |      F       |
|  F  |  F  |  T  |    F    |      F       |
|  F  |  F  |  F  |    F    |      F       |

#### c) En caso de ser posible, provea casos de test para satisfacer cobertura de cláusulas (CC) pero no de predicados (PC).
Requisitos para satisfacer Cobertura de Cláusulas (CC): 
a = true, a = false, b = true, b = false, c = true, c = false

Requisitos para satisfacer Cobertura de Predicados (CP):
p = true, p = false.

Casos de test que satisfacen CC pero no PC:
1: a = T, b = T, c = T 
2: a = F, b = T, c = T
3: a = T, b = F, c = F

Estos casos de test en conjunto satisfacen el criterio CC pero no el PC ya que en los tres casos, el predicado es evaluado a true.

#### d) En caso de ser posible, provea casos de test para satisfacer cobertura de predicados (PC) pero no de cláusulas (CC)
Casos de test para satifacer PC pero no CC:
1: a = T, b = T, c = T
2: a = F, b = T, c = F

#### e) Marque todos los pares de filas de la tabla que satisfacen cobertura correlacionada de cláusulas activas (CACC).
{TTT FTT, TTT FTF, TTT FFT, TTF FTT, TTF FTF, TTF FFT, TFT FTT, TFT FTF, TFT FFT} con a determinando a p.

#### f) Marque todos los pares de filas de la tabla que satisfacen cobertura restringida de cláusulas activas (RACC).
{TTF FTF, TFT FFT, TFF FFF, FTT FFT, FTT FTF}

### 2) p = a → (b → c)
#### a) 
Las cláusulas de p son: a, b y c

#### b) Tabla de verdad para p.

| `a` | `b` | `c` | `b → c` | `a → (b → c)`|
|-----|-----|-----|---------|--------------|
|  T  |  T  |  T  |    T    |      T       |
|  T  |  T  |  F  |    F    |      F       |
|  T  |  F  |  T  |    T    |      T       |
|  T  |  F  |  F  |    T    |      T       |
|  F  |  T  |  T  |    T    |      T       |
|  F  |  T  |  F  |    F    |      T       |
|  F  |  F  |  T  |    T    |      T       |
|  F  |  F  |  F  |    T    |      T       |

#### c) Casos de test para satisfacer cobertura de cláusulas (CC) pero no de predicados (PC).
Requisitos para satisfacer Cobertura de Cláusulas (CC): 
a = true, a = false, b = true, b = false, c = true, c = false

Requisitos para satisfacer Cobertura de Predicados (CP):
p = true, p = false.

Casos de test que satisfacen CC pero no PC:
1: a = T, b = T, c = T
2: a = F, b = F, c = F

#### d) Casos de test para satisfacer cobertura de predicados (PC) pero no de cláusulas (CC)
Casos de test para satifacer PC pero no CC:
1: a = T, b = T, c = F
2: a = T, b = T, c = T

#### e) Pares de filas de la tabla que satisfacen cobertura correlacionada de cláusulas activas (CACC).
Sabemos que a determina a p cuando (b → c) = False, entonces los pares de filas son los siguientes:
{TTF FTF}

Sabemos que b determina a p cuando a = True y c = False, entonces los pares de filas son los siguientes:
{TTF TFF}

Sabemos que c determina a p cuando a = True y b = True, entonces los pares de filas son los siguientes:
{TTT TTF}

#### f) Pares de filas de la tabla que satisfacen cobertura restringida de cláusulas activas (RACC).
{TTF FTF, TTF TFF, TTF TTT}

### 3) p = (a ∨ b) ∧ (c ∨ d)
#### a) 
Las cláusulas de p son: a, b, c y d.

#### b) Tabla de verdad para p.

| `a` | `b` | `c` | `d` | `a ∨ b` | `c ∨ d` | `(a ∨ b) ∧ (c ∨ d)`|
|-----|-----|-----|-----|---------|---------|--------------------|
|  T  |  T  |  T  |  T  |    T    |    T    |          T         |
|  T  |  T  |  T  |  F  |    T    |    T    |          T         |
|  T  |  T  |  F  |  T  |    T    |    T    |          T         |
|  T  |  T  |  F  |  F  |    T    |    F    |          F         |
|  T  |  F  |  T  |  T  |    T    |    T    |          T         |
|  T  |  F  |  T  |  F  |    T    |    T    |          T         |
|  T  |  F  |  F  |  T  |    T    |    T    |          T         |
|  T  |  F  |  F  |  F  |    T    |    F    |          F         |
|  F  |  T  |  T  |  T  |    T    |    T    |          T         |
|  F  |  T  |  T  |  F  |    T    |    T    |          T         |
|  F  |  T  |  F  |  T  |    T    |    T    |          T         |
|  F  |  T  |  F  |  F  |    T    |    F    |          F         |
|  F  |  F  |  T  |  T  |    F    |    T    |          F         |
|  F  |  F  |  T  |  F  |    F    |    T    |          F         |
|  F  |  F  |  F  |  T  |    F    |    T    |          F         |
|  F  |  F  |  F  |  F  |    F    |    F    |          F         |

#### c) Casos de test para satisfacer cobertura de cláusulas (CC) pero no de predicados (PC).
Requisitos para satisfacer Cobertura de Cláusulas (CC): 
a = true, a = false, b = true, b = false, c = true, c = false, d = true, d = false

Requisitos para satisfacer Cobertura de Predicados (CP):
p = true, p = false.

Casos de test que satisfacen CC pero no PC:
1: a = T, b = T, c = T, d = T   
2: a = T, b = F, c = F, d = T
2: a = F, b = T, c = T, d = F

#### d) Casos de test para satisfacer cobertura de predicados (PC) pero no de cláusulas (CC)
Casos de test para satifacer PC pero no CC:
1: a = T, b = T, c = T, d = T   
2: a = T, b = T, c = F, d = F
 
#### e) Pares de filas de la tabla que satisfacen cobertura correlacionada de cláusulas activas (CACC).
Sabemos que a determina a p cuando b = False y (c v d) = True, entonces los pares de filas son los siguientes:
{TFTT FFTT, TFTT FFTF, TFTT FFFT, TFTF FFTT, TFTF FFTF, TFTF FFFT, TFFT FFTT, TFFT FFTF, TFFT FFFT}

Sabemos que b determina a p cuando a = False y (c v d) = True, entonces los pares de filas son los siguientes:
{FTTT FFTT, FTTT FFTF, FTTT FFFT, FTTF FFTT, FTTF FFTF, FTTF FFFT, FTFT FFTT, FTFT FFTF, FTFT FFFT}

Sabemos que c determina a p cuando (a v b) = True y d = False, entonces los pares de filas son los siguientes:
{TTTF TTFF, TTTF TFFF, TTTF FTFF, TFTF TTFF, TFTF TFFF, TFTF FTFF, FTTF TTFF, FTTF TFFF, FTTF FTFF}

Sabemos que d determina a p cuando (a v b) = True y c = False, entonces los pares de filas son los siguientes:
{TTFT TTFF, TTFT TFFF, TTFT FTFF, TFFT TTFF, TFFT TFFF, TFFT FTFF, FTFT TTFF, FTFT TFFF, FTFT FTFF}

#### f) Pares de filas de la tabla que satisfacen cobertura restringida de cláusulas activas (RACC).
{FFTT TFTT, FFTF TFTF, FFFT TFFT, FFTT FTTT, FFTF FTTF, FFFT FTFT, TTTF TTFF, TFTF TFFF, FTTF FTFF,
TTFF TTFT, TFFF TFFT, FTFF FTFT}

### 4) p = a ⊕ b
#### a)
Las cláusulas de p son: a y b

#### b) Tabla de verdad para p.

| `a` | `b` | `a ⊕ b` |
|-----|-----|---------|
|  T  |  T  |    F    |
|  T  |  F  |    T    |
|  F  |  T  |    T    |
|  F  |  F  |    F    |

#### c) Casos de test para satisfacer cobertura de cláusulas (CC) pero no de predicados (PC).
Requisitos para satisfacer Cobertura de Cláusulas (CC): 
a = true, a = false, b = true, b = false

Requisitos para satisfacer Cobertura de Predicados (CP):
p = true, p = false.

Casos de test que satisfacen CC pero no PC:
1: a = T, b = F
2: a = F, b = T

#### d) Casos de test para satisfacer cobertura de predicados (PC) pero no de cláusulas (CC)
Casos de test para satifacer PC pero no CC:
1: a = T, b = T
2: a = T, b = F
 
#### e) Pares de filas de la tabla que satisfacen cobertura correlacionada de cláusulas activas (CACC).
{FT FF, TF FF} (estos también pueden ser: TT FT, TT TF)

#### f) Pares de filas de la tabla que satisfacen cobertura restringida de cláusulas activas (RACC).
{TT FT, TF FF, TT TF, FT FF} 


### 5) p = a ∨ b ∨ (c ∧ d)
#### a)
Las cláusulas de p son: a, b, c y d

#### b) Tabla de verdad para p.

| `a` | `b` | `c` | `d` | `c ∧ d` | `b ∨ (c ∧ d)` | `a ∨ b ∨ (c ∧ d)`|
|-----|-----|-----|-----|---------|---------------|------------------|
|  T  |  T  |  T  |  T  |    T    |      T        |        T         |
|  T  |  T  |  T  |  F  |    F    |      T        |        T         |
|  T  |  T  |  F  |  T  |    F    |      T        |        T         |
|  T  |  T  |  F  |  F  |    F    |      T        |        T         |
|  T  |  F  |  T  |  T  |    T    |      T        |        T         |
|  T  |  F  |  T  |  F  |    F    |      F        |        T         |
|  T  |  F  |  F  |  T  |    F    |      F        |        T         |
|  T  |  F  |  F  |  F  |    F    |      F        |        T         |
|  F  |  T  |  T  |  T  |    T    |      T        |        T         |
|  F  |  T  |  T  |  F  |    F    |      T        |        T         |
|  F  |  T  |  F  |  T  |    F    |      T        |        T         |
|  F  |  T  |  F  |  F  |    F    |      T        |        T         |
|  F  |  F  |  T  |  T  |    T    |      T        |        T         |
|  F  |  F  |  T  |  F  |    F    |      F        |        F         |
|  F  |  F  |  F  |  T  |    F    |      F        |        F         |
|  F  |  F  |  F  |  F  |    F    |      F        |        F         |

#### c) Casos de test para satisfacer cobertura de cláusulas (CC) pero no de predicados (PC).
Requisitos para satisfacer Cobertura de Cláusulas (CC): 
a = true, a = false, b = true, b = false, c = true, c = false, d = true, d = false.

Requisitos para satisfacer Cobertura de Predicados (CP):
p = true, p = false.

Casos de test que satisfacen CC pero no PC:
1: a = T, b = T, c = T, d = T
2: a = F, b = T, c = F, d = F
3: a = T, b = F, c = T, d = T

#### d) Casos de test para satisfacer cobertura de predicados (PC) pero no de cláusulas (CC)
Casos de test para satifacer PC pero no CC:
1: a = T, b = T, c = T, d = T
1: a = F, b = F, c = T, d = F

#### e) Pares de filas de la tabla que satisfacen cobertura correlacionada de cláusulas activas (CACC).
Sabemos que a determina a p cuando b v (c ∧ d) = False, entonces los pares de filas son los siguientes:
{TFTF FFTF, TFTF FFFT, TFTF FFFF, TFFT FFTF, TFFT FFFT, TFFT FFFF, TFFF FFTF, TFFF FFFT, TFFF FFFF}

Sabemos que b determina a p cuando a = False y (c ∧ d) = False, entonces los pares de filas son los siguientes:
{FTTF FFTF, FTTF FFFT, FTTF FFFF, FTFT FFTF, FTFT FFFT, FTFT FFFF, FTFF FFTF, FTFF FFFT, FTFF FFFF}

Sabemos que c determinia a p cuando a = False, b = False y d = True, entonces los pares de filas son los siguientes:
{FFTT FFFT}

Sabemos que d determina a p cuando a = False, b = False y c = True, entonces los pares de filas son los siguientes:
{FFTT FFTF}

#### f) Pares de filas de la tabla que satisfacen cobertura restringida de cláusulas activas (RACC).
{TFTF FFTF, TFFT FFFT, FFFF TFFF, FFTF FTTF, FFFT FTFT, FFFF FTFF, FFFT FFTT, FFTT FFTF}

## EJERCICIO 2

#### a)
Métodos en la clase `src/main/java/assignment5_exercises/checkit/CheckIt.java`.

#### b)
Análisis realizado en el archivo `docs/checkIt/checkItAnalysis.pdf`.

#### Test Suites

##### TEST SUITE T1:

| a | b  | c   | (b v c)  | a ∧ (b v c) |
|---|----|-----|----------|-------------|
| 1 | 1  | 1   | 1        | 1           |
| 1 | 1  | 0   | 1        | 1           |
| 1 | 0  | 1   | 1        | 1           |
| 1 | 0  | 0   | 0        | 0           |
| 0 | 1  | 1   | 1        | 0           |
| 0 | 1  | 0   | 1        | 0           |
| 0 | 0  | 1   | 1        | 0           |

##### TEST SUITE T2:
| a   | b   | c   | b v c    | a ∧ (b v c) |
|-----|-----|-----|----------|-------------|
| 0   | -   | -   | 0        | 0           |
| 1   | 1   | -   | 1        | 1           |
| 1   | 0   | 0   | 0        | 0           |
| 1   | 0   | 1   | 1        | 1           |

---

#### ¿Satisface T2 la cobertura de CACC?

Para determinar si el conjunto de pruebas T2 satisface la cobertura de cláusulas activas correlacionadas (CACC),
evaluemos las pruebas en función de la definición de CACC:

- Cláusula mayor a: a determina a p cuando (b||c) = true.

| a   | b   | c   | b v c   | a ∧ (b v c) |
|-----|-----|-----|---------|-------------|
| 1   | 1   | -   | 1       | 1           |
| 1   | 0   | 0   | 0       | 0           |

- Cláusula mayor b: b determina a p cuando a = true & c = false.

| a   | b   | c   | b v c    | a ∧ (b v c)   |
|-----|-----|-----|----------|---------------|
| 1   | 1   | -   | 1        | 1             |
| 1   | 0   | 0   | 0        | 0             |

- Cláusula mayor c: c determina a p cuando a = true & b = false.

| a   | b   | c   | b v c    | a ∧ (b v c)   |
|-----|-----|-----|----------|---------------|
| 1   | 0   | 0   | 0        | 0             |
| 1   | 0   | 1   | 1        | 1             |

El conjunto de pruebas **T2 NO satisface la cobertura de CACC**.
Las pruebas evalúan cada cláusula mayor a, b, y c, pero para la cláusula mayor a, a no toma el
valor **false**. Luego, para las cláusulas mayores b y c, el conjunto si toma valores **true** y **false**,
y las cláusulas menores están seleccionadas de tal forma que el cambio en la cláusula mayor determina el valor de
p.

## EJERCICIO 3

#### Cláusulas
- c1: curTemp < dTemp - thresholdDiff
- c2: override
- c3: curTemp < overTemp - thresholdDiff
- c4: timeSinceLastRun > minLag

#### Predicados
- p1: (c1 v (c2 ∧ c3)) ∧ c4
- p2: c2

#### Tabla
| c1 | c2 | c3 | c4 | c2 ∧ c3 | c1 v (c2 ∧ c3) | (c1 v (c2 ∧ c3)) ∧ c4 |
|----|----|----|----|---------|----------------|-----------------------|
| 0  | 0  | 0  | 0  | 0       | 0              | 0                     |
| 0  | 0  | 0  | 1  | 0       | 0              | 0                     |
| 0  | 0  | 1  | 0  | 0       | 0              | 0                     |
| 0  | 0  | 1  | 1  | 0       | 0              | 0                     |
| 0  | 1  | 0  | 0  | 0       | 0              | 0                     |
| 0  | 1  | 0  | 1  | 0       | 0              | 0                     |
| 0  | 1  | 1  | 0  | 1       | 1              | 0                     |
| 0  | 1  | 1  | 1  | 1       | 1              | 1                     |
| 1  | 0  | 0  | 0  | 0       | 1              | 0                     |
| 1  | 0  | 0  | 1  | 0       | 1              | 1                     |
| 1  | 0  | 1  | 0  | 0       | 1              | 0                     |
| 1  | 0  | 1  | 1  | 0       | 1              | 1                     |
| 1  | 1  | 0  | 0  | 0       | 1              | 0                     |
| 1  | 1  | 0  | 1  | 0       | 1              | 1                     |
| 1  | 1  | 1  | 0  | 1       | 1              | 0                     |
| 1  | 1  | 1  | 1  | 1       | 1              | 1                     |

#### a) Cobertura de cláusulas (CC)
- c1: T y F

| c1 | c2 | c3 | c4 | c2 ∧ c3 | c1 v (c2 ∧ c3) | (c1 v (c2 ∧ c3)) ∧ c4 |
|----|----|----|----|---------|----------------|-----------------------|
| 1  | 0  | 0  | 0  | 0       | 1              | 0                     |
| 0  | 0  | 0  | 0  | 0       | 0              | 0                     |

- c2: T y F

| c1 | c2 | c3 | c4 | c2 ∧ c3 | c1 v (c2 ∧ c3) | (c1 v (c2 ∧ c3)) ∧ c4 |
|----|----|----|----|---------|----------------|-----------------------|
| 0  | 1  | 0  | 0  | 0       | 0              | 0                     |
| 0  | 0  | 1  | 1  | 0       | 0              | 0                     |

- c3: T y F

| c1 | c2 | c3 | c4 | c2 ∧ c3 | c1 v (c2 ∧ c3) | (c1 v (c2 ∧ c3)) ∧ c4 |
|----|----|----|----|---------|----------------|-----------------------|
| 0  | 0  | 1  | 0  | 0       | 0              | 0                     |
| 0  | 0  | 0  | 1  | 0       | 0              | 0                     |

- c4: T y F

| c1 | c2 | c3 | c4 | c2 ∧ c3 | c1 v (c2 ∧ c3) | (c1 v (c2 ∧ c3)) ∧ c4 |
|----|----|----|----|---------|----------------|-----------------------|
| 0  | 1  | 0  | 1  | 0       | 0              | 0                     |
| 0  | 1  | 0  | 0  | 0       | 0              | 0                     |


> La evaluación de las cláusulas **c1**, **c2**, **c3** y **c4** se realiza tanto para
> los casos en que son **true** como **false**, cumpliendo así con la **cobertura de cláusulas (CC)**. 
> Sin embargo, no se logra la **cobertura de predicados (PC)**, 
> ya que no se garantiza que el predicado **p1** evalúe a **true** en todos los casos necesarios para alcanzar esa cobertura.
> Esto se observa en el test *thermostatTest_CC*.

#### b) Cobertura de predicados (PC)
- p1: T y F

 | c1 | c2 | c3 | c4 | c2 ∧ c3 | c1 v (c2 ∧ c3) | (c1 v (c2 ∧ c3)) ∧ c4 |
 |----|----|----|----|---------|----------------|-----------------------|
 | 1  | 1  | 0  | 1  | 0       | 1              | 1                     |
 | 1  | 0  | 1  | 0  | 0       | 1              | 0                     |

- p2: T y F

| c2 |
|----|
| 1  |
| 0  |

>La evaluación de los predicados **p1** y **p2** se realiza tanto para los casos en que son **true** como **false**, cumpliendo así con la **cobertura de predicados (PC)**. Sin embargo, no se logra la **cobertura de cláusulas (CC)**, ya que no se garantiza que la cláusula **c1** se evalúe a **false** en todos los casos necesarios para alcanzar esa cobertura. Esto se observa en el test *thermostatTest_PC*.

#### c) Cobertura correlacionada de cláusulas activas (CACC)

##### predicado p1

- c1

| c1 | c2 | c3 | c4 | c2 ∧ c3 | c1 v (c2 ∧ c3) | (c1 v (c2 ∧ c3)) ∧ c4 |
|----|----|----|----|---------|----------------|-----------------------|
| 1  | 0  | 0  | 1  | 0       | 1              | 1                     |
| 0  | 0  | 0  | 1  | 0       | 0              | 0                     |

- c2

| c1 | c2 | c3 | c4 | c2 ∧ c3 | c1 v (c2 ∧ c3) | (c1 v (c2 ∧ c3)) ∧ c4 |
|----|----|----|----|---------|----------------|-----------------------|
| 0  | 1  | 1  | 1  | 1       | 1              | 1                     |
| 0  | 0  | 1  | 1  | 0       | 0              | 0                     |

- c3

| c1 | c2 | c3 | c4 | c2 ∧ c3 | c1 v (c2 ∧ c3) | (c1 v (c2 ∧ c3)) ∧ c4 |
|----|----|----|----|---------|----------------|-----------------------|
| 0  | 1  | 1  | 1  | 1       | 1              | 1                     |
| 0  | 1  | 0  | 1  | 0       | 0              | 0                     |

- c4

| c1 | c2 | c3 | c4 | c2 ∧ c3 | c1 v (c2 ∧ c3) | (c1 v (c2 ∧ c3)) ∧ c4 |
|----|----|----|----|---------|----------------|-----------------------|
| 1  | 0  | 0  | 1  | 0       | 1              | 1                     |
| 1  | 0  | 0  | 0  | 0       | 1              | 0                     |


##### predicado p2

- c2

| c1 | c2    | c3 | c4 | c2 ∧ c3 | c1 v (c2 ∧ c3) | (c1 v (c2 ∧ c3)) ∧ c4 |
|----|-------|----|----|---------|----------------|-----------------------|
| 0  | **1** | 1  | 1  | 1       | 1              | 1                     |
| 1  | **0** | 0  | 1  | 0       | 1              | 1                     |

>**Comentario**: Se consideran las demás cláusulas, aparte de c2, para garantizar que el predicado p2 sea alcanzable.

## Ejercicio 4

#### p = Side1 <= 0 || Side2 <= 0 || Side3 <= 0
Reescribiendo: p = a v b v c.
Sabemos que a determina a p cuando (b v c) = False. La cláusula b determina a p cuando a = False y c = False, y por último c determina a p cuando a = False y b = False.
Por lo tanto, los siguientes pares de filas de la tabla de verdad de p satisfacen el criterio CACC:
{TFF FFF, FTF FFF, FFT FFF} 

#### p = Side1+Side2 <= Side3 || Side2+Side3 <= Side1 || Side1+Side3 <= Side2
Reescribiendo: a v b v c.
Nos encontramos frente al mismo caso que el predicado anterior, contando con los mismos pares de filas que satisfacen el criterio CACC.

#### p = triOut == 1 && Side1+Side2 > Side3
#### p = triOut == 2 && Side1+Side3 > Side2
#### p = triOut == 3 && Side2+Side3 > Side1
Reescribiendo: p = a ∧ b
Los pares de filas que satisfacen el crierio CACC son:
{TT FT, TF TT}

#### p = Side1 == Side2     con true y false
#### p = Side1 == Side3     con true y false
#### p = Side2 == Side3     con true y false
#### p = triOut == 0    con true y false
#### p = triOut > 3 con false y true
Reescribiendo: p = a
Los pares de filas que satisfacen el criterio CACC son:
{T, F}

Los casos de tests que satisfacen CACC para los predicados analizados se encuentran en el repositorio ```test/java/assignment5_exercises/TriTypTest.java```