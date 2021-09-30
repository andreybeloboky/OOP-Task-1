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
}
