import com.example.Feline;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class FelineTest {

    Feline feline = new Feline();

    @Test
    public void felineEatMeatTest() throws Exception {
        List<String> expectedFelineListOfFood = List.of("Животные", "Птицы", "Рыба");
        assertEquals (expectedFelineListOfFood, feline.eatMeat());
    }

    @Test
    public void felineGetFamilyTest(){
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void felineGetKittensOneTest() {
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void felineGetKittensCountTest() {
        assertEquals(3, feline.getKittens(3));
    }
}
