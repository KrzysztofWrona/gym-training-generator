package pl.myproject.training.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpperLowerAB extends Training {

    private List<Exercise> upperA;
    private List<Exercise> lowerA;
    private List<Exercise> upperB;
    private List<Exercise> lowerB;

    {
        setTrainingType("Upper Lower, A and B");
    }

}
