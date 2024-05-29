package pl.myproject.training.model;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class BroSplitDto {

    private String trainingType;
    private List<Exercise> chestBiceps;
    private List<Exercise> backTriceps;
    private List<Exercise> shoulders;
    private List<Exercise> legs;
}
