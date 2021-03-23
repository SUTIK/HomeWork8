package eu.senla.sutko.task8;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyArrayList<T>  implements  MyList<T>{


    private T [] Arr ;
    private int Capacity=10;
    private int Size=0;











    MyArrayList() //создает пустой список
    {
        Arr = (T[]) new Object [0];

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
        try {
            Arr[index]=o;
        }catch (ArrayIndexOutOfBoundsException ex){
            ex.printStackTrace();
            System.out.println("элемента с таким индексом не существует");
        }

    }

    @Override
    public boolean add(T obj) {
        try {
            T[] tempArr = Arr;
            Arr=(T[]) new Object[tempArr.length+1];
            for (int i = 0; i< tempArr.length;i++){
                Arr[i]= tempArr[i];
            }
            Arr [Arr.length-1]=obj;
            return true;
        } catch (ClassCastException ex){
            ex.printStackTrace();
            }
        return false;
    }


    @Override
    public boolean addAll(int index, MyList col) {
        return false;
    }


    @Override// возвращает объект из списка по индексу index ЕСТЬ
    public T get(int index) {
        try {
            return Arr[index];
        }catch (ArrayIndexOutOfBoundsException ex){
            ex.printStackTrace();
            System.out.println("Вышли за предел массива");;
        }return null;
    }


    @Override // возвращает индекс первого вхождения объекта obj в список. Если объект не найден, то возвращается -1
    public int indexOf(Object obj) {
        return 0;
    }
    @Override//возвращает индекс последнего вхождения объекта obj в список. Если объект не найден, то возвращается -1
    public int lastIndexOf(Object obj) {
        return 0;
    }

    @Override// возвращает объект ListIterator для обхода элементов списка ECTЬ
    public MyIterator <T> listIterator() {
        return new MyIterator<>(Arr);
    }

    @Override
    // удаляет объект из списка по индексу index, возвращая при этом удаленный объект
    public T remove(int index) {
        T[] tempArr = Arr;
        Arr=(T[]) new Object[tempArr.length-1];
        for (int i =0;i<index-1;i++){
            Arr[i]=tempArr[i];
        }
        for (int i =index+1;i< tempArr.length-1;i++){
            Arr[i]=tempArr[i];
        }
        return Arr[index];

    }

    @Override// присваивает значение объекта obj элементу, который находится по индексу index ECTb
    public T set(int index, T obj) {
        try {
            Arr[index]=(T) obj;
            return obj;
        }catch (ArrayIndexOutOfBoundsException ex){
            ex.printStackTrace();
            System.out.println("Вышли за предел массива");;
        }return null;

    }

    @Override// сортирует список с помощью компаратора comp
    public void sort(Comparator comp) {

    }

    @Override
    public List subList(int start, int end) {
        return null;
    }

    @Override
    public int size() {
        return Arr.length;
    }
}

