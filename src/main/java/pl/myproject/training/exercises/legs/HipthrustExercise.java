package pl.myproject.training.exercises.legs;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
public enum HipthrustExercise {
    HIPTHRUST(new ArrayList<>(List.of("4x8","4x10","12,10,10,8")), "Hip thrust");

    private final ArrayList<String> reps;
    private final String exerciseName;
}
