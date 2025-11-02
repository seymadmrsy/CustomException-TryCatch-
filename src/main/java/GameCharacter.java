package org.example;
public class GameCharacter {
    private String name;
    private String characterClass;
    private int health;
    private int strength;


    private GameCharacter(Builder builder) {
        this.name = builder.name;
        this.characterClass = builder.characterClass;
        this.health = builder.health;
        this.strength = builder.strength;
    }


    public static class Builder {
        private String name;
        private String characterClass;
        private int health;
        private int strength;


        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setCharacterClass(String characterClass) {
            this.characterClass = characterClass;
            return this;
        }

        public Builder setHealth(int health) {
            this.health = health;
            return this;
        }

        public Builder setStrength(int strength) {
            this.strength = strength;
            return this;
        }

        public GameCharacter build() {
            return new GameCharacter(this);
        }
    }

    @Override
    public String toString() {
        return "Karakter: " + name +
                " | Sınıf: " + characterClass +
                " | Can: " + health +
                " | Güç: " + strength;
    }
}
