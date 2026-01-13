class Player {
    static int playerCount;
    private String name;

    public Player(String n) {
        name = n;
        playerCount++;
    }
}

public class PlayerTestDrive {
    public static void main(String[] args) {

        System.out.println(Player.playerCount);
        Player one = new Player("Player");
        System.out.println(Player.playerCount);

        Player two = new Player("Player 2");
        System.out.println(one.playerCount);
        System.out.println(two.playerCount);
    }
}
