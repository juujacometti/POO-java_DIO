package Ex03PolimorfismoSobrescrita.Ex01;

import Ex03PolimorfismoSobrescrita.Ex01.Funcionario;

class Gerente extends Funcionario {

// Exemplo de como ficaria em um código real (Classe Filha):

// Atributos:
    // Os aributos criados dentro de uma classe filha só pertencem a ela mesma.
    String telefone;

// Contrutor (herança da Classe Mãe + Classe Filha):
    public Gerente(String nome, String cpf, String telefone) {
        super(nome, cpf);
        this.telefone = telefone;
    }
}
