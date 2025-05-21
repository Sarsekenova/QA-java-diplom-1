package praktikum;
import org.junit.Assert;
import org.junit.Test;

public class IngredientTypeTests {

    @Test
    public void checkTypeSouse() {
        Assert.assertEquals( "SAUCE", IngredientType.SAUCE.name());
    }

    @Test
    public void checkTypeFilling() {
        Assert.assertEquals( "FILLING", IngredientType.FILLING.name());
    }
}