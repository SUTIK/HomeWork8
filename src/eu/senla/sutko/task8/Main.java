package eu.senla.sutko.task8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {



            MyArrayList<Integer> dd = new MyArrayList<>(2);
            for (int i =0; i< dd.size();i++){
                dd.add(i,i);
                System.out.println("Размер " +  dd.size());
                System.out.println("Значение "+ dd.get(i));
            }
            System.out.println("Создали  массив");

            dd.add(3);
            dd.add(2);
         System.out.println("Добавили значения");


            System.out.println("Размер " +  dd.size());
             System.out.println(dd.get(3));
            dd.set(2,7);
             System.out.println("Значение "+ dd.get(3));











    }
}
