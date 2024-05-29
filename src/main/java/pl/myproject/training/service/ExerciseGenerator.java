package pl.myproject.training.service;

import org.springframework.stereotype.Service;
import pl.myproject.training.exercises.back.BackAccesories1Excercises;
import pl.myproject.training.exercises.back.BackAccesories2Excercises;
import pl.myproject.training.exercises.back.BackBasicExcercises;
import pl.myproject.training.exercises.back.RearShoulderExcercises;
import pl.myproject.training.exercises.biceps.BicepsAccesories1Exercises;
import pl.myproject.training.exercises.biceps.BicepsBasicExercises;
import pl.myproject.training.exercises.chest.ChestAccessories1Excercises;
import pl.myproject.training.exercises.chest.ChestAccessories2Excercises;
import pl.myproject.training.exercises.chest.ChestBasicExercises;
import pl.myproject.training.exercises.deadlift.DeadliftExercise;
import pl.myproject.training.exercises.legs.CalvesExercises;
import pl.myproject.training.exercises.legs.HamstringsExercises;
import pl.myproject.training.exercises.legs.HipthrustExercise;
import pl.myproject.training.exercises.legs.QuadsExercises;
import pl.myproject.training.exercises.legs.SquatExercise;
import pl.myproject.training.exercises.shoulders.ShouldersAccessories1Excercises;
import pl.myproject.training.exercises.shoulders.ShouldersBasicExcercises;
import pl.myproject.training.exercises.triceps.TricepsAccesories1Excercises;
import pl.myproject.training.exercises.triceps.TricepsBasicExercises;
import pl.myproject.training.model.Exercise;

import java.util.List;
import java.util.Random;

@Service
public class ExerciseGenerator {

    public String getRandomReps(List<String> repsRanges) {
        Random random = new Random();
        return repsRanges.get(random.nextInt(repsRanges.size()));
    }

    public Exercise generateMainPushExercise() {

        ChestBasicExercises[] exercises = ChestBasicExercises.values(); //tablica z wartości enuma
        ChestBasicExercises randomExercise = exercises[new Random().nextInt(exercises.length)]; //random z liczb od 1 do rozmiaru tablicy
        String randomReps = getRandomReps(randomExercise.getReps());
        return new Exercise(randomExercise.getExerciseName(), randomReps);
    }

    //CHEST
    public Exercise generateChestAccesories1Exercise() {

        ChestAccessories1Excercises[] excercises = ChestAccessories1Excercises.values();
        ChestAccessories1Excercises randomExercise = excercises[new Random().nextInt(excercises.length)];
        String randomReps = getRandomReps(randomExercise.getReps());
        return new Exercise(randomExercise.getExerciseName(), randomReps);
    }

    public Exercise generateChestAccesories2Exercise() {

        ChestAccessories2Excercises[] excercises = ChestAccessories2Excercises.values();
        ChestAccessories2Excercises randomExercise = excercises[new Random().nextInt(excercises.length)];
        String randomReps = getRandomReps(randomExercise.getReps());
        return new Exercise(randomExercise.getExerciseName(), randomReps);
    }

    //PULL

    public Exercise generateDeadliftExercise() {

        DeadliftExercise[] excercises = DeadliftExercise.values();
        DeadliftExercise randomExercise = excercises[new Random().nextInt(excercises.length)];
        String randomReps = getRandomReps(randomExercise.getReps());
        return new Exercise(randomExercise.getExerciseName(), randomReps);
    }


    public Exercise generatePullMainExercise() {

        BackBasicExcercises[] excercises = BackBasicExcercises.values();
        BackBasicExcercises randomExercise = excercises[new Random().nextInt(excercises.length)];
        String randomReps = getRandomReps(randomExercise.getReps());
        return new Exercise(randomExercise.getExerciseName(), randomReps);
    }

    public Exercise generatePullAccesories1Excercise() {

        BackAccesories1Excercises[] excercises = BackAccesories1Excercises.values();
        BackAccesories1Excercises randomExcercise = excercises[new Random().nextInt(excercises.length)];
        String randomReps = getRandomReps(randomExcercise.getReps());
        return new Exercise(randomExcercise.getExerciseName(), randomReps);
    }

    public Exercise generatePullAccesories2Excercise() {

        BackAccesories2Excercises[] excercises = BackAccesories2Excercises.values();
        BackAccesories2Excercises randomExcercise = excercises[new Random().nextInt(excercises.length)];
        String randomReps = getRandomReps(randomExcercise.getReps());
        return new Exercise(randomExcercise.getExerciseName(), randomReps);
    }

