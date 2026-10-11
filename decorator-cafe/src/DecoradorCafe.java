// DECORATOR (decorador base).
// Cumple la regla Componente Y guarda otro Componente adentro.
// Por defecto no agrega nada: solo le pregunta al de adentro.
public abstract class DecoradorCafe implements Componente {

    // El cafe que esta envolviendo (puede ser un CafeSimple u otro decorador).
    protected Componente componente;

    // Al hacer "new", recibe el cafe a envolver y lo guarda.
    public DecoradorCafe(Componente componente) {
        this.componente = componente;
    }

    @Override
    public String descripcion() {
        return componente.descripcion();
    }

    @Override
    public double costo() {
        return componente.costo();
    }
}
