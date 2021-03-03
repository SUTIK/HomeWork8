package eu.senla.sutko.task8;

import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class MyArrayList<T>  implements  MyList<T>{

    public int getCapacity() {
        return Capacity;
    }

    private int Capacity=10;

    public int getSize() {
        return Size;
    }

    public T[] getArr() {
        return Arr;
    }

    private int Size=0;
    private T [] Arr ;

    MyArrayList() //создает пустой список
    {
        Arr = (T[]) new Object[Capacity];

    }

    MyArrayList(MyList<? extends T> col) // создает список, в который добавляются все элементы коллекции col.
    {

    }

    MyArrayList(int capacity)// создает список, который имеет начальную емкость capacity
    {
       this.Capacity=capacity;
       Arr = (T[]) new Object[Capacity];
    }



    @Override
    public void add(int index, T o) {

        if  (index>Capacity-1) {
                T[] Arr1 = (T[]) new Object[Capacity + Capacity / 2];//создаем новый массив в 1,5р ольше
                for (int i = 0; i < Arr.length; i++) {
                    Arr1[i] = Arr[i]; //пререкладывае мзначения в новый массив
                }
                System.out.println("Создали Arr1 и переложили");
                T Arr [] = (T[]) new Object[Arr1.length];
                for (int i = 0; i < Arr1.length; i++) {
                Arr[i] = Arr1[i]; //пререкладывае обратно


                }
            System.out.println("НОВЫЙ  Arr  создан");
                Capacity = Arr.length;
                Arr[index]=o;
                Size++;

        }
        else {
        Arr[index]=o;
        Size++;}

    }


    @Override
    public boolean addAll(int index, MyList col) {
        return false;
    }

    @Override
    public T get(int index) {
        return Arr[index];
    }

    @Override
    public int indexOf(Object obj) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object obj) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    // удаляет объект из списка по индексу index, возвращая при этом
    //удаленный объект
    public T remove(int index) {

        return null;
    }




    @Override
    public Object set(int index, Object obj) {
        return null;
    }

    @Override
    public void sort(Comparator comp) {

    }

    @Override
    public List subList(int start, int end) {
        return null;
    }
}
