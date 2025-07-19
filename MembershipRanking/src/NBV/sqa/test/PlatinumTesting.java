package NBV.sqa.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import sqa.main.Ranking;

public class PlatinumTesting {

    Ranking ranking = new Ranking();

    @Test
    public void testAtPlatinumLowerBound() {
        assertEquals("Platinum", ranking.CalculateMembershipRank(100000, 6, 1000));
    }

    @Test
    public void testAbovePlatinum() {
        assertEquals("Platinum", ranking.CalculateMembershipRank(100001, 7, 1500));
    }

    @Test
    public void testFrequencyBelowPlatinum() {
        assertEquals("Gold", ranking.CalculateMembershipRank(100000, 5, 1000));
    }
}
