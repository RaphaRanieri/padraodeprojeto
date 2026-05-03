package org.example;

public class ReclusaoReincidente implements ReclusaoStrategy {
    @Override
    public double aplicarPena(double penaOriginal) {
        return penaOriginal * 1.50;
    }
}
