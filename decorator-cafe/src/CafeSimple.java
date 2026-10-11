// CONCRETE COMPONENT: el cafe base. Hace el trabajo "real".
// No envuelve a nadie: es el fondo de la cadena.
public class CafeSimple implements Componente {

    @Override
    public String descripcion() {
        return "Cafe";
    }

    @Override
    public double costo() {
        return 2000;
    }
}
