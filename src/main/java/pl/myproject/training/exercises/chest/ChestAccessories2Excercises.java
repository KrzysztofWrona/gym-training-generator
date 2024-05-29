package pl.myproject.training.exercises.chest;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
public enum ChestAccessories2Excercises {
    CABLE_CROSSOVER(new ArrayList<>(List.of("4x10", "4x12", "3x15")), "Cable crossover"),
    BUTTERFLY(new ArrayList<>(List.of("4x10", "4x12", "3x15")), "Butterfly"),
    PULL_OVER(new ArrayList<>(List.of("4x10", "4x12", "3x15")), "Pullover"),
    PUSH_UPS(new ArrayList<>(List.of("3xMAX")), "Pushups");

    private final ArrayList<String> reps;
    private final String exerciseName;
}
