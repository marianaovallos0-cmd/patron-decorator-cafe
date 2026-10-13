// Programa de demostracion. Aqui se ARMAN las capas y se USAN.
public class Main {

    public static void main(String[] args) {

        // 1. Solo el cafe base (sin decoradores)
        Componente pedido1 = new CafeSimple();
        mostrar("Pedido 1", pedido1);

        // 2. Cafe + leche
        Componente pedido2 = new Leche(new CafeSimple());
        mostrar("Pedido 2", pedido2);

        // 3. Cafe + leche + azucar
        Componente pedido3 = new Azucar(new Leche(new CafeSimple()));
        mostrar("Pedido 3", pedido3);

        // 4. Cafe + leche + azucar + chocolate (todo apilado)
        Componente pedido4 = new Chocolate(new Azucar(new Leche(new CafeSimple())));
        mostrar("Pedido 4", pedido4);

        // 5. Cafe + chocolate (sin leche ni azucar), en una sola linea
        Componente pedido5 = new Chocolate(new CafeSimple());
        mostrar("Pedido 5", pedido5);

    }

    // Recibe CUALQUIER Componente: no sabe si es simple o decorado.
    private static void mostrar(String titulo, Componente c) {
        System.out.println(titulo + ": " + c.descripcion() + " -> $" + (int) c.costo());
    }
}
