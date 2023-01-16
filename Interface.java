package Homework12;

import java.util.Scanner;

import Homework12.ActionComplex.ComplexDiv;
import Homework12.ActionComplex.ComplexMult;
import Homework12.ActionComplex.ComplexSub;
import Homework12.ActionComplex.ComplexSum;
import Homework12.ActionNormal.Div;
import Homework12.ActionNormal.Mult;
import Homework12.ActionNormal.Sub;
import Homework12.ActionNormal.Sum;

public class Interface { // Пользовательский интерфейс. Реализованна защита от неправильного ввода.
    static Scanner iScanner = new Scanner(System.in);

    public static void mainMenu() {
        System.out.println("\nКалькулятор!");
        System.out.println("\nВыберите тип числа:\n1 - Действительное\n2 - Комплексное\n0 - Выйти из программы");
        switch (iScanner.nextLine()) {
            case ("1"):
                menu1();
                break;
            case ("2"):
                menu2();
                break;
            case ("0"):
                break;
            default:
                System.out.println("\nВведено неверное значение! Повторите ввод!");
                mainMenu();
                break;
        }
    }

    public static void menu1() {
        System.out.println("\nДействительные числа:");
        System.out.println(
                "\nВыберите действие:\n1 - Сложение\n2 - Вычитание\n3 - Умножение\n4 - Деление\n0 - Выйти в предыдущее меню");
        switch (iScanner.nextLine()) {
            case ("1"):
                Calculation a = new Calculation(new Sum(), new Data());
                a.result("+");
                menu3();
                break;
            case ("2"):
                Calculation b = new Calculation(new Sub(), new Data());
                b.result("-");
                menu3();
                break;
            case ("3"):
                Calculation c = new Calculation(new Mult(), new Data());
                c.result("*");
                menu3();
                break;
            case ("4"):
                Calculation d = new Calculation(new Div(), new Data());
                d.result("/");
                menu3();
                break;
            case ("0"):
                mainMenu();
                break;
            default:
                System.out.println("\nВведено неверное значение! Повторите ввод!");
                menu1();
                break;
        }
    }

    public static void menu2() {
        System.out.println("\nКомплексные числа:");
        System.out.println(
                "\nВыберите действие:\n1 - Сложение\n2 - Вычитание\n3 - Умножение\n4 - Деление\n0 - Выйти в предыдущее меню");
        switch (iScanner.nextLine()) {
            case ("1"):
                Complex a = new Complex(new ComplexSum(), new Data());
                a.result("+");
                menu3();
                break;
            case ("2"):
                Complex b = new Complex(new ComplexSub(), new Data());
                b.result("-");
                menu3();
                break;
            case ("3"):
                Complex c = new Complex(new ComplexMult(), new Data());
                c.result("*");
                menu3();
                break;
            case ("4"):
                Complex d = new Complex(new ComplexDiv(), new Data());
                d.result("/");
                menu3();
                break;
            case ("0"):
                mainMenu();
                break;
            default:
                System.out.println("\nВведено неверное значение! Повторите ввод!");
                menu2();
                break;
        }
    }

    public static void menu3() {
        System.out.println("\nПродолжить работу с калькулятором?\n1 - Да\n2 - Нет");
        switch (iScanner.nextLine()) {
            case ("1"):
                mainMenu();
                break;
            case ("2"):
                break;
            default:
                System.out.println("\nВведено неверное значение! Повторите ввод!");
                menu3();
                break;
        }
    }
}
