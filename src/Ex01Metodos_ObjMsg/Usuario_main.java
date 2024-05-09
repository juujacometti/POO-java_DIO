package Ex01Metodos_ObjMsg;

public class Usuario_main {
    public static void main(String[] args) {

// Mercedes C180:
        Carro c180 = new Carro();

    //Atributos
        c180.setCor("Preto");
        c180.setModelo("Mercedes Benz C180");
        c180.setCapacidadeTanque(66);

    // Execução:
        System.out.println("\nOpção 1: \n Modelo: " + c180.getModelo());
        System.out.println(" Cor: " + c180.getCor());
        System.out.println(" Capacidade do tanque: " + c180.getCapacidadeTanque());
        System.out.printf(" Valor total para completar o tanque: %.2f", c180.valorTotalTanque());

// Porsche Panamera:
        Carro panamera = new Carro();

        // Atributos:
        panamera.setCor("Azul Royal");
        panamera.setModelo("Porsche Panamera");
        panamera.setCapacidadeTanque(80);

        //Execução:
        System.out.println("\nOpção 2: \n Modelo: " + panamera.getModelo());
        System.out.println(" Cor: " + panamera.getCor());
        System.out.println(" Capacidade do tanque: " + panamera.getCapacidadeTanque());
        System.out.printf(" Valor total para completar o tanque: %.2f", panamera.valorTotalTanque());

// BMW X6:
        Carro X6 = new Carro();

    }
}
