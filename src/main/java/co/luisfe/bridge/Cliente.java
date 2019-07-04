package co.luisfe.bridge;

public class Cliente {

    public static void main(String[] args) {

        // Crear un objeto de tipo 'AbstraccionRefinada' indicándole un 'ImplementadorConcreto'
        Abstraccion abstraccionRefinada = new AbstraccionRefinada(new ImplementadorA());
        abstraccionRefinada.obtener();

        // Ahora le indicamos que use otra implementación para obtener la implementacion de B
        abstraccionRefinada.setImplementador(new ImplementadorB());
        abstraccionRefinada.obtener();
    }
}
