package pl.myproject.training.model.dto;

import lombok.Builder;
import lombok.Getter;
import pl.myproject.training.model.Exercise;

import java.util.List;
@Getter
@Builder
public class UpperLowerAbDto {

    private String trainingType;
    private List<Exercise> upperA;
    private List<Exercise> lowerA;
    private List<Exercise> upperB;
    private List<Exercise> lowerB;
}
