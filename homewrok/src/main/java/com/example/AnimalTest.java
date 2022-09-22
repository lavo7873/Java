package com.example;

public class AnimalTest {


      public static void main(String[] args) {
  
                  Dog dog = new Dog("Dog", "Lulu" ,"Domestic", "Female", 5, 10);
                  Cat cat = new Cat("Cat", "Kitty", "Domestic", "Male", 10, 15);
                  Racoon racoon = new Racoon("Racoon", "Rocky", "Male","Wild", 2, 16);
                  Whale whale = new Whale("Whale","Willy", "Female", "Ocean", 5, 45);
                  
          System.out.println();
          System.out.println(dog.toString());
          dog.bark();
          dog.eat();
          dog.greetHuman();
          dog.move();
          dog.sleep();
          dog.sound();
          dog.walk();
  
          System.out.println();
          System.out.println(cat.toString());
          cat.eat();
          cat.greetHuman();
          cat.move();
          cat.scratch();
          cat.sleep();
          cat.sound();
          cat.walk();
  
          System.out.println();
          System.out.println(racoon.toString());
          racoon.eat();
          racoon.move();
          racoon.scratch();
          racoon.sleep();
          racoon.sound();
  
          System.out.println();
          System.out.println(whale.toString());
          whale.eat();
          whale.move();
          whale.sleep();
          whale.sound();
          whale.swim();
  
  
  
      }
  }