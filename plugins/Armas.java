package plugins;

import java.util.Scanner;

public class Armas implements Plugin {
    private String nome;
    private String calibre;
    private int qntAcao = 0;
    private int danoAcao = 0;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCalibre() {
        return calibre;
    }

    public void setCalibre(String calibre) {
        this.calibre = calibre;
    }

    public int getQntAcao() {
        return qntAcao;
    }

    public void setQntAcao(int qntAcao) {
        this.qntAcao = qntAcao;
    }

    public int getDanoAcao() {
        return danoAcao;
    }

    public void setDanoAcao(int danoAcao) {
        this.danoAcao = danoAcao;
    }

    @Override
    public void definir() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome da arma");
        setNome(sc.nextLine());

        System.out.println("Digite o calibre da arma");
        setCalibre(sc.nextLine());
    }

    @Override
    public void iniciar() throws InterruptedException {
        definir();
        System.out.println("O Robobo pegou o(a)" + getNome() + "Calibre:" + getCalibre());
        recarregar();
    }

    @Override
    public void finalizar() {
        System.out.println("O robobo termina seus trabalhos por hoje");
        System.out.println("DANO CAUSADO: " + getDanoAcao());
        System.out.println("QUANT. DE AÇÕES:" + getQntAcao());
    }



    public void recarregar() throws InterruptedException {
        if(qntAcao < 6){
            System.out.println("Robobo flexiona a sombrancelha e recarrega +1");
            Thread.sleep(3000);
            this.qntAcao++;
        } else{
            System.out.println("Ele carrega muito ódio! Ele tenta se acalmar!");
        }
    }

    public void atacar() throws InterruptedException {
        if(this.qntAcao <= 0){
            System.out.println("Ficou sem ações! Ele se enfurece e recarrega");
            Thread.sleep(3000);
            this.qntAcao++;
        } else {
            System.out.println("Robobo mira...");
            Thread.sleep(3000);
            System.out.println("PLAU!");
            System.out.println("ROBOBO ARDILOSAMENTE ATACA!");
            this.qntAcao--;
            this.danoAcao++;
        }
    }



}
