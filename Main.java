package com.unpri.charactermanager;

import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterType;

public class Main {

    public static void main(String[] args) {

        Character c1 = new Character("Arthur", CharacterType.WARRIOR);
        Character c2 = new Character("Merlin", CharacterType.MAGE);
        Character c3 = new Character("Robin", CharacterType.ARCHER);

        System.out.println("=== DATA KARAKTER ===");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        System.out.println("\n=== DEMO LEVEL UP ===");

        c1.setLevel(5);

        System.out.println(c1);

        System.out.println("\n=== DEMO MANA & ISALIVE ===");

        Character c4 = new Character("Shadow", CharacterType.ROGUE);

        c4.setMana(150);

        System.out.println(c4);

        System.out.println("Apakah karakter hidup?");
        System.out.println(c4.isAlive());
    }
}