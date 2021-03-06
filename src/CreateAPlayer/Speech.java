/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CreateAPlayer;

/**
 *
 * @author jjank
 */
public class Speech extends AttributeDecorator {
    Player player;


    public Speech(Player player) {
        this.player = player;
    }

    @Override
    public String getDescription() {
        return player.getDescription() + "\n" + "Speech";
    }

    @Override
    public int skillPoints() throws InsufficientPointsException {
        int sP = player.skillPoints() + 1;
        if (sP < 4) {
            return player.skillPoints() + 1;
        } else {
            throw new InsufficientPointsException();
        }
    }
}
