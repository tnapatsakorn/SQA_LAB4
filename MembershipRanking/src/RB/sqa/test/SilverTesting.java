package RB.sqa.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import sqa.main.Ranking;

public class SilverTesting {

    Ranking ranking = new Ranking();

    @Test
    public void testSilver_LowerPurchase() {
        assertEquals("Standard", ranking.CalculateMembershipRank(9999, 1, 100));
    }

    @Test
    public void testSilver_UpperPurchase() {
        assertEquals("Silver", ranking.CalculateMembershipRank(49999, 2, 500));
    }

    @Test
    public void testSilver_LowerFrequencyInvalid() {
        assertEquals("Standard", ranking.CalculateMembershipRank(10000, 0, 100));
    }

    @Test
    public void testSilver_UpperFrequencyInvalid() {
        assertEquals("Gold", ranking.CalculateMembershipRank(10000, 3, 100));
    }

    @Test
    public void testSilver_LowerPointInvalid() {
        assertEquals("Standard", ranking.CalculateMembershipRank(10000, 1, 99));
    }

    @Test
    public void testSilver_UpperPointInvalid() {
        assertEquals("Gold", ranking.CalculateMembershipRank(10000, 2, 501));
    }
}
