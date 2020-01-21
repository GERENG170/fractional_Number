package com.company;

public class Fractions {
    double number;

    public  Fractions(double number){
        this.number = number;
    }
    public  void  Celoe () {
        int celoe = (int) number;
        System.out.println("Целая часть данного числа: " + celoe);
    }
    public void Drob (){
        int cel = (int) number;
        double drob = number - cel;
        System.out.println("Дробная часть данного числа: "+ drob);
    }
    public void plus (){
        int cel = (int) number;
        double drob = number - cel;
        double sum = cel + drob;
        System.out.println("Сумма: "+ sum);
    }
    public void minus (){
        int cel = (int) number;
        double drob = number - cel;
        double sum = cel - drob;
        System.out.println("Разность: " + sum);

    }




}
