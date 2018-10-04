import static org.junit.Assert.*;

public class DinoMathTest {

    @org.junit.Test
    public void mulDigigts() {
        long result = DinoMath.mulDigigts(123);
        assertEquals(6,result);
        result = DinoMath.mulDigigts(0);
        assertEquals(0,result);
        result = DinoMath.mulDigigts(234235235);
        assertEquals(29,result);
        result = DinoMath.mulDigigts(-13);
        assertEquals(4,result);
    }
}