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
public class FbwAB extends Training {

    private List<Exercise> fbwA;
    private List<Exercise> fbwB;

    {
        setTrainingType("FBW AB");
    }

}
