package org.example;
import jarras.Jarra;

public class Main {
    public static void main(String[] args) {
        Jarra jarraA = new Jarra(7);
        Jarra jarraB = new Jarra(4);

        jarraA.llena();
        System.out.print(jarraA + ", "+jarraB + "\n");

        jarraB.llenaDesde(jarraA);
        System.out.print(jarraA + ", "+jarraB + "\n");

        jarraB.vacia();
        System.out.print(jarraA + ", "+jarraB + "\n");

        jarraB.llenaDesde(jarraA);
        System.out.print(jarraA + ", "+jarraB + "\n");
    }
}