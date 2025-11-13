package core;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Robobo r1 = new Robobo();
        r1.setNome("ROBerto");
        r1.iniciar();
        r1.recarregar();
        r1.recarregar();
        r1.atacar();
        r1.atacar();
        r1.finalizar();

    }
}
