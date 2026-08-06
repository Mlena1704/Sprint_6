import org.example.Cat;
import org.example.Predator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    private Predator predator;

    @Test
    public void testGetSoundReturnsMeow() {
        Cat cat = new Cat(predator);



        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void testGetFoodCallsPredatorAndReturnsCorrectList() throws Exception {
        Cat cat = new Cat(predator);

        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");

        Mockito.when(predator.eatMeat()).thenReturn(expectedFood);

        List<String> actualFood = cat.getFood();

        assertEquals(expectedFood, actualFood);
    }
}
