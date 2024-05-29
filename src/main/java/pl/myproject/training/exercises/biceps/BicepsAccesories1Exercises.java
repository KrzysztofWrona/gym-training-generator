package pl.myproject.training.exercises.biceps;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
public enum BicepsAccesories1Exercises {
    STANDING_DUMBBELL_CURL(new ArrayList<>(List.of("4x10", "4x12", "12,10,10,8")), "Standing dumbbell curl"),
    SPIDER_CURLS(new ArrayList<>(List.of("4x10", "4x12", "12,10,10,8")), "Spider curls"),
    STANDING_BARBELL_ROW(new ArrayList<>(List.of("4x10", "12,10,10,8")), "Standing barbell curl, low weight");

    private final ArrayList<String> reps;
    private final String exerciseName;

}
