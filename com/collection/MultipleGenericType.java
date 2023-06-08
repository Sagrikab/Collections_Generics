package com.collection;

class HashTable<K,V>{
    private K key;
    private V value;

    public HashTable(K key,V value){
        this.key=key;
        this.value=value;
    }

    @Override
    public String toString() {
        return "HashTable{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
public class MultipleGenericType {
    public static void main(String[] args) {
        HashTable<String,Integer> hashTable=new HashTable<>("Number",23);
        System.out.println(hashTable);
    }
}
