package Ex03PolimorfismoSobrescrita;

public class a_main {
    public static void main(String[] args) {

// Objetivo: 1- Crie classes e faça a relação de herança entre elas. 2- Realize Upcasts e Downcasts

// Criação do objeto:
        Funcionario funcionario = new Funcionario();

// Upcasts:
    // Gerente, vendedor e faxineiro são subtipos de 'Funcionário'
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

// Downcasts:
        Vendedor vendedor1 = (Vendedor) new Funcionario();
        
    }
}
