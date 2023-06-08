package com.collection;

public class GenericMethods {

    public <T> T showItem(T item){
        System.out.println("The item is: "+item);
        return item;
    }

    //multiple type generic method
    public <T,V> void printItems(T t,V v){
        System.out.print(t.toString());
        System.out.print(v.toString());
    }

    //array as parameter in the generic method
    public <T> void print(T[] item){
        for(T items:item){
            System.out.print(items+" ");
        }
    }
    public static void main(String[] args) {

    }
}
