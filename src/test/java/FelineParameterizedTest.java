import org.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineParameterizedTest {

    private final int inputKittens;
    private final int expectedKittens;

    public FelineParameterizedTest(int inputKittens, int expectedKittens) {
        this.inputKittens = inputKittens;
        this.expectedKittens = expectedKittens;

    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, 1},
                {5, 5},
                {0, 0},
                {-1, -1}
        });
    }

    @Test
    public void testGetCountWithArguments() {
        Feline feline = new Feline();

        assertEquals(expectedKittens, feline.getCount(inputKittens));
    }
}