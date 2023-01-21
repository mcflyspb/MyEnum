package ru.linevo.mypakage;

public class Main {
    public static void main(String[] args) {
        A a = new A();


        B b = new B();
        b.no = 5;
        b.pro = 5;
        b.pub = 5;

        System.out.println(a.no);
    }
}