import Essentials.ITicketed;
import Punters.FestivalGoer;
import Stages.Stage1;
import Stages.Stage2;
import Stages.Stage3;
import Stages.Stage4;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AlrightFestTest {
    AlrightFest alrightFest;
    Stage1 stage1;
    Stage2 stage2;
    Stage3 stage3;
    Stage4 stage4;
    FestivalGoer festivalGoer;

    @Before
    public void before(){
        stage1 = new Stage1("The Niel Diamond stage", "Auditorium", "Main Stage");
        stage2 = new Stage2("That tent, y'know, THAT tent", "Tent", "Away from the campsite");
        stage3 = new Stage3("The Boogie Woogie Stage", "Boogying", "Where the funk and jazz is");
        stage4 = new Stage4("Harold's fun tent", "Duncing", "Near Harold's Tent");
        festivalGoer = new FestivalGoer(56, 99.00, "Angus McFinnerston");

    }

    @Test
    public void canGetName(){
        festivalGoer.getName();
        assertEquals("Angus McFinnerston", festivalGoer.getName());
    }


}
