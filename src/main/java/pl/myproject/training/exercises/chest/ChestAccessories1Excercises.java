package pl.myproject.training.exercises.chest;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
public enum ChestAccessories1Excercises {
    FLATBENCH_DUMBBELLS_PRESS(new ArrayList<>(List.of("4x8", "4x10", "12,10,10,8", "10,8,8,6")), "Flatbench dumbbels press"),
    INCLINEBENCH_DUMBBELLS_PRESS(new ArrayList<>(List.of("4x8", "4x10", "12,10,10,8", "10,8,8,6")), "Inclinebench dumbbels press"),
    DIPS(new ArrayList<>(List.of("5X5", "4x6", "4x8", "4x10", "12,10,10,8", "10,8,8,6")), "Dips");


    private final ArrayList<String> reps;
    private final String exerciseName;
}
