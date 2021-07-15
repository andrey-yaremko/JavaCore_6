package com.lgs.lab.interface2;
import com.lgs.lab.interface1.Numerable;

public class MyCalculator implements Numerable {

    public int firsNumber;
    public int twoNumber;

    public MyCalculator(int firsNumber, int twoNumber){

        this.firsNumber = firsNumber;
        this.twoNumber = twoNumber;
    }

    @Override
    public int Plus(){
        return firsNumber+twoNumber;
    }

    @Override
    public int Devide() {
        return firsNumber/twoNumber;
    }

    @Override
    public int Minus() {
        return firsNumber-twoNumber;
    }

    @Override
    public int Multiply() {
        return firsNumber*twoNumber;
    }
}
