package pl.myproject.training.exercises.triceps;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
public enum TricepsBasicExercises {
    EZ_BAR_FRENCH_PRESS(new ArrayList<>(List.of("4x6", "4x8", "4x10", "10,8,8,6")), "EZ bar french press"),
    STRAIGHT_BAR_CABLE_PUSHDOWN(new ArrayList<>(List.of("4x6", "4x8", "4x10", "10,8,8,6")), "Straight bar cable pushdown"),
    CLOSE_GRIP_BENCH_PRESS(new ArrayList<>(List.of("5X4", "4x6", "4x8", "10,8,8,6")), "Close grip bench press");

    private final ArrayList<String> reps;
    private final String exerciseName;
}
