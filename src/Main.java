public class Main {
    public static void main(String[] args) {
        System.out.println("Press enter to start the game");

        Game game = new Game();
        game.populateHive();
        game.printHive();
    }
}