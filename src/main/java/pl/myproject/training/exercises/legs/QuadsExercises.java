package pl.myproject.training.exercises.legs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
public enum QuadsExercises {
    LEG_EXTENSION(new ArrayList<>(List.of("4x8", "4x10", "12,10,10,8")), "Leg extensions"),
    LUNGES(new ArrayList<>(List.of("4x8", "4x10", "12,10,10,8")), "Lunges"),
    LEG_PRESS(new ArrayList<>(List.of("4x8", "4x10", "12,10,10,8")), "Leg press"),
    HACK_SQUAT(new ArrayList<>(List.of("4x8", "4x10", "12,10,10,8")), "Hack squat");


    private final ArrayList<String> reps;
    private final String exerciseName;
}

