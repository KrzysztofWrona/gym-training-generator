package pl.myproject.training.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class BroSplit extends Training {

    List<Exercise> chestBiceps;
    List<Exercise> backTriceps;
    List<Exercise> shoulders;
    List<Exercise> legs;
    {
        setTrainingType("bro-split");
    }
}
