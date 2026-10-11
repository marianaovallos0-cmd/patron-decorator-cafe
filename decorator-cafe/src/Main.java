// Programa de demostracion. Aqui se ARMAN las capas y se USAN.
public class Main {

    public static void main(String[] args) {

        // 1. Solo el cafe base (sin decoradores)
        Componente pedido1 = new CafeSimple();
        mostrar("Pedido 1", pedido1);

        // 2. Cafe + leche
        Componente pedido2 = new CafeSimple();
        pedido2 = new Leche(pedido2);
        mostrar("Pedido 2", pedido2);

        // 3. Cafe + leche + azucar
        Componente pedido3 = new CafeSimple();
        pedido3 = new Leche(pedido3);
        pedido3 = new Azucar(pedido3);
        mostrar("Pedido 3", pedido3);

        // 4. Cafe + leche + azucar + chocolate (todo apilado)
        Componente pedido4 = new CafeSimple();
        pedido4 = new Leche(pedido4);
        pedido4 = new Azucar(pedido4);
        pedido4 = new Chocolate(pedido4);
        mostrar("Pedido 4", pedido4);

        // 5. Combinacion distinta SIN crear ninguna clase nueva:
        //    cafe + chocolate (sin leche ni azucar), en una sola linea
        Componente pedido5 = new Chocolate(new CafeSimple());
        mostrar("Pedido 5", pedido5);
    }

    // Recibe CUALQUIER Componente: no sabe si es simple o decorado.
    private static void mostrar(String titulo, Componente c) {
        System.out.println(titulo + ": " + c.descripcion() + " -> $" + (int) c.costo());
    }
}
