package pl.myproject.training.exercises.back;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
public enum BackAccesories2Excercises {
    ONE_HANDED_DUMBBELL_ROWS(new ArrayList<>(List.of("4x10", "12,10,10,8", "10,8,8,6", "3x15")), "One handed dumbbell rows"),
    V_BAR_CABLE_ROWS(new ArrayList<>(List.of("4x10", "12,10,10,8", "10,8,8,6", "3x15")), "V bar cable rows"),
    PULLOVER(new ArrayList<>(List.of("4x8", "4x10", "12,10,10,8", "10,8,8,6", "3x15")), "Pullover");


    private final ArrayList<String> reps;
    private final String exerciseName;
}
