// Exercício POO
// OBJETIVO 1: Criar uma classe. / OBJETIVO 2: Criar atributos para a classe. // OBJETIVO 3: Criar métodos. // OBJETIVO 4: Criar objetos.

// Classe:
class Carro {

    //Atributos:
        String cor;
        String modelo;
        int capacidadeTanque;

    //Construtor:
    // Métodos:

    // Cor
    void setCor(String cor) {
        this.cor = cor;
    }
    String getCor() {
        return cor;
    }

    // Modelo:
    void setModelo (String modelo) {
        this.modelo = modelo;
    }
    String getModelo () {
        return modelo;
    }

    // Capacidade do tanque:
    void setCapacidadeTanque (int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }
    int getCapacidadeTanque () {
        return capacidadeTanque;
    }

    // Método do valor total para encher o tanque:
    double valorTotalTanque () {
        double valorCombustivel = 5.52;
        return capacidadeTanque * valorCombustivel;
    }
}