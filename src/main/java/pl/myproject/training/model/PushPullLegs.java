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
public class PushPullLegs extends Training {

    private List<Exercise> PUSH;
    private List<Exercise> PULL;
    private List<Exercise> LEGS;

    {
        setTrainingType("Push Pull Legs");
    }
}
