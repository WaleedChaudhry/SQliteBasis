package com.example.sqlitedb;

public class Employee {
    public Employee(int sno, String name, double increament) {
        this.sno = sno;
        this.name = name;
        this.increament = increament;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public double getIncreament() {
        return increament;
    }

    public void setIncreament(double increament) {
        this.increament = increament;
    }

    private int sno;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private double increament;
}
