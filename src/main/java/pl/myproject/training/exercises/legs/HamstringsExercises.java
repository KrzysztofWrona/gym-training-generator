package pl.myproject.training.exercises.legs;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
public enum HamstringsExercises {
    STRAIGHT_LEG_BARBELL_DEADLIFTS(new ArrayList<>(List.of("4x8", "4x10", "12,10,10,8")), "Straight legs barbell deadlifts"),
    STRAIGHT_LEG_DUMBBELLS_DEADLIFTS(new ArrayList<>(List.of("4x8", "4x10", "12,10,10,8")), "Straight legs dumbbell deadlifts"),
    LEG_CURLS(new ArrayList<>(List.of("4x8", "4x10", "4x12", "12,10,10,8")), "Leg curls");

    private final ArrayList<String> reps;
    private final String exerciseName;
}
