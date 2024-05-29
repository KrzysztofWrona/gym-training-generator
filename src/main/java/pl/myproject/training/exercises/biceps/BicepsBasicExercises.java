package pl.myproject.training.exercises.biceps;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
public enum BicepsBasicExercises {
    PREACHER_BARBELL_CURL(new ArrayList<>(List.of("4x8", "4x10", "12,10,10,8", "10,8,8,6")), "Preacher barbell curl"),
    STANDING_BARBELL_CURL(new ArrayList<>(List.of("4x8", "4x10", "12,10,10,8", "10,8,8,6")), "Standing barbell curl"),
    STANDING_CABLE_CURL(new ArrayList<>(List.of("4x8", "4x10", "12,10,10,8", "10,8,8,6")), "Standing cable curl");

    private final ArrayList<String> reps;
    private final String exerciseName;
}
