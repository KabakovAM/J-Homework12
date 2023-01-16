package Homework12.ActionNormal;

import Homework12.Model;

public class Sub implements Model { // Класс вычитания действительных чисел
    int a;
    int b;

    @Override
    public int result() {
        return a - b;
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
