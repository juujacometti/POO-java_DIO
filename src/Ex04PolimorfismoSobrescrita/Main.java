package Ex04PolimorfismoSobrescrita;

public class Main {
    public static void main(String[] args) {

// Nesses dois casos ocorrem o polimosfismo junto com a sobrescrita, pois estamos trabalhando com a classe mãe

// Criação de um vetor tipo 'ClasseMae':
        // Dentro do vetor existem objetos tipo 'ClasseFilha1', 'ClasseFilha2' e 'ClasseMae'
        ClasseMae[] classes = new ClasseMae[] {new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};

// Criação de um for:
        // For percorre os três objetos
        for (ClasseMae classe: classes) {
            // Solicitação do metodo1 de cada um dos objetos
            classe.metodo1();

        }

        System.out.println(" ");

        for (ClasseMae classe: classes) {
            classe.metodo2();
        }

        System.out.println(" ");

// Sobrescrita pura:
        // Se for trabalhado diretamente com o tipo, não haverá polimosfirmo
        ClasseFilha2 classeFilha2 = new ClasseFilha2();
        classeFilha2.metodo2();
     }
}
