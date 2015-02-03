import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 * Created by Craig on 2/3/2015.
 */
public class Queue<E>{
    private Node<E> beginMarker;
    private Node<E> endMarker;
    private int theSize;
    private int modCount = 0;

        private static class Node<E> {
            public E data;
            public Node<E> next;

        }

    public Queue(){
        beginMarker = null;
        endMarker = null;
        theSize = 0;
    }

    public void enqueue( E data){
        Node<E> temp = endMarker;
        endMarker = new Node<E>();
        endMarker.data = data;
        endMarker.next = null;
        if(theSize == 0){
            beginMarker = endMarker;
        }
        else{
            temp.next = endMarker;
        }
       theSize++;                                          //increment the queue's size
    }

    public E dequeue(){
        E error = null;
        if(theSize == 0){
            return error;
        }
        E data = beginMarker.data;
        beginMarker = beginMarker.next;
        theSize--;
        if(theSize == 0){
            endMarker = null;
        }
        return data;
    }
}
