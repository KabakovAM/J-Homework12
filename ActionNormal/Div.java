package Homework12.ActionNormal;

import Homework12.Model;

public class Div implements Model { // Класс деления действительных чисел
    int a;
    int b;

    @Override
    public int result() {
        return (a / b);
    }

    @Override
    public void setA(int value) {
        this.a = value;
    }

    @Override
    public void setB(int value) {
        this.b = value;
    }
}
