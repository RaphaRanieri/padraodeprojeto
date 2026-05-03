package org.example;

public class Detento {
    private final String nome;
    private double pena;
    private ReclusaoStrategy reclusaoStrategy;

    public Detento(String nome, double pena) {
        this.nome = nome;
        this.pena = pena;
    }

    public void setReclusaoStrategy(ReclusaoStrategy reclusaoStrategy) {
        this.reclusaoStrategy = reclusaoStrategy;
    }

    public String calcularReclusao() {
        if (reclusaoStrategy != null) {
            pena = reclusaoStrategy.aplicarPena(pena);
        }
        return "Pena de " + nome + ": " + pena + " anos";
    }
}
