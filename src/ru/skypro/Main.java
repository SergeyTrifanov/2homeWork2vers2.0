package ru.skypro;

import java.util.Arrays;
import java.util.Random;

public class Main {

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        GryffindorStudent harry = new GryffindorStudent("Гарри Поттер",generate(),generate() ,generate(),generate(),generate());
        GryffindorStudent ron = new GryffindorStudent("Рон Уизли",generate(), generate(),generate(),generate(),generate());
        RavenclawStudent luna = new RavenclawStudent("Полумна Лавгуд",generate(), generate(),generate(),generate(),generate(), generate());
        SlytherinStudent draco = new SlytherinStudent("Драко Малфой",generate(), generate(),generate(),generate(),generate(), generate(),generate());
        HufflepuffStudent sedrik = new HufflepuffStudent("седрик Диггори",generate(), generate(),generate(),generate(),generate());

        System.out.println(harry);
        System.out.println(ron);
        System.out.println(luna);
        System.out.println(draco);
        System.out.println(sedrik);

        harry.compareHogwarts(draco);
        harry.compareGryffindor(ron);

    }
    private static int generate(){
        return RANDOM.nextInt(100);
    }
}
