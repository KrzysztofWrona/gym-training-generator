package pl.myproject.training.exercises.chest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
public enum ChestBasicExercises {
    BENCHPRESS(new ArrayList<>(List.of("5x5", "4x6", "4x8", "8,6,6,4")), "Benchpress"),
    INCLINE_BENCH_BARBELL_PRESS(new ArrayList<>(List.of("5x5", "4x6", "4x8", "8,6,6,4", "10,8,8,6")), "Incline bench barbell press");


    private final ArrayList<String> reps;
    private final String exerciseName;
}
