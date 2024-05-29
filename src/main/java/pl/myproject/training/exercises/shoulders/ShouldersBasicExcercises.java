package pl.myproject.training.exercises.shoulders;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
public enum ShouldersBasicExcercises {
    OVERHEAD_PRESS(new ArrayList<>(List.of("5x5","4x6", "4x8", "10,8,8,6")), "Overhead press"),
    DUMBBELLS_PRESS(new ArrayList<>(List.of("4x8", "4x10", "10,8,8,6")), "Dumbbells press");

    private final ArrayList<String> reps;
    private final String exerciseName;
}
