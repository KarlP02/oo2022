package game;

public class Enemy extends Character implements WorldObject {
    // (muutuja aktiivne) parem klõps -> refactor -> rename
    // new game.Enemy(1,6)
    public Enemy(int worldHeight, int worldWidth) {
        super(worldHeight, worldWidth);
    }
}