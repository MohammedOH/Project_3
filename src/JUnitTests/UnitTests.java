package JUnitTests;
import org.junit.Before;
import org.junit.Test;
import MyProgram.*;

public class UnitTests {

    Main myProgram;
    @Test
    @Before
    public void test() {
        myProgram = new Main();
    }

}