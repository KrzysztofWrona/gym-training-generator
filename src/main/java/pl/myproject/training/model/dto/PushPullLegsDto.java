package pl.myproject.training.model.dto;

import lombok.Builder;
import lombok.Getter;
import pl.myproject.training.model.Exercise;

import java.util.List;

@Getter
@Builder
public class PushPullLegsDto {

    private String trainingType;
    private List<Exercise> PUSH;
    private List<Exercise> PULL;
    private List<Exercise> LEGS;
}
