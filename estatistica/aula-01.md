# Estatística - Aula 01 - 22/04/2025

## Distribuição de Frequência

Por constituir-se no tipo de tabela mais importante para a Estatística, vamos ver um estudo completo das distribuições de frequência.

### População

É o conjunto de indivíduos ou objetos que apresentam pelo menos uma característica em comum.

### Amostra

Considerando-se a impossibilidade, na maioria das vezes, do tratamento de todos os elementos da população, retira-se uma amostra.

### Variável discreta e variável contínua

A variável é discreta quando assume valores em pontos da reta real. Por exemplo: número de filhos de uma mulher: 0, 1, 2, 3…
Por outro lado, quando a variável pode assumir teoricamente qualquer valor em certo intervalo da reta real, ela será uma variável contínua.  
Ex.: Peso dos alunos: 60,45 kg, 72,3 kg...

### Representação da amostra

A seguir vamos apresentar os procedimentos para a representação das distribuições de frequências.

### Dados brutos

O conjunto dos dados numéricos obtidos após a crítica dos valores coletados constitui-se nos dados brutos.  
Assim: 24, 23, 22, 28, 35, 21, 23, 33, 34, 24, 21, 25, 36, 26, 22, 30, 32, 25, 26, 33, 34, 21, 31, 25, 31, 26, 25, 35, 33, 31, são exemplos de dados brutos.

### Rol

É o arranjo dos dados brutos em ordem crescente ou decrescente.  
Assim: 21, 21, 21, 22, 22, 23, 23, 24, 24, 25, 25, 25, 25, 26, 26, 26, 28, 30, 31, 31, 31, 32, 33, 33, 33, 34, 34, 35, 35, 36, constituem o rol.

### Amplitude total ou "range" (R)

É a diferença entre o maior e o menor valor observado. No exemplo $R = 36 - 21 = 15$

### Frequência absoluta ($F_i$)

É o número de vezes que o elemento aparece na amostra, ou o número de elementos pertencentes a uma classe. No exemplo $F_{21}$ = 3.

### Distribuição de frequência

É o arranjo dos valores e suas respectivas frequências. Assim, temos:


| $X_i$ |$F_i$ |
|:----: | :---:| 
| 21    |   3  | 
| 22    |   2  | 
| 23    |   2  | 
| 24    |   1  |
| 25    |   4  |
| 26    |   3  |
| 28    |   1  |
| 30    |   1  |
| 31    |   3  |
| 32    |   1  |
| 33    |   3  |
| 34    |   3  |
| 35    |   2  |
| 36    |   1  |

$\sum$ 30

Obs.: $x$ representa a variável.  
$\sum F_i = n$.  
$n$ é o tamanho da amostra.    

Exemplo de distribuição de frequência para variável contínua. Seja o $X_i$ o peso de 100 indivíduos:

| Classe     | $F_i$  |
|:----:      | :---:  | 
| $[45, 55)$ |   15   | 
| $[55, 65)$ |   30   |
| $[65, 75)$ |   35   |
| $[75, 85)$ |   15   |
| $[85, 95)$ |   5    |

Obs. 1: `[` significa que o elemento está incluído.  
Obs. 2: `)` significa que o elemento **não** está incluso no conjunto.  
Ex.: a primeira classe é formada por: [45, 46, 47, 48, 49, 50, 51, 52, 53, 54]. Note que o $45$ está no conjunto, enquanto o $55$ não está.   

### Número de classes (k)

Não há uma fórmula exata para o cálculo do número de classes.

- a) $k = 5$ para $\leq 25$ e $k \approx \sqrt{n}$, $n > 25$.
- b) Fórmula de Sturgs: $k \approx 1 + 3,22 \times$  $log$  $49$  $\forall$  $n$.

Seja $n = 49$, temos:

$k \approx 1 + 3,22 \times log 49 =$  
$k \approx 1 + 3,22 \times 1,69 =$  
$k \approx 1 + 5,44 =$  
$k \approx 6,44 =$  
$k = 7$