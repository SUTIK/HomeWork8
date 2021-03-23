package eu.senla.sutko.task8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {



            MyArrayList<Integer> dd = new MyArrayList<>(2);
            for (int i =0; i< dd.size();i++){
                dd.add(i,i);
                System.out.println("Значение "+ dd.get(i));
            }

            dd.add(3);
            dd.add(2);
            dd.add(6);
            dd.add(5);
            dd.add(7);
            dd.add(9);
            System.out.println("Размер " +  dd.size());

            dd.remove(1);
            System.out.println("Размер " +  dd.size());















    }
}
