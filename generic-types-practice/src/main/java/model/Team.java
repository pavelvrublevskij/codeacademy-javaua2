package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Team<T extends Player> {

    private String name;
    private Integer won;
    private Integer estimatedYear;
    private ArrayList<T> players;

    public boolean addPlayer(T player) {
        players.add(player);
        return true;
    }



}
