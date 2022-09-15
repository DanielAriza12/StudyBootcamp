public class EjercicioCarro {
    public static void main(String[] args) {
        Carro miCarro = new Carro();
        miCarro.PonerPuerta();
        System.out.println(miCarro.puertas);

    }
}
class Carro {
    public int puertas = 4;

    public void PonerPuerta() {
        this.puertas++;
    }
}

