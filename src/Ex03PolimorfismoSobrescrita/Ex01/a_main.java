package Ex03PolimorfismoSobrescrita.Ex01;

public class a_main {
    public static void main(String[] args) {

// Objetivo: 1- Crie classes e faça a relação de herança entre elas. 2- Realize Upcasts e Downcasts

// Criação do objeto:

        Funcionario funcionario = new Funcionario();

// Upcasts:
    // Gerente, vendedor e faxineiro são subtipos de 'Funcionário'

        Funcionario gerente = new Gerente("Caio", "222", "1919");
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

// Downcasts:
        Vendedor vendedor1 = (Vendedor) new Funcionario();
        // Downcasts geralmente não são utilizados.

    }
}
