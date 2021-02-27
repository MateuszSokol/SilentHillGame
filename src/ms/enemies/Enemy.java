package ms.enemies;

import ms.Player;

public abstract class Enemy {
    private int Hp;
    public abstract Player normalAtt(Player currentPlayer);
    public abstract Player specialAtt(Player currentPlayer);
    private int Exp;

    public int getHp() {
        return Hp;
    }

    public void setHp(int hp) {
        Hp = hp;
    }

    public int getEXP() {
        return Exp;
    }

    public void setEXP(int exp) {
        Exp = exp;

    }





}
