package ru.linevo.mypakage;

public class A {
    private int pri = 1;
    public  int pub = 1;
    protected int pro = 1;
    int no = 1;

    A() {
        this.pri = 4;
        this.pub = 4;
        this.pro= 4;
        this.no = 4;
    }

    public int getPri() {
        int x = 100;
        return pri + x;
    }
}
