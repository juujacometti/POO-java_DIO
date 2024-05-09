package Ex01Metodos_ObjMsg;

public class Usuario_main {
    public static void main(String[] args) {

// Mercedes C180:

        // Atributos:
        Carro c180 = new Carro("Preto", "Mercedes Benz C180", 66);

    // Execução:
        System.out.println("\nOpção 1: \n Modelo: " + c180.getModelo());
        System.out.println(" Cor: " + c180.getCor());
        System.out.println(" Capacidade do tanque: " + c180.getCapacidadeTanque());
        System.out.printf(" Valor total para completar o tanque: %.2f", c180.valorTotalTanque());

// Porsche Panamera:

        //Atributos
        Carro panamera = new Carro("Azul Royal", "Porsche Panamera",80);

        //Execução:
        System.out.println("\nOpção 2: \n Modelo: " + panamera.getModelo());
        System.out.println(" Cor: " + panamera.getCor());
        System.out.println(" Capacidade do tanque: " + panamera.getCapacidadeTanque());
        System.out.printf(" Valor total para completar o tanque: %.2f", panamera.valorTotalTanque());

    }
}
