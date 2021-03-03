package eu.senla.sutko.task8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
           // MyArrayList<Integer> dd = new MyArrayList<>();


            MyArrayList<String> qq= new MyArrayList<>(12);
            qq.add(0,"паца");
            qq.add(1,"dw");

            System.out.println(qq.getSize());
            System.out.println(qq.get(0));




    }
}
