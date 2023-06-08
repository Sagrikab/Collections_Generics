package com.collection;

class Store{
    private Object item;
    public void setItem(Object item){
        this.item=item;
    }
    public Object getItem(){
        return this.item;
    }
}
public class GenericsObject {
    public static void main(String[] args) {
        Store store=new Store();
        store.setItem(50);
        Integer item=(Integer) store.getItem(); // Here the return type of getItem is object, Integer is Object type
        System.out.println(item);
    }
}
