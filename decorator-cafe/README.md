# Patron Decorator - Ejemplo del cafe (Java)

Ejemplo de ISW-2 sobre el patron de diseno estructural **Decorator**.
Permite agregar ingredientes (leche, azucar, chocolate) a un cafe en tiempo
de ejecucion, **sin crear una clase por cada combinacion**.

## Estructura

| Rol en el patron     | Clase            |
|----------------------|------------------|
| Component            | `Componente`     |
| Concrete Component   | `CafeSimple`     |
| Decorator            | `DecoradorCafe`  |
| Concrete Decorators  | `Leche`, `Azucar`, `Chocolate` |

## Como ejecutarlo

Requisito: tener Java (JDK 11 o superior) instalado.

```bash
cd src
javac *.java
java Main
```

## Salida esperada

```
Pedido 1: Cafe -> $2000
Pedido 2: Cafe + leche -> $2500
Pedido 3: Cafe + leche + azucar -> $2700
Pedido 4: Cafe + leche + azucar + chocolate -> $3500
Pedido 5: Cafe + chocolate -> $2800
```

## Como funciona

Cada decorador cumple la misma interfaz que el cafe y guarda dentro otro
`Componente`. Al pedir `descripcion()` o `costo()`, la llamada baja hasta el
`CafeSimple` y cada capa agrega lo suyo al volver.

## Integrantes

- Maria Paula Marin Soler
- Mariana Ovallos Romero
- Sergio Andres Valderrama Velez
- Jonathan Barrera Fernandez
