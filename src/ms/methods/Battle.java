package ms.methods;

import ms.Player;
import ms.enemies.Enemy;
import ms.enemies.Troll;

import java.util.Random;

public interface Battle {

    void StartFight(Player currentPlayer, Enemy enemy, String command);

    void StartFightWithTroll(Player currentPlayer, String command, Troll troll);
}
