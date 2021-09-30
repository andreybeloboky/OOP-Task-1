package com.company;

public class Farm {

    private Cat[] cats;
    private Dog[] dogs;
    private Cow[] cows;

    /**
     * @param cats - array cats from ages and names;
     * @param dogs - array dogs from ages and names;
     * @param caws - array caws from ages and names;
     */
    public Farm(Cat[] cats, Dog[] dogs, Cow[] caws) {
        this.cats = cats;
        this.dogs = dogs;
        this.cows = caws;
    }

    private int totalAgeCats = 0;

    public void cats() {
        for (Cat cat : cats) {
            int age = cat.ageCat();
            totalAgeCats += age;
        }
    }

    private int totalAgeDogs = 0;

    public void dogs() {
        for (Dog dog : dogs) {
            int age = dog.ageDog();
            totalAgeDogs += age;
        }
    }

    private int totalAgeCows = 0;

    public void cows() {
        for (Cow cow : cows) {
            int age = cow.ageCow();
            totalAgeCows += age;
        }
    }

    public void middleValueAge() {
        System.out.println((totalAgeCats + totalAgeDogs + totalAgeCows) / (cats.length + dogs.length + cows.length));
    }
}
