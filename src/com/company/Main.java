package com.company;

public class Main {

    public static void main(String[] args) {
        createObject("Petter").print();
        createObject("Sun").print();
        createObject("Doch").print();


    }

    public static Printable createObject(String className) {
        switch (className) {
            case "Petter":
                Petter petter = new Petter(12, "Petter", "boxes");
                return petter;
            case "Sun":
                Sun sun = new Sun(23, "Katya", "muzic");
                return sun;
            case "Doch":
                Doch doch = new Doch(15, "Ira", "Tennis");
                return doch;

        }
        return null;


    }

}
/*Дедлайн 2 дня
f)  В главном классе Main создать 3 различных объекта классов 2й, 3й и 4й с помощью метода createOcject,
и распечатать по ним информацию методом print();
*/
