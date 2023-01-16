package Homework12;

public class Complex implements ModelCalculation { // Основной класс, который реализует калькулятор (комплексные числа).
    Data data;
    ComplexModel model;

    public Complex(ComplexModel m, Data d) { // Конструктор
        model = m;
        data = d;
    }

    public void result(String type) { // Основной метод
        int a = data.getValue("\nВведите действительную часть первого числа: ");
        int b = data.getValue("\nВведите мнимую часть первого числа: ");
        int c = data.getValue("\nВведите действительную часть второго числа: ");
        int d = data.getValue("\nВведите мнимую часть второго числа: ");
        model.setA(a);
        model.setB(b);
        model.setC(c);
        model.setD(d);
        String result = model.result();
        String output = "(" + Integer.toString(a) + " + " + Integer.toString(b) + "f) " + type + " ("
                + Integer.toString(c) + " + " + Integer.toString(d) + "f)" + " = "
                + result;
        System.out.println("\n" + output);
        Logger.logger(output);
    }
}
