package Homework12;

public class Calculation implements ModelCalculation { // Основной класс, который реализует калькулятор (действительные числа).
    Data data;
    Model model;

    public Calculation(Model m, Data d) { // Конструктор
        model = m;
        data = d;
    }

    public void result(String type) { // Основной метод
        int a = data.getValue("\nВведите первое число: ");
        int b = data.getValue("\nВведите второе число: ");
        model.setA(a);
        model.setB(b);
        int result = model.result();
        String output = Integer.toString(a) + " " + type + " " + Integer.toString(b) + " = "
                + Integer.toString(result);
        System.out.println("\n" + output);
        Logger.logger(output);
    }
}
