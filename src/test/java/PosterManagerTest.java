import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class PosterManagerTest {
    @Test
    public  void test(){
        PosterManager manager = new PosterManager(3);
        manager.add("Film 1");
        manager.add("Film 2");
        manager.add("Film 3");
        String[] expected = {"Film 1", "Film 2", "Film 3"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
}
