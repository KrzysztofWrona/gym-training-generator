package pl.myproject.training.exercises.back;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
public enum RearShoulderExcercises {
    BENT_OVER_LATERAL_RAISES(new ArrayList<>(List.of("4x10", "12,10,10,8", "3x15")), "Bent over lateral raises"),
    CABLE_REAR_DELT_PULL(new ArrayList<>(List.of("4x10", "12,10,10,8", "3x15")), "Cable rear delt pull");

    private final ArrayList<String> reps;
    private final String exerciseName;
}
