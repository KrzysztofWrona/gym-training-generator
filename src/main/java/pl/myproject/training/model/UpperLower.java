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
public class UpperLower extends Training {

    private List<Exercise> upper;
    private List<Exercise> lower;

    {
        setTrainingType("Upper Lower");
    }
}
