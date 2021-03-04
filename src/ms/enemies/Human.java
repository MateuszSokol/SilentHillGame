package ms.enemies;

import ms.Places;
import ms.Player;

import java.util.Random;

public class Human extends Enemy{

    private int hp = 200;
    private int EXP = 100;
public int getGoldFromHuman(){
    return 150;
}

    @Override
    public int getHp() {
        return hp;
    }

    @Override
    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public int getEXP() {
        return EXP;
    }

    @Override
    public void setEXP(int EXP) {
        this.EXP = EXP;

    }
    //special power block

    public void isBlockingPlayerAttack(Player player, Human human, Random random) {

        int randomNum = random.nextInt(5);

        if (human.getHp() > 0&&player.getHp()>0) {
            if (randomNum == 4) {
                System.out.println("PLAYER SPECIAL DMG -5");
                player.setSpecialDmg(player.getSpecialDmg() - 5);
                System.out.println("PLAYER NORMAL DMG -5");

                player.setNormalDmg(player.getNormalDmg() - 5);
                System.out.println("HUMAN HEALED +10");
                human.setHp(human.getHp() + 10);
            } else {
                System.out.println("PLAYER HP -10");
                player.setHp(player.getHp()-10);
            }
            System.out.println(player.getCharacterName() + "HP: " + player.getHp());
        }
    }
}
