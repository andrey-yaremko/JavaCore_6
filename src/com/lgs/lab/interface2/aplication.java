package com.lgs.lab.interface2;

import com.lgs.lab.interface1.Plus;

public class aplication {
    public static void main (String[] args){

        MyCalculator Mc = new MyCalculator(10,2);
        System.out.println("Плюс ---- " + Mc.Plus());
        System.out.println("Мінус ---- " + Mc.Minus());
        System.out.println("Ділення ---- " + Mc.Devide());
        System.out.println("Множення ---- " + Mc.Multiply());

    }

}
