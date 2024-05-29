package pl.myproject.training.exercises.triceps;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
public enum TricepsAccesories1Excercises {
    EZ_BAR_CABLE_PUSHDOWN(new ArrayList<>(List.of("4x8", "4x10", "12,10,10,8")), "EZ bar cable pushdown"),
    ONEHAND_CABLE_PUSHDOWN(new ArrayList<>(List.of("4x8", "4x10", "12,10,10,8")), "One hand cable pushdown"),
    OVERHEAD_DUMBBELL_EXTENSION(new ArrayList<>(List.of("4x8", "4x10", "12,10,10,8")), "Overhead dumbbell extension");

    private final ArrayList<String> reps;
    private final String exerciseName;
}
