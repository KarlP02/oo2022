package game;

public class Player extends Character implements WorldObject {
    // (muutuja aktiivne) parem klõps -> refactor -> rename
    Direction direction;
    Item item;

    // Constructor
    public Player(int worldHeight, int worldWidth) {
        super(worldHeight, worldWidth); // super on sama mis new Character();
        this.direction = Direction.UP;
    }

    public void addItem(Item item) {
        this.item = item;
        System.out.println("Mängija sai eseme + " + item.itemType);
    }


    public void movePlayer(String input, int worldHeight, int worldWidth) {
        // kontrollib ühte muutujat mingite väärtuste vastu
        switch (input) {
            case "a":
                direction = Direction.LEFT;
                break;
            case "s":
                direction = Direction.DOWN;
                break;
            case "d":
                direction = Direction.RIGHT;
                break;
            case "w":
                direction = Direction.UP;
                break;
        }
        switch (direction) {
            case LEFT:
                if (coordinateX > 1) {
                    coordinateX--;
                }
                break;
            case DOWN:
                if (coordinateY < worldHeight-2) {
                    coordinateY++;
                }
                break;
            case RIGHT:
                if (coordinateX < worldWidth-2) {
                    coordinateX++;
                }
                break;
            case UP:
                if (coordinateY > 1) {
                    coordinateY--;
                }
                break;
        }

//            if (direction == game.Direction.LEFT && true) {
//                playerCoordinateX--;
//            } else if (direction == game.Direction.DOWN || input.equals("mihkel")) {
//                playerCoordinateY++;
//            } else if (direction == game.Direction.RIGHT) {
//                playerCoordinateX++;
//            } else if (direction == game.Direction.UP) {
//                playerCoordinateY--;
//            }

    }

}

// Tellimuse - id, tooted, kasutaja, aja
// Kasutaja - frontendis registreerumise järgselt
// Ühe toote
// Kategooria