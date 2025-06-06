package homework2.animals;

import homework2.data.ColorData;

public abstract class AbsAnimal {
    private String name;
    private int age;
    private int weight;
    private ColorData color;

    public AbsAnimal(String name, int age, int weight, ColorData colorData) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = colorData;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setColor(ColorData color) {
        this.color = color;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getWeight() {
        return this.weight;
    }

    public ColorData getColor() {
        return this.color;
    }

    public void say() {
        System.out.println("Я говорю");
    }

    public void go() {
        System.out.println("Я иду");
    }

    public void drink() {
        System.out.println("Я пью");
    }

    public void eat() {
        System.out.println("Я ем");
    }

    @Override
    public String toString() {
        return String.format("Привет! Меня зовут %s, мне %d %s, я вешу - %d кг, мой цвет - %s.",
                this.name, this.age, ageString(this.age), this.weight, this.color.getName().toLowerCase());
    }

    public String ageString(int age) {
        String yearsString = "лет";
        int lastDigit = age % 10;

        if ((age > 4) && (age < 21)) {
            yearsString = "лет";
        } else if (lastDigit == 1) {
            yearsString = "год";
        } else if ((lastDigit >= 2) && (lastDigit <= 4)) {
            yearsString = "года";
        }
        return yearsString;
    }

}
