import com.example.Cat;
import com.example.Feline;
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
    Feline feline = new Feline();

    @Test
    public void catGetSoundTest(){
        Cat cat = new Cat(feline);
        String actualCatSound = cat.getSound();
        assertEquals ("Мяу", actualCatSound);

    }

    @Test
    public void catEatMeatTest() throws Exception {
        Cat cat = new Cat(feline);
        List<String> expectedCatListOfFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(expectedCatListOfFood);
        assertEquals(expectedCatListOfFood, cat.getFood());
    }

}
