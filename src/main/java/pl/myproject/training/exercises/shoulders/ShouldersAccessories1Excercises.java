package pl.myproject.training.exercises.shoulders;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
public enum ShouldersAccessories1Excercises {
    DUMBBELLS_LATERAL_RISES(new ArrayList<>(List.of("4x15", "4x12", "16,14,14,12")), "Dumbbels lateral rises"),
    CABLE_LATERAL_RISES(new ArrayList<>(List.of("4x15", "4x12", "16,14,14,12")), "Cable lateral rises");


    private final ArrayList<String> reps;
    private final String exerciseName;
}
