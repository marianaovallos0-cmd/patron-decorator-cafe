// CONCRETE DECORATOR: agrega azucar al cafe que envuelve.
public class Azucar extends DecoradorCafe {

    public Azucar(Componente componente) {
        super(componente);   // le manda el cafe al padre para que lo guarde
    }

    @Override
    public String descripcion() {
        // primero la descripcion del de adentro, luego lo mio
        return componente.descripcion() + " + azucar";
    }

    @Override
    public double costo() {
        // primero el costo del de adentro, luego sumo el mio
        return componente.costo() + 200;
    }
}
