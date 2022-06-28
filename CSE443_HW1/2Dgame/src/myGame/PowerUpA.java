package myGame;

public class PowerUpA extends PowerUpDecorator{
    public int score(){
        return 2 * this.score();
    }
}
