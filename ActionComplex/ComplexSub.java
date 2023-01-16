package Homework12.ActionComplex;

import Homework12.ComplexModel;

public class ComplexSub implements ComplexModel {// Класс вычитание компексных чисел
    int a;
    int b;
    int c;
    int d;

    @Override
    public String result() {
        int re = a - c;
        int im = b - d;
        String result = "(" + Integer.toString(re) + " + " + Integer.toString(im) + "f)";
        return result;
    }

    @Override
    public void setA(int value) {
        this.a = value;
    }

    @Override
    public void setB(int value) {
        this.b = value;
    }

    @Override
    public void setC(int value) {
        this.c = value;
    }

    @Override
    public void setD(int value) {
        this.d = value;
    }
}