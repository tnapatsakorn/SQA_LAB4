package RB.sqa.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import sqa.main.Ranking;

public class PlatinumTesting {

    Ranking ranking = new Ranking();

    @Test
    public void testPlatinum_ExactMinimum() {
        assertEquals("Platinum", ranking.CalculateMembershipRank(100000, 6, 1000));
    }

    @Test
    public void testPlatinum_AboveMinimum() {
        assertEquals("Platinum", ranking.CalculateMembershipRank(150000, 7, 1200));
    }

    @Test
    public void testPlatinum_LowerFrequencyInvalid() {
        assertEquals("Gold", ranking.CalculateMembershipRank(100000, 5, 1000));
    }

    @Test
    public void testPlatinum_UpperFrequencyInvalid() {
        assertEquals("Platinum", ranking.CalculateMembershipRank(100000, 8, 1200));
    }

    @Test
    public void testPlatinum_LowerPointInvalid() {
        assertEquals("Gold", ranking.CalculateMembershipRank(100000, 6, 999));
    }

    @Test
    public void testPlatinum_AbovePoint() {
        assertEquals("Platinum", ranking.CalculateMembershipRank(100000, 7, 2000));
    }

 
    @Test
    public void testAllInvalidValues_ReturnStandard() {
        assertEquals("Standard", ranking.CalculateMembershipRank(5000, 0, 50));
    }
}
