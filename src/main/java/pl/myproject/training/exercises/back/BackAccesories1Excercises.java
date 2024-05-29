package pl.myproject.training.exercises.back;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
public enum BackAccesories1Excercises {
    OVERHAND_GRIP_BENTOVER_ROW(new ArrayList<>(List.of("4x8", "4x10", "12,10,10,8", "10,8,8,6")), "Overhand grip bentover row"),
    NEUTRAL_GRIP_BENTOVER_ROW(new ArrayList<>(List.of("4x8", "4x10", "12,10,10,8", "10,8,8,6")), "Nautral grip bentover row"),
    UNDERHAND_GRIP_BENTOVER_ROW(new ArrayList<>(List.of("4x8", "4x10", "12,10,10,8", "10,8,8,6")), "Underhand grip bentover row"),
    OVERHAND_GRIP_CABLE_ROW(new ArrayList<>(List.of("4x8", "4x10", "12,10,10,8", "10,8,8,6")), "Overhand grip cable row"),
    UNDERHAND_GRIP_CABLE_ROW(new ArrayList<>(List.of("4x8", "4x10", "12,10,10,8", "10,8,8,6")), "Underhand grip cable row");

    private final ArrayList<String> reps;
    private final String exerciseName;
}
