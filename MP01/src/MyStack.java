import java.util.ArrayList;
import java.util.Iterator;

public class MyStack<E> implements Iterable<E> {
    private int top;
    private ArrayList<E> list;
    class MyStackIterator<E> implements Iterator<E> {
        int index;
        public MyStackIterator() {
            index = list.size() - 1;
        }
        public boolean hasNext() {
            return index >= 0;
        }
        public E next() {
            E e = (E) list.get(index);
            index--;
            return e;
        }
    }
    public MyStack() {
        top = -1;
        list = new ArrayList<>();
    }
    public void push(E e) {
        list.add(e);
        top++;
    }
    public E pop() {
        if (top >= 0) {
//            E e = list.remove(top);
//            top--;
//            return e;
            return list.remove(top--);
        }
        return null;
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public Iterator<E> iterator() {
        return new MyStackIterator<>();
    }
}
