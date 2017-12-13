package com.kstopa.employee;

import java.util.Random;

public class NameGenerator {
    private final String[] firstnames = {"Dawid", "Kacper", "Bartosz", "Klaudia", "Mateusz", "Artur", "Andrzej", "Grzegorz", "Tomasz"};
    private final String[] surnames = {"Kowalski", "Nowak", "Wisniewski", "Wojcik", "Kowalczyk", "Kaminski", "Lewandowski"};
    private final Random random = new Random();

    public String getFirstname() {
        return firstnames[random.nextInt(firstnames.length)];
    }

    public String getSurname() {
        return surnames[random.nextInt(surnames.length)];
    }

}
