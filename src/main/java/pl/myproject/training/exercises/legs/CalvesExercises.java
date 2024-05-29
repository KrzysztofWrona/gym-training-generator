package pl.myproject.training.exercises.legs;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
public enum CalvesExercises {
    STANDING_CALVES_RISE(new ArrayList<>(List.of("4x12", "4x15", "4x20", "20,15,15,12")), "Standing calves rise"),
    SEATED(new ArrayList<>(List.of("4x12", "4x15", "4x20", "20,15,15,12")), "Seated calves rise");

    private final ArrayList<String> reps;
    private final String exerciseName;
}
