package it.accentur.javaFoundamentals.interfaces;

import java.util.ArrayList;



public class Developer implements Person {

    @Override
    public void speak() {

    }

    @Override
    public void eat() {

    }
    public Iterable<Developer> recruit () {
        ArrayList<Developer> a1 = new ArrayList<>(); // avere un ArrayList è una mia scelta
        Developer d1 = new Developer();
        Developer d2 = new Developer();
        a1.add(d1);
        a1.add(d2);
        return a1;
    }
}
