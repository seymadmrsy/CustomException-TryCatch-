package org.example;
public class GameApp {
    public static void main(String[] args) {
        GameManager gameManager = GameManager.getInstance();
        gameManager.startGame();

        GameCharacter warrior = GameCharacter.Builder.newBuilder()
                .setName("Arthas")
                .setCharacterClass("Warrior")
                .setHealth(100)
                .setStrength(75)
                .build();

        System.out.println(warrior);
        gameManager.endGame();
    }
}
