package leetCode.code150;

import java.util.HashMap;

public class code146 {

    private HashMap<Integer, Node> caches;
    private int capacity = 0;
    private Node first ;
    private Node last ;

    public static void main(String[] args) {

    }

    public code146(int capacity) {
        this.capacity = capacity;
        caches = new HashMap<>(capacity);
    }

    public int get(int key) {
       Node node = caches.get(key);
       if (node==null){
           return -1;
       }
       moveToFirst(node);
       return node.value;
    }

    public void put(int key, int value) {
        Node node = caches.get(key);
        if (node ==null){
            if (caches.size()>=capacity){
                removeLast();
            }
            node = new Node();
            node.key = key;
        }
        node.value = value;
        moveToFirst(node);
        caches.put(key,node);
    }

    private void removeLast() {
       if (last!=null){
           last = last.pre;
           if (last==null){
               first = null;
           }else {
               last.next = null;
           }
       }
    }


    private void moveToFirst(Node node) {
        if (node == null || node == first){
            return;
        }

        if (last == null || first ==null){
            last = first = node;
            return;
        }

        if (node.pre!=null){
            node.pre.next = node.next;
        }
        if (node.next!=null){
            node.next.pre = node.pre;
        }
        
        node.pre =null;
        node.next = first;
        first.pre = node;
        first = node;
    }

    class Node {
        Node next;
        Node pre;
        int key;
        int value;
    }

}
