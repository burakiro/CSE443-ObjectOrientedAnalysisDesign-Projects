package myGame;
/**
 * Class for high jump
 */
public class highJump implements JumpStyle {
    int yCordRefer = 172;
    boolean flag = false;
    boolean done = false;
    @Override
    public void jump() {

        if (flag == false)
            yCordRefer--;
        if (yCordRefer == 75)
            flag = true;
        if (flag == true && yCordRefer <= 172) {
            yCordRefer++;
            if (yCordRefer == 172) {
                done = true;

            }
        }
    }
}
