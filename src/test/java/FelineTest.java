
import org.example.Feline;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class FelineTest {

    @Test
    public void testEatMeatReturnsCorrectFoodList() throws Exception {
        Feline feline = new Feline();

        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");

        assertEquals(expectedFood, feline.eatMeat());
    }

    @Test
    public void testGetFamilyReturnsFelineString() {
        Feline feline = new Feline();


        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void testGetCountWithoutArgumentsReturnsOne() {
        Feline feline = new Feline();

        assertEquals(1, feline.getCount());
    }
}