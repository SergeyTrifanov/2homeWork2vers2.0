package ru.skypro;

public abstract class HogwartsStudent {
    private String name;
    private int magic;
    private int transgression;


    public HogwartsStudent(String name, int magic, int transgression) {
        this.name = name;
        this.magic = magic;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    public int abilityHogwarts() {
        return magic + transgression;
    }

    public void print() {
        System.out.println(this);
    }

    public void compareHogwarts(HogwartsStudent hogwartsStudent) {
        int ability1 = abilityHogwarts();
        int ability2 = hogwartsStudent.abilityHogwarts();
        if (ability1 > ability2) {
            System.out.printf("Cтудент %s лучше Студента %s%n", getName(), hogwartsStudent.getName());
        } else if (ability2 > ability1) {
            System.out.printf("Cтудент %s лучше Студента %s%n", hogwartsStudent.getName(), getName());
        } else {
            System.out.printf("Cтудент %s такой же, как %s%n", hogwartsStudent.getName(), getName());
        }
    }

    @Override
    public String toString() {
        return String.format("Студент %s; сила магии: %d; сила трансгресии: %d,", name, magic, transgression);
    }
}
