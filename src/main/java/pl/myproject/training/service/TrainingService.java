package pl.myproject.training.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.myproject.training.model.BroSplit;
import pl.myproject.training.model.BroSplitDto;
import pl.myproject.training.model.Exercise;
import pl.myproject.training.model.Fbw;
import pl.myproject.training.model.FbwAB;
import pl.myproject.training.model.PushPullLegs;
import pl.myproject.training.model.UpperLower;
import pl.myproject.training.model.UpperLowerAB;
import pl.myproject.training.model.dto.FbwAbDto;
import pl.myproject.training.model.dto.FbwDto;
import pl.myproject.training.model.dto.PushPullLegsDto;
import pl.myproject.training.model.dto.UpperLowerAbDto;
import pl.myproject.training.model.dto.UpperLowerDto;
import pl.myproject.training.model.mapper.TrainingMapper;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TrainingService {

    private final TrainingGenerator trainingGenerator;

    public PushPullLegsDto generatePushPullLegs() {

        List<Exercise> push = trainingGenerator.generatePushExercises();
        List<Exercise> pull = trainingGenerator.generatePullExercises();
        List<Exercise> legs = trainingGenerator.generateLegsExcercises();

        PushPullLegs pushPullLegs = new PushPullLegs(push, pull, legs);
        return TrainingMapper.mapToPushPullLegsDto(pushPullLegs);
    }

    public UpperLowerAbDto generateUpperLowerAB() {

        List<Exercise> upperA = trainingGenerator.generateUpperA();
        List<Exercise> lowerA = trainingGenerator.generateLowerA();
        List<Exercise> upperB = trainingGenerator.generateUpperB(upperA);
        List<Exercise> lowerB = trainingGenerator.generateLowerB(lowerA);

        UpperLowerAB upperLowerAB = new UpperLowerAB(upperA, lowerA, upperB, lowerB);
        return TrainingMapper.mapToUpperLowerABDto(upperLowerAB);
    }


    public UpperLowerDto generateUpperLowerTraining() {

        List<Exercise> upper = trainingGenerator.generateUpper();
        List<Exercise> lower = trainingGenerator.generateLower();

        UpperLower upperLower = new UpperLower(upper, lower);
        return TrainingMapper.mapToUpperLowerDto(upperLower);
    }

    public FbwAbDto generateFbwABTraining() {

        List<Exercise> fbwA = trainingGenerator.generateFbwA();
        List<Exercise> fbwB = trainingGenerator.generateFbwB(fbwA);

        FbwAB fbwAB = new FbwAB(fbwA, fbwB);
        return TrainingMapper.mapToFbwAbDto(fbwAB);
    }

    public FbwDto generateFBWTraining() {

        List<Exercise> fbw = trainingGenerator.generateFBW();

        Fbw fbw1 = new Fbw(fbw);
        return TrainingMapper.mapToFbwDto(fbw1);
    }

    public BroSplitDto generateBroSplitTraining() {

        List<Exercise> chestBiceps = trainingGenerator.generateChestBiceps();
        List<Exercise> backTriceps = trainingGenerator.generateBackTriceps();
        List<Exercise> shoulders = trainingGenerator.generateShouldersExercises();
        List<Exercise> legs = trainingGenerator.generateLegsExcercises();

        BroSplit broSplit = new BroSplit(chestBiceps, backTriceps, shoulders, legs);
        return TrainingMapper.mapToBroSplitDto(broSplit);
    }
}
