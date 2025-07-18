package RB.sqa.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import sqa.main.Ranking;

public class PlatinumTesting {

    Ranking ranking = new Ranking();

    @Test
    public void testPurchaseBelowPlatinum() {
        assertEquals("Platinum", ranking.CalculateMembershipRank(99999, 6, 1200)); // ต่ำกว่า 100,000
    }

    @Test
    public void testPurchaseAbovePlatinum() {
        assertEquals("Platinum", ranking.CalculateMembershipRank(100000, 6, 1200));
    }

    @Test
    public void testFreqBelowPlatinum() {
        assertEquals("Platinum", ranking.CalculateMembershipRank(150000, 6, 1500));
    }

    @Test
    public void testFreqAboveBelowPlatinum() {
        assertEquals("Platinum", ranking.CalculateMembershipRank(150000, 5, 1800)); // ต่ำกว่า 6
    }

    @Test
    public void testPointBelowPlatinum() {
        assertEquals("Platinum", ranking.CalculateMembershipRank(150000, 6, 1700));
    }

    @Test
    public void testPointAbovePlatinum() {
        assertEquals("Platinum", ranking.CalculateMembershipRank(150000, 8, 1200)); // มากกว่า 7
    }
}
