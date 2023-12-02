public class PlayerTest {
    public static void main(String[] args) {
        Player player = new Player("TestPlayer");

        // Test getting player name
        System.out.println("Player Name: " + player.getName());

        // Test if player has found treasure (initially false)
        System.out.println("Has Found Treasure: " + player.hasFoundTreasure());

        // Test finding treasure
        player.foundTreasure();
        System.out.println("Has Found Treasure: " + player.hasFoundTreasure());
    }
}

public class RoomTest {
    public static void main(String[] args) {
        Room room = new Room("TestRoom", "A test room.", true);

        // Test getting room name and description
        System.out.println("Room Name: " + room.getName());
        System.out.println("Room Description: " + room.getDescription());

        // Test if the room has treasure (initially true)
        System.out.println("Has Treasure Here: " + room.hasTreasureHere());

        // Test adding connections
        Room connectedRoom = new Room("ConnectedRoom", "Another test room.", false);
        room.addConnection("north", connectedRoom);
        System.out.println("Connected Room to the North: " + room.getConnectedRoom("north").getName());
    }
}

public class GameTest {
    public static void main(String[] args) {
        Game game = new Game("TestPlayer");

        // Test starting the game
        game.start();

        // Additional tests can be added to simulate player input and actions in the game
        // For example:
        // game.move("east");
        // game.searchForTreasure();
        // ...
    }
}
