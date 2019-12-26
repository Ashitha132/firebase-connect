package com.example.fire;

public class Student {
    String name,rollno,adno,colg;

    public Student(String name, String rollno, String adno, String colg) {
        this.name = name;
        this.rollno = rollno;
        this.adno = adno;
        this.colg = colg;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    public String getAdno() {
        return adno;
    }

    public void setAdno(String adno) {
        this.adno = adno;
    }

    public String getColg() {
        return colg;
    }

    public void setColg(String colg) {
        this.colg = colg;
    }
}
