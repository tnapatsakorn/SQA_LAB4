package NBV.sqa.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import sqa.main.Ranking;

public class SilverTesting {

    Ranking ranking = new Ranking();

    @Test
    public void testLowerBoundarySilver() {
        assertEquals("Silver", ranking.CalculateMembershipRank(10000, 1, 100));
    }

    @Test
    public void testUpperBoundaryPurchaseSilver() {
        assertEquals("Silver", ranking.CalculateMembershipRank(49999, 2, 499));
    }

    @Test
    public void testInvalidJustOverSilver() {
        assertEquals("Silver", ranking.CalculateMembershipRank(50000, 3, 500));
    }

    @Test
    public void testEdgeFailSilverFrequency() {
        assertEquals("Silver", ranking.CalculateMembershipRank(20000, 2, 200)); // frequency < 1
    }

    @Test
    public void testEdgeFailSilverPoint() {
        assertEquals("Silver", ranking.CalculateMembershipRank(23000, 2, 220)); // point < 100
    }
}
