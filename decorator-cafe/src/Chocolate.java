// CONCRETE DECORATOR: agrega chocolate al cafe que envuelve.
public class Chocolate extends DecoradorCafe {

    public Chocolate(Componente componente) {
        super(componente);   // le manda el cafe al padre para que lo guarde
    }

    @Override
    public String descripcion() {
        // primero la descripcion del de adentro, luego lo mio
        return componente.descripcion() + " + chocolate";
    }

    @Override
    public double costo() {
        // primero el costo del de adentro, luego sumo el mio
        return componente.costo() + 800;
    }
}