    //LEGS
    public Exercise generateSquatExercise() { //narazie tylko przsysiad ale rozwojowo losowanie też

        SquatExercise[] exercises = SquatExercise.values(); //tablica z wartości enuma
        SquatExercise randomExercise = exercises[new Random().nextInt(exercises.length)]; //random z liczb od 1 do rozmiaru tablicy
        String randomReps = getRandomReps(randomExercise.getReps());
        return new Exercise(randomExercise.getExerciseName(), randomReps);
    }

    public Exercise generateHipthrustExercise() {

        HipthrustExercise[] exercises = HipthrustExercise.values();
        HipthrustExercise randomExercise = exercises[new Random().nextInt(exercises.length)];
        String randomReps = getRandomReps(randomExercise.getReps());
        return new Exercise(randomExercise.getExerciseName(), randomReps);
    }


    public Exercise generateQuadsExcercise() {

        QuadsExercises[] excercises = QuadsExercises.values();
        QuadsExercises randomExcercise = excercises[new Random().nextInt(excercises.length)];
        String randomReps = getRandomReps(randomExcercise.getReps());
        return new Exercise(randomExcercise.getExerciseName(), randomReps);
    }

    public Exercise generateHamstringsExcercise() {

        HamstringsExercises[] excercises = HamstringsExercises.values();
        HamstringsExercises randomExcercise = excercises[new Random().nextInt(excercises.length)];
        String randomReps = getRandomReps(randomExcercise.getReps());
        return new Exercise(randomExcercise.getExerciseName(), randomReps);
    }

    public Exercise generateCalvesExcercise() {

        CalvesExercises[] excercises = CalvesExercises.values();
        CalvesExercises randomExcercise = excercises[new Random().nextInt(excercises.length)];
        String randomReps = getRandomReps(randomExcercise.getReps());
        return new Exercise(randomExcercise.getExerciseName(), randomReps);
    }

    public Exercise generateBicepsBasicExcercise() {

        BicepsBasicExercises[] excercises = BicepsBasicExercises.values();
        BicepsBasicExercises randomExcercise = excercises[new Random().nextInt(excercises.length)];
        String randomReps = getRandomReps(randomExcercise.getReps());
        return new Exercise(randomExcercise.getExerciseName(), randomReps);
    }

    public Exercise generateBicepsAccesoriesExcercise() {

        BicepsAccesories1Exercises[] excercises = BicepsAccesories1Exercises.values();
        BicepsAccesories1Exercises randomExcercise = excercises[new Random().nextInt(excercises.length)];
        String randomReps = getRandomReps(randomExcercise.getReps());
        return new Exercise(randomExcercise.getExerciseName(), randomReps);
    }

    public Exercise generateShoulderBasicExcercise() {

        ShouldersBasicExcercises[] excercises = ShouldersBasicExcercises.values();
        ShouldersBasicExcercises randomExcercise = excercises[new Random().nextInt(excercises.length)];
        String randomReps = getRandomReps(randomExcercise.getReps());
        return new Exercise(randomExcercise.getExerciseName(), randomReps);
    }

    public Exercise generateShoulderAccesoriesExcercise() {

        ShouldersAccessories1Excercises[] excercises = ShouldersAccessories1Excercises.values();
        ShouldersAccessories1Excercises randomExcercise = excercises[new Random().nextInt(excercises.length)];
        String randomReps = getRandomReps(randomExcercise.getReps());
        return new Exercise(randomExcercise.getExerciseName(), randomReps);
    }

    public Exercise generateTricepsBasicExcercise() {

        TricepsBasicExercises[] excercises = TricepsBasicExercises.values();
        TricepsBasicExercises randomExcercise = excercises[new Random().nextInt(excercises.length)];
        String randomReps = getRandomReps(randomExcercise.getReps());
        return new Exercise(randomExcercise.getExerciseName(), randomReps);
    }

    public Exercise generateTricepsAccesoriesExcercise() {

        TricepsAccesories1Excercises[] excercises = TricepsAccesories1Excercises.values();
        TricepsAccesories1Excercises randomExcercise = excercises[new Random().nextInt(excercises.length)];
        String randomReps = getRandomReps(randomExcercise.getReps());
        return new Exercise(randomExcercise.getExerciseName(), randomReps);
    }

    public Exercise generateRearShoulderExercise() {

        RearShoulderExcercises[] excercises = RearShoulderExcercises.values();
        RearShoulderExcercises randomExercise = excercises[new Random().nextInt(excercises.length)];
        String randomReps = getRandomReps(randomExercise.getReps());
        return new Exercise(randomExercise.getExerciseName(), randomReps);
    }
}
