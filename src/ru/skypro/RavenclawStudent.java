package ru.skypro;

public class RavenclawStudent extends HogwartsStudent{

    private int cleverness;
    private int wisdom;
    private int wit;
    private int creativity;

    public RavenclawStudent(String name, int magic, int transgression, int cleverness, int wisdom, int wit, int creativity) {
        super(name, magic, transgression);
        this.cleverness = cleverness;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getCleverness() {
        return cleverness;
    }

    public void setCleverness(int cleverness) {
        this.cleverness = cleverness;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }


    public int ability() {
        return cleverness+wisdom+wit+creativity;
    }


    public void compareRavenclow(RavenclawStudent ravenclawStudent){
        int ability1 = ability();
        int ability2 = ravenclawStudent.ability();
        if (ability1>ability2){
            System.out.printf("Cтудент %s лучше Студента %s%n",getName(), ravenclawStudent.getName());
        }else if (ability2>ability1){
            System.out.printf("Cтудент %s лучше Студента %s%n", ravenclawStudent.getName(), getName());
        }else {
            System.out.printf("Cтудент %s такой же, как %s%n", ravenclawStudent.getName(), getName());
        }
    }
    @Override
    public String toString() {
        return String.format("%s; ум: %d; мудрость: %d; сообразительность: %d; творчество: %d ", // %s for String, %d - for Numbers
                super.toString(),
                cleverness,
                wisdom,
                wit,
                creativity);
    }
}

