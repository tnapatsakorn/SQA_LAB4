package RB.sqa.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import sqa.main.Ranking;

public class SilverTesting {

    Ranking ranking = new Ranking();

    @Test
    public void testPurchaseBelowSilver() {
        assertEquals("Silver", ranking.CalculateMembershipRank(9999, 1, 150)); // ต่ำกว่า 10,000
    }

    @Test
    public void testPurchaseAboveSilver() {
        assertEquals("Silver", ranking.CalculateMembershipRank(50000, 1, 150)); // เท่ากับขอบบน
    }

    @Test
    public void testFrequencyBelowSilver() {
        assertEquals("Silver", ranking.CalculateMembershipRank(20000, 3, 150)); // ต่ำกว่า 1
    }

    @Test
    public void testFrequencyAboveSilver() {
        assertEquals("Silver", ranking.CalculateMembershipRank(25000, 3, 150)); // มากกว่า 2
    }

    @Test
    public void testPointBelowSilver() {
        assertEquals("Silver", ranking.CalculateMembershipRank(19000, 2, 99)); // ต่ำกว่า 100
    }

    @Test
    public void testPointAboveSilver() {
        assertEquals("Silver", ranking.CalculateMembershipRank(20000, 2, 500)); // เท่ากับขอบบน
    }
}
