package myGame;

public class PowerUpC extends PowerUpDecorator{
    public int score(){
        return 10 * this.score();
    }
}
