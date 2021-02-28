package ms;

import ms.items.ItemsFromStore;

import java.util.List;

public class Player {
   private int gold;
    private String characterName;
    protected int level;
    private int hp;
    private int normalDmg;
    private int specialDmg;
    private  int mp;
    private int experience;
    private List<ItemsFromStore>eq;

    public List<ItemsFromStore> getEq() {
        return eq;
    }

    public Player setEq(List<ItemsFromStore> eq) {
        this.eq = eq;
        return this;
    }
    public int getExperience() {
        return experience;
    }

    public Player setExperience(int experience) {
        this.experience = experience;
        return this;
    }


    public void setMp(int mp) {
        this.mp = mp;
    }

    public Player setHp(int hp) {
        this.hp = hp;
        return this;
    }

    public int getNormalDmg() {
        return normalDmg;
    }


    public int getSpecialDmg() {
        return specialDmg;
    }



    public int getMp() {
        return mp;
    }



    public int getGold() {
        return gold;
    }

    public Player setGold(int gold) {
        this.gold = gold;
        return this;
    }

    public String getCharacterName() {
        return characterName;
    }

    public Player setCharacterName(String characterName) {
        this.characterName = characterName;
        return this;
    }

    public int getLevel() {
        return level;
    }

    public Player setLevel(int level) {
        this.level = level;
        return this;
    }

    public int getHp() {
        return hp;
    }



    public Player setNormalDmg(int normalDmg) {
        this.normalDmg = normalDmg;
        return this;
    }

    public Player setSpecialDmg(int specialDmg) {
        this.specialDmg = specialDmg;
        return this;
    }

}
