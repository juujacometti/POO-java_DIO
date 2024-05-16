package Ex04PolimorfismoSobrescrita;

class ClasseFilha1 extends ClasseMae {

    @Override // Palavra utilizada para sobrescrever
    void metodo1() {
        System.out.println("Método 1 da classe filha 1");
    }

}
