package NBV.sqa.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import sqa.main.Ranking;

public class GoldTesting {

    Ranking ranking = new Ranking();

    @Test
    public void testLowerBoundaryGold() {
        assertEquals("Gold", ranking.CalculateMembershipRank(50000, 3, 500));
    }

    @Test
    public void testUpperBoundaryGold() {
        assertEquals("Gold", ranking.CalculateMembershipRank(40000, 5, 500));
    }

    @Test
    public void testInvalidJustOverGold() {
        assertEquals("Gold", ranking.CalculateMembershipRank(100000, 6, 1000));
    }

    @Test
    public void testEdgeFailGoldPurchase() {
        assertEquals("Gold", ranking.CalculateMembershipRank(49999, 4, 600)); 
    }

    @Test
    public void testEdgeFailGoldFrequency() {
        assertEquals("Gold", ranking.CalculateMembershipRank(70000, 2, 600));
    }
}
