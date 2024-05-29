package pl.myproject.training.model.mapper;


import pl.myproject.training.model.BroSplit;
import pl.myproject.training.model.BroSplitDto;
import pl.myproject.training.model.Fbw;
import pl.myproject.training.model.FbwAB;
import pl.myproject.training.model.PushPullLegs;
import pl.myproject.training.model.UpperLower;
import pl.myproject.training.model.UpperLowerAB;
import pl.myproject.training.model.dto.FbwAbDto;
import pl.myproject.training.model.dto.FbwDto;
import pl.myproject.training.model.dto.PushPullLegsDto;
import pl.myproject.training.model.dto.UpperLowerAbDto;
import pl.myproject.training.model.dto.UpperLowerDto;

public class TrainingMapper {

    public static PushPullLegsDto mapToPushPullLegsDto(PushPullLegs pushPullLegs) {
        return PushPullLegsDto.builder()
                .trainingType(pushPullLegs.getTrainingType())
                .PUSH(pushPullLegs.getPUSH())
                .PULL(pushPullLegs.getPULL())
                .LEGS(pushPullLegs.getLEGS())
                .build();
    }

    public static UpperLowerAbDto mapToUpperLowerABDto(UpperLowerAB upperLowerAB) {
        return UpperLowerAbDto.builder()
                .trainingType(upperLowerAB.getTrainingType())
                .upperA(upperLowerAB.getUpperA())
                .lowerA(upperLowerAB.getLowerA())
                .upperB(upperLowerAB.getUpperB())
                .lowerB(upperLowerAB.getLowerB())
                .build();
    }

    public static UpperLowerDto mapToUpperLowerDto(UpperLower upperLower) {
        return UpperLowerDto.builder()
                .trainingType(upperLower.getTrainingType())
                .upper(upperLower.getUpper())
                .lower(upperLower.getLower())
                .build();
    }

    public static FbwAbDto mapToFbwAbDto(FbwAB fbwAB) {
        return FbwAbDto.builder()
                .trainingType(fbwAB.getTrainingType())
                .trainingA(fbwAB.getFbwA())
                .trainingB(fbwAB.getFbwB())
                .build();
    }

    public static FbwDto mapToFbwDto(Fbw fbw) {
        return FbwDto.builder()
                .trainingType(fbw.getTrainingType())
                .fbw(fbw.getFbw())
                .build();
    }

    public static BroSplitDto mapToBroSplitDto(BroSplit broSplit) {
        return BroSplitDto.builder()
                .trainingType(broSplit.getTrainingType())
                .chestBiceps(broSplit.getChestBiceps())
                .backTriceps(broSplit.getBackTriceps())
                .shoulders(broSplit.getShoulders())
                .legs(broSplit.getLegs())
                .build();
    }
}
