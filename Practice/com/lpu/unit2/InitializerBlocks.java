package com.lpu.unit2;

public class InitializerBlocks {
    public static void main(String[] args) {

        System.out.println("Main method Executed");
        InitializerStudent iS = new InitializerStudent("Ummed", 24);

    }
}

class InitializerStudent{
    String name;
    int age;
    // Instance Initializer Block
    {
        System.out.println("Instance Initializer Block Executed - Preparing Student Object");
    }
    // Constructor
    InitializerStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    static {
        System.out.println("Static Block Executed - Initializing University Data");
    }


}
