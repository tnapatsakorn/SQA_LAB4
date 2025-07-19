package RB.sqa.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import sqa.main.Ranking;

public class GoldTesting {

    Ranking ranking = new Ranking();

    @Test
    public void testGold_LowerPurchase() {
        assertEquals("Silver", ranking.CalculateMembershipRank(49999, 3, 500));
    }

    @Test
    public void testGold_UpperPurchase() {
        assertEquals("Gold", ranking.CalculateMembershipRank(99999, 5, 1000));
    }

    @Test
    public void testGold_LowerFrequencyInvalid() {
        assertEquals("Silver", ranking.CalculateMembershipRank(50000, 2, 500));
    }

    @Test
    public void testGold_UpperFrequencyInvalid() {
        assertEquals("Platinum", ranking.CalculateMembershipRank(50000, 6, 500));
    }

    @Test
    public void testGold_LowerPointInvalid() {
        assertEquals("Silver", ranking.CalculateMembershipRank(50000, 3, 499));
    }

    @Test
    public void testGold_UpperPointInvalid() {
        assertEquals("Platinum", ranking.CalculateMembershipRank(50000, 5, 1001));
    }
}
