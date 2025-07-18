package RB.sqa.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import sqa.main.Ranking;

public class GoldTesting {

    Ranking ranking = new Ranking();

    @Test
    public void testPurchaseBelowGold() {
        assertEquals("Gold", ranking.CalculateMembershipRank(15000, 4, 600));
    }

    @Test
    public void testPurchaseAboveGold() {
        assertEquals("Gold", ranking.CalculateMembershipRank(100000, 4, 600)); 
    }

    @Test
    public void testFrequencyBelowGold() {
        assertEquals("Gold", ranking.CalculateMembershipRank(60000, 2, 600));
    }

    @Test
    public void testFrequencyAboveGold() {
        assertEquals("Gold", ranking.CalculateMembershipRank(60000, 6, 600)); 
    }

    @Test
    public void testPointBelowGold() {
        assertEquals("Gold", ranking.CalculateMembershipRank(60000, 4, 499)); 
    }

    @Test
    public void testPointAboveGold() {
        assertEquals("Gold", ranking.CalculateMembershipRank(60000, 4, 1000));
    }
}
