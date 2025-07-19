package NBV.sqa.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import sqa.main.Ranking;

public class SilverTesting {

    Ranking ranking = new Ranking();

    @Test
    public void testBelowSilverThreshold() {
        assertEquals("Standard", ranking.CalculateMembershipRank(9999, 1, 100));
    }

    @Test
    public void testAtSilverLowerBound() {
        assertEquals("Silver", ranking.CalculateMembershipRank(10000, 1, 100));
    }

    @Test
    public void testAtSilverUpperBound() {
        assertEquals("Silver", ranking.CalculateMembershipRank(49999, 2, 500));
    }

    @Test
    public void testFrequencyBelowSilver() {
        assertEquals("Standard", ranking.CalculateMembershipRank(10000, 0, 100));
    }

    @Test
    public void testPointBelowSilver() {
        assertEquals("Standard", ranking.CalculateMembershipRank(10000, 1, 99));
    }
}
