public class Usuario {
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
        System.out.println(" Valor total para completar o tanque: " + c180.valorTotalTanque());
    }
}