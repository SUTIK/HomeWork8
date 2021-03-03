package eu.senla.sutko.task8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {



            MyArrayList<Integer> dd = new MyArrayList<>(12);
            for (int i =0; i< dd.getCapacity();i++){
                dd.add(i,i);
                System.out.println("Размер " +  dd.getSize());
                System.out.println("Значение "+ dd.get(i));
            }

             System.out.println("В массиве dd элементов "+dd.getSize());

            dd.add(13,1);
        System.out.println("В массиве dd элементов "+dd.getSize());
        System.out.println(dd.getCapacity());







    }
}
