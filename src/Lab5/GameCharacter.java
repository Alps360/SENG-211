package Lab5;

import java.util.Random;

public class GameCharacter {
    private static int characterId;
    private String name;
    private int level;
    private int health;
    private static int totalCharacters = 0;
    
    public GameCharacter(String name, int level, int health){
        this.name = name;
        this.level = level;
        this.health = health;
        Random rnd = new Random();
        this.characterId = 1000 + rnd.nextInt(9000);
        totalCharacters++;
    }

    public int getCharacterId() {
        return characterId;
    }

    public String getName() {
        return name;
    } 

    public int getLevel() {
        return level;
    }

    public int getHealth() {
        return health;
    }

    public static int getTotalCharacter() {
        return totalCharacters;
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0){
            health = 0;
        }
    }

    public void heal(int amount) {
        health = health + amount;
    }

    public String getInfo() {
        return "Character ID: " + characterId +
        " Name: " + name +
        " Level: " + level +
        " Health: " + health +
        " Total Characters: " + totalCharacters;
    }
}

