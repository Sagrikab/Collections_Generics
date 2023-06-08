package com.collection;

public class AppGenerics {
    public static void main(String[] args) {
        GenericMethods genericMethods=new GenericMethods();
//        System.out.println("The item returned is: "+genericMethods.showItem("String datatype"));
//        System.out.println("Multiple parameters in the generic methods");
//        genericMethods.printItems("ID:",5);

        Integer[] items={1,3,5,7};
        genericMethods.print(items);

    }
}
