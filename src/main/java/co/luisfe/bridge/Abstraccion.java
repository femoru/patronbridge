package co.luisfe.bridge;

public abstract class Abstraccion {

    // Referencia al Implementador
    private Implementador implementador;
    String nombre;

    // --------------------------
    public Implementador getImplementador() {
        return this.implementador;
    }

    // --------------------------
    public void setImplementador(Implementador implementador) {
        this.implementador = implementador;
    }

    // --------------------------
    // Método a implementar por las clases que hereden
    public abstract void obtener();
}
