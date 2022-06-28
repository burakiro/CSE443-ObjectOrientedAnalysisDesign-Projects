package myGame;

public class PowerUpB extends PowerUpDecorator{
    public int score(){
        return 5 * this.score();
    }
}
