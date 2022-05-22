package ru.skypro;

public class GryffindorStudent extends HogwartsStudent{
    private int nobility;
    private int honor;
    private int bravery;

    public GryffindorStudent(String name, int magic, int transgression, int nobility, int honor, int bravery) {
        super(name, magic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }


    public void compareGryffindor(GryffindorStudent gryffindorStudent){
        int ability1 = ability();
        int ability2 = gryffindorStudent.ability();
        if (ability1>ability2){
            System.out.printf("Cтудент %s лучше Студента %s%n",getName(), gryffindorStudent.getName());
        }else if (ability2>ability1){
            System.out.printf("Cтудент %s лучше Студента %s%n", gryffindorStudent.getName(), getName());
        }else {
            System.out.printf("Cтудент %s такой же, как %s%n", gryffindorStudent.getName(), getName());
        }
    }


    public int ability() {
        return nobility+honor+bravery;
    }

    @Override
    public String toString() {
        return String.format("%s; благородство: %d; честь: %d; храбрость: %d ", // %s for String, %d - for Numbers
                super.toString(),
                nobility,
                honor,
                bravery);
    }
}
