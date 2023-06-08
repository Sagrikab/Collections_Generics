package com.collection;

class Storage<T>{
    private T item;
    public void setItem(T item){
        this.item=item;
    }
    public T getItem(){
        return this.item;
    }
}
public class GenericType {
    public static void main(String[] args) {
        Storage<String> storage=new Storage(); //If given Storage storage=new Storage it will consider of Object type and not other types
        storage.setItem("String Type");
        String item=storage.getItem();
        System.out.println(item);
    }
}
