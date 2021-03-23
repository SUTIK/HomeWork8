package eu.senla.sutko.task8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {



            MyArrayList<Integer> dd = new MyArrayList<>();
            dd.add(0);
            dd.add(1);
            dd.add(2);
            dd.add(3);
            dd.add(4);
            dd.add(5);
            System.out.println("Размер " +  dd.size());

        for (int i =0; i< dd.size();i++){

            System.out.println("Значение "+ dd.get(i));
        }

            dd.remove(5);
            System.out.println("Размер " +  dd.size());
        for (int i =0; i< dd.size();i++){

            System.out.println("Значение "+ dd.get(i));
        }















    }
}
