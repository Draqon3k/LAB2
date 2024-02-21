class GameBase {

    public GameBase() {
        System.out.println("Love this World.");
    }

    public GameBase(String message) {
        this();
        System.out.println("Jocul: " + message);
    }

    public GameBase(int value) {
        this("Tokyo Drift");
        System.out.println("Volumul Jocului: " + value);
    }

    public void play() {
        System.out.println("Metoda play() - Incepe jocul.");
    }

    public void pause() {
        System.out.println("Metoda pause() - pauză.");
    }
}

class Games extends GameBase {
    public Games() {
        super("BlackClover.");
        System.out.println("Love this World.");
    }

    public Games(String message) {
        super(message);
        System.out.println("Jocul: " + message);
    }

    public void specialSkill() {
        System.out.println("Metoda specialSkill() - Utilizare Skillului.");
    }
    public void multiplayerMode() {
        System.out.println("Metoda multiplayerMode() - Modul multiplayer activat.");
    }

    public void achievementUnlocked(String achievement) {
        System.out.println("Metoda achievementUnlocked() - Realizare deblocată: " + achievement);
    }
}

public class Main {
    public static void main(String[] args) {

        // a) Obiectul clasei de bază folosind constructorul clasei de bază;
        System.out.println("First object:");
        GameBase baseObject = new GameBase(3);

        // b) Obiectul clasei derivate folosind constructorul clasei de bază;
        System.out.println("\nSecond object:");
        Games derivedObjectFromBase = new Games("NightBoor.");

        // c) Obiectul clasei derivate folosind constructorul clasei derivate;
        System.out.println("\nAfter second object:");
        Games derivedObject = new Games();

        // d) Obiectul clasei de bază folosind constructorul clasei derivate;
        System.out.println("\nLast object:");
        GameBase baseObjectFromDerived = new Games("New World.");


        System.out.println("\nMethods:");

        baseObject.play();
        baseObject.pause();

        derivedObjectFromBase.play();
        derivedObjectFromBase.pause();
        derivedObjectFromBase.specialSkill();

        derivedObject.play();
        derivedObject.pause();
        derivedObject.specialSkill();

        baseObjectFromDerived.play();
        baseObjectFromDerived.pause();
        derivedObject.multiplayerMode();
        derivedObject.achievementUnlocked("Master Explorer");
    }
}
