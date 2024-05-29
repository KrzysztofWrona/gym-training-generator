package pl.myproject.training.controller;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.myproject.training.model.BroSplitDto;
import pl.myproject.training.model.dto.FbwAbDto;
import pl.myproject.training.model.dto.FbwDto;
import pl.myproject.training.model.dto.PushPullLegsDto;
import pl.myproject.training.model.dto.UpperLowerAbDto;
import pl.myproject.training.model.dto.UpperLowerDto;
import pl.myproject.training.service.TrainingService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/training")
public class TrainingController {

    private final TrainingService trainingService;

    @GetMapping("/test")
    public String test() {
        System.out.println("Test endpoint was called");
        return "Hello world";
    }

    @GetMapping("/push-pull-legs")
    public PushPullLegsDto getPPLTraining() {
        return trainingService.generatePushPullLegs();
    }

    @GetMapping("/upper-lower-ab")
    public UpperLowerAbDto getUpperLowerABTraining() {
        return trainingService.generateUpperLowerAB();
    }

    @GetMapping("/upper-lower")
    public UpperLowerDto getUpperLowerTraining() {
        return trainingService.generateUpperLowerTraining();
    }

    @GetMapping("/fbw-ab")
    public FbwAbDto getFbwABTraining() {
        return trainingService.generateFbwABTraining();
    }

    @GetMapping("/fbw-beginner")
    public FbwDto getFbwTraining(){
        return trainingService.generateFBWTraining();
    }

    @GetMapping("/bro-split")
    public BroSplitDto getBroSplitTraining(){
        return trainingService.generateBroSplitTraining();
    }

}
