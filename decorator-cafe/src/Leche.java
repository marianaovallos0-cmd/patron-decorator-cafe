// CONCRETE DECORATOR: agrega leche al cafe que envuelve.
public class Leche extends DecoradorCafe {

    public Leche(Componente componente) {
        super(componente);   // le manda el cafe al padre para que lo guarde
    }

    @Override
    public String descripcion() {
        // primero la descripcion del de adentro, luego lo mio
        return componente.descripcion() + " + leche";
    }

    @Override
    public double costo() {
        // primero el costo del de adentro, luego sumo el mio
        return componente.costo() + 500;
    }
}
