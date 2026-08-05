import org.example.Feline;
import org.example.Lion;
import org.example.Predator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {


    @Mock
    private Predator predator;

    @Mock
    private Feline feline;

    @Test
    public void testLionConstructorThrowsExceptionOnInvalidSex() {
        Exception exception = assertThrows(Exception.class, () -> {
            new Lion(predator, "НеизвестныйПол");
        });

        assertEquals("Используйте допустимые значения пола кошачьего: Самец или Самка", exception.getMessage());
    }

    @Test
    public void testGetFoodReturnsCorrectList() throws Exception {
        Lion lion = new Lion(predator, "Самец");

        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(predator.eatMeat()).thenReturn(expectedFood);

        assertEquals(expectedFood, lion.getFood());
    }

    @Test
    public void testGetKittensReturnsCorrectCount() throws Exception {
        Lion lion = new Lion(predator, "Самка");

        Mockito.when(feline.getCount()).thenReturn(1);

        assertEquals(1, lion.getKittens(feline));
    }
}