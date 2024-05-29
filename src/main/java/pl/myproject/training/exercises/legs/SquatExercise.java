package pl.myproject.training.exercises.legs;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
public enum SquatExercise {
    SQUAT(new ArrayList<>(List.of("5x5","4x8","4x6","10,8,8,6")), "Squat");

    private final ArrayList<String> reps;
    private final String exerciseName;
}
