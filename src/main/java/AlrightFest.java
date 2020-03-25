import Essentials.ITicketed;
import Punters.FestivalGoer;
import Stages.Stage1;
import Stages.Stage2;
import Stages.Stage3;
import Stages.Stage4;

public class AlrightFest implements ITicketed {

    private String name;
    private Stage1 stage1;
    private Stage2 stage2;
    private Stage3 stage3;
    private Stage4 stage4;
    private FestivalGoer festivalGoer;

    public AlrightFest(String name, Stage1 stage1, Stage2 stage2, Stage3 stage3, Stage4 stage4, FestivalGoer festivalGoer){
        this.name = name;
        this.stage1 = stage1;
        this.stage2 = stage2;
        this.stage3 = stage3;
        this.stage4 = stage4;
        this.festivalGoer = festivalGoer;
    }

    public String getName() {
        return name;
    }

    public Stage1 getStage1() {
        return stage1;
    }

    public Stage2 getStage2() {
        return stage2;
    }

    public Stage3 getStage3() {
        return stage3;
    }

    public Stage4 getStage4() {
        return stage4;
    }

    public FestivalGoer getFestivalGoer() {
        return festivalGoer;
    }

    public double price(double price){
        return price;
    }
}
