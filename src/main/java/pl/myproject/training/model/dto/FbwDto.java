package pl.myproject.training.model.dto;

import lombok.Builder;
import lombok.Getter;
import pl.myproject.training.model.Exercise;

import java.util.List;


@Getter
@Builder
public class FbwDto {

    private String trainingType;
    private List<Exercise> fbw;

}
