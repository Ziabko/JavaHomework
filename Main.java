package de.telran;

public class Main {
    public static void main(String[] args) {

        Module1Lecture1Person person1 = new Module1Lecture1Person();
        person1.move();
        person1.talk();


        Module1Lecture1Person person2 = new Module1Lecture1Person("John", 30);
        person2.move();
        person2.talk();

   }
}