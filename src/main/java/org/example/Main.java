package org.example;
import jarras.Jarra;
import static jarras.Mesa.Posicion.*;

public class Main {
    public static void main(String[] args) {
        Jarra jarraA = new Jarra(7);
        Jarra jarraB = new Jarra(5);

        jarraB.llena();
        System.out.print(jarraA + ", "+jarraB + "\n");

        jarraA.llenaDesde(jarraB);
        System.out.print(jarraA + ", "+jarraB + "\n");

        jarraB.llena();
        System.out.print(jarraA + ", "+jarraB + "\n");

        jarraA.llenaDesde(jarraB);
        System.out.print(jarraA + ", "+jarraB + "\n");

        jarraA.vacia();
        System.out.print(jarraA + ", "+jarraB + "\n");

        jarraA.llenaDesde(jarraB);
        System.out.print(jarraA + ", "+jarraB + "\n");

        jarraB.llena();
        System.out.print(jarraA + ", "+jarraB + "\n");

        jarraA.llenaDesde(jarraB);
        System.out.print(jarraA + ", "+jarraB + "\n");
    }
}