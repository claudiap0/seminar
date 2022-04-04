package main;

import clase.Autobuz;
import clase.Tramvai;

public class Program {
    public static void main(String[] args) throws CloneNotSupportedException {
        Autobuz autobuz = new Autobuz("Vasile");
        Tramvai tramvai = new Tramvai("Gigel");

        Autobuz autobuz1 = (Autobuz) autobuz.copy();
        Tramvai tramvai1 =(Tramvai) tramvai.copy();

        System.out.println(autobuz);
        System.out.println(tramvai);
        System.out.println(autobuz1);
        System.out.println(tramvai1);
    }
}
