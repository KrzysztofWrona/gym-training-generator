package pl.myproject.training.exercises.back;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
public enum BackBasicExcercises {
    OVERHAND_GRIP_PULLUP(new ArrayList<>(List.of("4x6", "4x8", "4x8", "4x10", "12,10,10,8")), "Overhand grip pullup"),
    UNDERHAND_GRIP_PULLUP(new ArrayList<>(List.of("4x6", "4x8", "4x8", "4x10", "12,10,10,8")), "Underhand grip pullup"),
    OVERHAND_LAT_PULLDOWN(new ArrayList<>(List.of("4x8", "4x8", "4x10", "12,10,10,8")), "Overhand grip pullup"),
    UNDERHAND_LAT_PULLDOWN(new ArrayList<>(List.of("4x8", "4x8", "4x10", "12,10,10,8")), "Underhand grip pullup");

    private final ArrayList<String> reps;
    private final String exerciseName;
}
