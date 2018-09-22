package com.example.demo;

class Calculator {
    private int total;

    Calculator() {
        this.total = 0;
    }

    public void add(int i, int j) {
        total = i + j;
    }

    public void subtract(int i, int j) {
        total = i - j;
    }

    public int getTotal() {
        return total;
    }
}
