package core;

import plugins.Armas;


public class Robobo extends Armas{
    private String nome;

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return nome;
    }
}