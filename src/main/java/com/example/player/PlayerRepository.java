package com.example.player;

import java.util.*;
import com.example.player.*;

public interface PlayerRepository {
    ArrayList<Player> getPlayers();

    Player getPlayerById(int playerId);

    Player addPlayer(Player player);
}
