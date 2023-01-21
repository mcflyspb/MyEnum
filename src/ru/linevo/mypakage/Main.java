package ru.linevo.mypakage;

public class Main {
    public static void main(String[] args) {
        A a = new A();


        B b = new B();
        b.no = 2;
        b.pro = 2;
        b.pub = 2;

        System.out.println(a.no);
    }
}