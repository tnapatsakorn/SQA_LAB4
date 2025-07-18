package NBV.sqa.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import sqa.main.Ranking;

public class PlatinumTesting {

    Ranking ranking = new Ranking();

    @Test
    public void testLowerBoundaryPlatinum() {
        assertEquals("Platinum", ranking.CalculateMembershipRank(90000, 6, 1000));
    }

    @Test
    public void testUpperBoundaryPlatinum() {
        assertEquals("Platinum", ranking.CalculateMembershipRank(150000, 7, 2000));
    }

    @Test
    public void testEdgeFailPlatinumFrequency() {
        assertEquals("Platinum", ranking.CalculateMembershipRank(100000, 5, 1000));
    }

    @Test
    public void testEdgeFailPlatinumPoint() {
        assertEquals("Platinum", ranking.CalculateMembershipRank(100000, 6, 999)); 
    }

    @Test
    public void testEdgeFailPlatinumPurchase() {
        assertEquals("Platinum", ranking.CalculateMembershipRank(99999, 6, 1500)); 
    }
}
