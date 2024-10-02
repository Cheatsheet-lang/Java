# Java

Cheatsheet for Java Programming Language, you can find all the syntax and stuff related to Java Language.

## Table of Contents

* [Introduction](#introduction)
* [Hello World](#hello-world)
* [Data Types](#data-types)
* [Operators](#operators)
* [Control Statements](#control-statements)
* [Classes and Objects](#classes-and-objects)

## Introduction

Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible. It is a general-purpose programming language intended to let application developers write once, run anywhere (WORA), meaning that compiled Java code can run on all platforms that support Java without the need for recompilation.

## Hello World

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

## Data Types

Java is a statically-typed language. This means that all variables must be declared before they can be used. The basic data types provided by Java are:

Java Data Types are divided into two groups:
* Primitive Data Types
    * byte
    * short
    * int
    * long
    * float
    * double
    * char
    * boolean
* Non-Primitive Data Types
    * String
    * Array
    * Classes
    * Interface

## Operators

Operators are special symbols that perform specific operations on one, two, or three operands, and then return a result. Java provides a rich set of operators to manipulate variables.

* Arithmetic Operators
* Relational Operators
* Logical Operators
* Bitwise Operators
* Assignment Operators
* Conditional Operators

## Control Statements

Control statements are used to control the flow of execution in a program. In Java, we have the following control statements:

* if
* if-else
* switch
* while
* do-while
* for
* break
* continue

## Classes and Objects

Java is an object-oriented programming language. Everything in Java is associated with classes and objects, along with its attributes and methods. For example: in real life, a car is an object. The car has attributes, such as weight and color, and methods, such as drive and brake.

```java
class Car {
    int modelYear;
    String modelName;

    public Car(int year, String name) {
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        Car myCar = new Car(1969, "Mustang");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
}
```

## Multi-Threading

Java is a multi-threaded programming language which means we can develop multi-threaded program using Java. A multi-threaded program contains two or more parts that can run concurrently and each part can handle a different task at the same time making optimal use of the available resources specially when your computer has multiple CPUs.

```java
class MultiThreadingDemo extends Thread {
    public void run() {
        try {
            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
        } catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }

    public static void main(String[] args) {
        int n = 8;
        for (int i = 0; i < n; i++) {
            MultiThreadingDemo object = new MultiThreadingDemo();
            object.start();
        }
    }
}
```

## Collections

Java Collections Framework (JCF) is a set of classes and interfaces that implement commonly reusable collection data structures. Although referred to as a framework, it works in a manner of a library. The JCF provides both interfaces that define various collections and classes that implement them.

* List
* Set
* Map
* Queue
* Deque

## Generics

Generics in Java is similar to templates in C++. The idea is to allow type (Integer, String, … etc, and user-defined types) to be a parameter to methods, classes, and interfaces. For example, classes like HashSet, ArrayList, HashMap, etc use generics very well.

```java
class Test<T> {
    T obj;

    Test(T obj) {
        this.obj = obj;
    }

    public T getObject() {
        return this.obj;
    }
}
```

## Exception Handling

An exception is an event that occurs during the execution of a program that disrupts the normal flow of instructions. In Java, an exception is an object that wraps an error event that occurred within a method and contains:

* Information about the error including its type
* The state of the program when the error occurred
* Optionally, other custom information about the error

```java
public class Main {
    public static void main(String[] args) {
        try {
            int a[] = new int[2];
            System.out.println("Access element three: " + a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown: " + e);
        }
        System.out.println("Out of the block");
    }
}
```

## File Handling

Java provides the `java.io` package for file handling. File handling in Java can be done by Java I/O API. The Java.io package contains all the classes required for input and output operations.

* File
* FileInputStream
* FileOutputStream
* BufferedInputStream
* BufferedOutputStream
* DataInputStream
* DataOutputStream
* SequenceInputStream
* BufferedInputStream
* BufferedOutputStream
* PrintWriter
* FileReader
* FileWriter
* BufferedReader
* BufferedWriter

```java
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write("Files in Java might be tricky, but it is fun enough!");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
```
