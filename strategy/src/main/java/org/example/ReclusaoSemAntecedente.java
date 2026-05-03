package org.example;

public class ReclusaoSemAntecedente implements ReclusaoStrategy {
    @Override
    public double aplicarPena(double penaOriginal) {
        return penaOriginal * 0.95;
    }
}