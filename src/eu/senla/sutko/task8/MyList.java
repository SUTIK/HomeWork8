package eu.senla.sutko.task8;

import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public interface MyList<T> {


    void add(int index, T obj); //добавляет в список по индексу index объект obj


    boolean add(T obj);

    boolean addAll(int index, MyList<? extends T> col);// добавляет в список по индексу index все
    //элементы коллекции col. Если в результате добавления список был изменен, то
    //возвращается true, иначе возвращается false

    T get(int index);// возвращает объект из списка по индексу index

    int indexOf(Object obj);// возвращает индекс первого вхождения объекта obj в список. Если
    //объект не найден, то возвращается -1

    int lastIndexOf(Object obj);// возвращает индекс последнего вхождения объекта obj в список.
    //Если объект не найден, то возвращается -1

    MyIterator<T> listIterator ();// возвращает объект ListIterator для обхода элементов списка

    static <T> List<T> of(T... objects)// создает из набора элементов объект List
    {
        return null;
    }

    T remove(int index);// удаляет объект из списка по индексу index, возвращая при этом
    //удаленный объект

    T set(int index, T obj);// присваивает значение объекта obj элементу, который находится по
    //индексу index
    void sort(Comparator<? super T> comp);// сортирует список с помощью компаратора comp


    List<T> subList(int start, int end);

    int size ();




}
