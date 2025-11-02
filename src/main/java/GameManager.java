package org.example;
public class GameManager {

    private static GameManager instance;
    private GameManager() {}

    public static GameManager getInstance() {
        if (instance == null) {
            instance = new GameManager();
        }
        return instance;
    }

    public void startGame() {
        System.out.println("Oyun başladı!");
    }

    public void endGame() {
        System.out.println("Oyun bitti!");
    }
}
