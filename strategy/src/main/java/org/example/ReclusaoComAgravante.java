package org.example;
public class ReclusaoComAgravante implements ReclusaoStrategy {
    @Override
    public double aplicarPena(double penaOriginal) {
        return penaOriginal * 1.30;
    }
}