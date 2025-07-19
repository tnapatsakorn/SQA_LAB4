package NBV.sqa.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import sqa.main.Ranking;

public class GoldTesting {

    Ranking ranking = new Ranking();

    @Test
    public void testAtGoldLowerBound() {
        assertEquals("Gold", ranking.CalculateMembershipRank(50000, 3, 500));
    }

    @Test
    public void testAtGoldUpperBound() {
        assertEquals("Gold", ranking.CalculateMembershipRank(99999, 5, 1000));
    }

    @Test
    public void testMiddleOfGoldRange() {
        assertEquals("Gold", ranking.CalculateMembershipRank(55000, 4, 750));
    }

    @Test
    public void testPointBelowGold() {
        assertEquals("Silver", ranking.CalculateMembershipRank(50000, 3, 499));
    }

    @Test
    public void testFrequencyBelowGold() {
        assertEquals("Silver", ranking.CalculateMembershipRank(50000, 2, 500));
    }
}
