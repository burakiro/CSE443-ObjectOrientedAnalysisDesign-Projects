package myGame;
/**
 * Class for lowjump
 */
public class lowJump implements JumpStyle {
    int yCordRefer = 172;
    boolean flag1 = false;
    boolean done = false;
    @Override
    /**
     * Class constructor.
     */
    public void jump() {

            if (flag1 == false)
                yCordRefer--;
            if (yCordRefer == 125)
                flag1 = true;
            if (flag1 == true && yCordRefer <= 172) {
                yCordRefer++;
                if (yCordRefer == 172) {
                    done = true;

            }
        }
    }

}
