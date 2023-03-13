package kr.codesquad.controller.dto;

import java.util.Collections;
import java.util.List;

public class LadderInputDto {
    private final List<String> playerNames;
    private final int playerNumber;
    private final int height;
    private final List<String> goals;

    public LadderInputDto(List<String> playerNames, int height, List<String> goals) {
        this.playerNames = playerNames;
        this.playerNumber = playerNames.size();
        this.height = height;
        this.goals = goals;
    }

    public LadderInputDto(List<String> playerNames, int height) {
        this(playerNames, height, Collections.emptyList());
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public int getHeight() {
        return height;
    }

    public List<String> getPlayerNames() {
        return playerNames;
    }

    public List<String> getGoals() {
        return goals;
    }
}
