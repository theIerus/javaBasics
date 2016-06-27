package alg.lists;

import java.util.List;

public class MyLinkedList<T> {

    public ListItem<T> first;

    public void insertFirst(ListItem<T> item){
        if(first == null){
            first = item;
        }else {
            item.next = first;
            first = item;
        }
    }

    public boolean isEmpty(){
        return first == null;
    }

    public ListItem<T> find(ListItem<T> item){
        return first.find(item);
    }

}
