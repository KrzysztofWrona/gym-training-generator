package pl.myproject.training.exercises.deadlift;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
public enum DeadliftExercise {
    DEADLIFT(new ArrayList<>(List.of("5x5", "4x4", "4x6")), "Deadlift");

    private final ArrayList<String> reps;
    private final String exerciseName;
}
