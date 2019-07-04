package co.luisfe.bridge;

public class AbstraccionRefinada extends Abstraccion {

    public AbstraccionRefinada(Implementador implementador) {
        this.setImplementador(implementador);
    }

    // ------------------------
    @Override
    public void obtener() {
        System.out.println("obtener abstraccion refinada...");
        this.getImplementador().procesar();
    }
}
