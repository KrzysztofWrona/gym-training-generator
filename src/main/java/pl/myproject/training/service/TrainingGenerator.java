package pl.myproject.training.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.myproject.training.exercises.chest.ChestBasicExercises;
import pl.myproject.training.exercises.shoulders.ShouldersAccessories1Excercises;
import pl.myproject.training.model.Exercise;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class TrainingGenerator {

    private final ExerciseGenerator exerciseGenerator;


    //Lists
    //PULL list
    public List<Exercise> generatePullExercises() {

        List<Exercise> pull = new ArrayList<>();
        //back
        pull.add(exerciseGenerator.generateDeadliftExercise());
        pull.add(exerciseGenerator.generatePullMainExercise());
        pull.add(exerciseGenerator.generatePullAccesories1Excercise());
        pull.add(exerciseGenerator.generatePullAccesories2Excercise());
        //biceps
        pull.add(exerciseGenerator.generateBicepsBasicExcercise());
        pull.add(exerciseGenerator.generateBicepsAccesoriesExcercise());
        return pull;
    }

    //PUSH list
    public List<Exercise> generatePushExercises() {

        List<Exercise> push = new ArrayList<>();
        //chest
        push.add(exerciseGenerator.generateMainPushExercise());
        push.add(exerciseGenerator.generateChestAccesories1Exercise());
        push.add(exerciseGenerator.generateChestAccesories2Exercise());
        //shoulders
        push.add(exerciseGenerator.generateShoulderBasicExcercise());
        push.add(exerciseGenerator.generateShoulderAccesoriesExcercise());
        //triceps
        push.add(exerciseGenerator.generateTricepsBasicExcercise());
        push.add(exerciseGenerator.generateTricepsAccesoriesExcercise());

        return push;
    }

    //LEGS list
    public List<Exercise> generateLegsExcercises() {

        List<Exercise> legs = new ArrayList<>();
        legs.add(exerciseGenerator.generateSquatExercise());

        Exercise quads1 = exerciseGenerator.generateQuadsExcercise();
        legs.add(quads1);

        Exercise quads2;   //by ćwiczenia z tej samej grupy były różne
        while (true) {
            quads2 = exerciseGenerator.generateQuadsExcercise();
            if (!quads2.getExerciseName().equals(quads1.getExerciseName())) {
                legs.add(quads2);
                break;
            }
        }

        legs.add(exerciseGenerator.generateHamstringsExcercise());
        legs.add(exerciseGenerator.generateCalvesExcercise());

        return legs;
    }

    public List<Exercise> generateUpperA() {

        List<Exercise> upperA = new ArrayList<>();
        upperA.add(new Exercise(ChestBasicExercises.BENCHPRESS.getExerciseName(), exerciseGenerator.getRandomReps(ChestBasicExercises.BENCHPRESS.getReps())));
        upperA.add(exerciseGenerator.generateChestAccesories1Exercise());
        upperA.add(exerciseGenerator.generatePullMainExercise());
        upperA.add(exerciseGenerator.generatePullAccesories1Excercise());
        upperA.add(exerciseGenerator.generateShoulderBasicExcercise());
        upperA.add(exerciseGenerator.generateBicepsBasicExcercise());
        upperA.add(exerciseGenerator.generateTricepsBasicExcercise());


        return upperA;
    }


    public List<Exercise> generateUpperB(List<Exercise> upperA) { //wrzucamy liste upperA by nie powtarzać ćwiczeń

        List<Exercise> usedExercises = upperA;
        List<Exercise> upperB = new ArrayList<>();

        upperB.add(new Exercise(ChestBasicExercises.INCLINE_BENCH_BARBELL_PRESS.getExerciseName(), exerciseGenerator.getRandomReps(ChestBasicExercises.INCLINE_BENCH_BARBELL_PRESS.getReps())));

        Exercise usedChest1 = usedExercises.get(1);
        while (true) {
            Exercise chest2 = exerciseGenerator.generateChestAccesories1Exercise();
            if (!chest2.getExerciseName().equals(usedChest1.getExerciseName())) {
                upperB.add(chest2);
                break;
            }
        }

        Exercise usedPull1 = usedExercises.get(2);
        while (true) {
            Exercise pull1 = exerciseGenerator.generatePullMainExercise();
            if (!pull1.getExerciseName().equals(usedPull1.getExerciseName())) {
                upperB.add(pull1);
                break;
            }
        }

        Exercise usedPull2 = usedExercises.get(3);
        while (true) {
            Exercise pull1 = exerciseGenerator.generatePullAccesories1Excercise();
            if (!pull1.getExerciseName().equals(usedPull2.getExerciseName())) {
                upperB.add(pull1);
                break;
            }
        }

        Exercise usedShoulders = usedExercises.get(4);
        while (true) {
            Exercise shoulders = exerciseGenerator.generateShoulderBasicExcercise();
            if (!shoulders.getExerciseName().equals(usedShoulders.getExerciseName())) {
                upperB.add(shoulders);
                break;
            }
        }

        upperB.add(exerciseGenerator.generateBicepsAccesoriesExcercise());
        upperB.add(exerciseGenerator.generateTricepsAccesoriesExcercise());

        return upperB;
    }

    public List<Exercise> generateLowerA() {

        List<Exercise> lowerA = new ArrayList<>();
        lowerA.add(exerciseGenerator.generateDeadliftExercise());
        lowerA.add(exerciseGenerator.generateQuadsExcercise());
        lowerA.add(exerciseGenerator.generateHamstringsExcercise());
        lowerA.add(exerciseGenerator.generateCalvesExcercise());

        return lowerA;
    }

    public List<Exercise> generateLowerB(List<Exercise> lowerA) {

        List<Exercise> usedExercises = lowerA;
        List<Exercise> lowerB = new ArrayList<>();

        lowerB.add(exerciseGenerator.generateSquatExercise());
        lowerB.add(exerciseGenerator.generateHipthrustExercise());

        Exercise usedQuads = usedExercises.get(1);
        while (true) {
            Exercise quads = exerciseGenerator.generateQuadsExcercise();
            if (!quads.getExerciseName().equals(usedQuads.getExerciseName())) {
                lowerB.add(quads);
                break;
            }
        }

        Exercise usedHamstrings = usedExercises.get(2);
        while (true) {
            Exercise hamstrings = exerciseGenerator.generateHamstringsExcercise();
            if (!hamstrings.getExerciseName().equals(usedHamstrings.getExerciseName())) {
                lowerB.add(hamstrings);
                break;
            }
        }

        Exercise usedCalves = usedExercises.get(3);
        while (true) {
            Exercise calves = exerciseGenerator.generateCalvesExcercise();
            if (!calves.getExerciseName().equals(usedCalves.getExerciseName())) {
                lowerB.add(calves);
                break;
            }
        }

        return lowerB;
    }


    public List<Exercise> generateUpper() {

        List<Exercise> upper = new ArrayList<>();
        upper.add(exerciseGenerator.generateMainPushExercise());
        upper.add(exerciseGenerator.generateChestAccesories1Exercise());
        upper.add(exerciseGenerator.generatePullMainExercise());
        upper.add(exerciseGenerator.generatePullAccesories1Excercise());
        upper.add(exerciseGenerator.generateShoulderBasicExcercise());
        upper.add(exerciseGenerator.generateBicepsBasicExcercise());
        upper.add(exerciseGenerator.generateTricepsBasicExcercise());

        return upper;
    }

    public List<Exercise> generateLower() {

        List<Exercise> lower = new ArrayList<>();
        lower.add(exerciseGenerator.generateSquatExercise());
        lower.add(exerciseGenerator.generateDeadliftExercise());
        lower.add(exerciseGenerator.generateQuadsExcercise());
        lower.add(exerciseGenerator.generateHamstringsExcercise());
        lower.add(exerciseGenerator.generateCalvesExcercise());

        return lower;
    }

    public List<Exercise> generateFbwA() {

        List<Exercise> fbwA = new ArrayList<>();
        fbwA.add(exerciseGenerator.generateSquatExercise());
        fbwA.add(exerciseGenerator.generateMainPushExercise());
        fbwA.add(exerciseGenerator.generatePullMainExercise());
        fbwA.add(exerciseGenerator.generateShoulderAccesoriesExcercise());
        fbwA.add(exerciseGenerator.generateBicepsBasicExcercise());
        fbwA.add(exerciseGenerator.generateTricepsBasicExcercise());
        fbwA.add(exerciseGenerator.generateCalvesExcercise());

        return fbwA;
    }


    public List<Exercise> generateFbwB(List<Exercise> fbwA) {

        List<Exercise> fbwB = new ArrayList<>();
        fbwB.add(exerciseGenerator.generateDeadliftExercise());
        fbwB.add(exerciseGenerator.generateChestAccesories1Exercise());
        fbwB.add(exerciseGenerator.generatePullAccesories1Excercise());
        fbwB.add(exerciseGenerator.generateShoulderBasicExcercise());
        fbwB.add(exerciseGenerator.generateBicepsAccesoriesExcercise());
        fbwB.add(exerciseGenerator.generateTricepsAccesoriesExcercise());

        Exercise usedCalves = fbwA.get(6);
        while (true) {
            Exercise calves = exerciseGenerator.generateCalvesExcercise();
            if (!usedCalves.getExerciseName().equals(calves.getExerciseName())) {
                fbwB.add(calves);
                break;
            }
        }

        return fbwB;
    }

    public List<Exercise> generateFBW() {

        List<Exercise> fbw = new ArrayList<>();
        fbw.add(exerciseGenerator.generateChestAccesories1Exercise());
        fbw.add(exerciseGenerator.generatePullAccesories1Excercise());
        fbw.add(exerciseGenerator.generateShoulderBasicExcercise());
        fbw.add(exerciseGenerator.generateBicepsAccesoriesExcercise());
        fbw.add(exerciseGenerator.generateTricepsAccesoriesExcercise());
        fbw.add(exerciseGenerator.generateQuadsExcercise());

        return fbw;
    }

    public List<Exercise> generateChestBiceps() {

        List<Exercise> chestBiceps = new ArrayList<>();
        chestBiceps.add(exerciseGenerator.generateMainPushExercise());
        chestBiceps.add(exerciseGenerator.generateChestAccesories1Exercise());

        while (true) {
            Exercise chestAccesory = exerciseGenerator.generateChestAccesories2Exercise();
            if (!chestAccesory.getExerciseName().equals("Pushups")) {
                chestBiceps.add(chestAccesory);
                break;
            }
        }

        while (true) {
            Exercise chestAccessory = exerciseGenerator.generateChestAccesories2Exercise();
            if (!chestBiceps.get(2).getExerciseName().equals(chestAccessory.getExerciseName())) {
                chestBiceps.add(chestAccessory);
                break;
            }
        }

        chestBiceps.add(exerciseGenerator.generateBicepsBasicExcercise());
        chestBiceps.add(exerciseGenerator.generateBicepsAccesoriesExcercise());

        return chestBiceps;
    }

    public List<Exercise> generateBackTriceps() {

        List<Exercise> backTriceps = new ArrayList<>();
        backTriceps.add(exerciseGenerator.generateDeadliftExercise());
        backTriceps.add(exerciseGenerator.generatePullMainExercise());
        backTriceps.add(exerciseGenerator.generatePullAccesories1Excercise());
        backTriceps.add(exerciseGenerator.generatePullAccesories2Excercise());
        backTriceps.add(exerciseGenerator.generateTricepsBasicExcercise());
        backTriceps.add(exerciseGenerator.generateTricepsAccesoriesExcercise());

        return backTriceps;
    }

    public List<Exercise> generateShouldersExercises() {

        List<Exercise> shoulders = new ArrayList<>();
        shoulders.add(exerciseGenerator.generateShoulderBasicExcercise());
        shoulders.add(new Exercise(ShouldersAccessories1Excercises.DUMBBELLS_LATERAL_RISES.getExerciseName(), exerciseGenerator.getRandomReps(ShouldersAccessories1Excercises.DUMBBELLS_LATERAL_RISES.getReps())));
        shoulders.add(new Exercise(ShouldersAccessories1Excercises.CABLE_LATERAL_RISES.getExerciseName(), exerciseGenerator.getRandomReps(ShouldersAccessories1Excercises.CABLE_LATERAL_RISES.getReps())));
        shoulders.add(exerciseGenerator.generateRearShoulderExercise());

        return shoulders;
    }
}
