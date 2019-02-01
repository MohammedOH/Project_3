package JUnitTests;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import MyProgram.*;

public class UnitTests {
    public static String s = "JAVA PROGRAMMING";


    Main myProgram;
    @Test
    @Before
    public void testMain() {
        myProgram = new Main();
    }

    /* Test ciphering */
    @Test
    public void testCipheringAtbash(){
        String testCipheringAtbash = myProgram.cipheringAtbash(s);
        Assert.assertEquals(testCipheringAtbash, "QZEZ KILTIZNNRMT");
    }

    @Test
    public void testCipheringHex(){
        String testCipheringHex = myProgram.cipheringHex(s);
        Assert.assertEquals(testCipheringHex ,"4A 41 56 41 20 50 52 4F 47 52 41 4D 4D 49 4E 47");
    }

    @Test
    public void testCipheringVigenere(){
        String testCipheringVigenere = myProgram.cipheringVigenere(s);
        Assert.assertEquals(testCipheringVigenere ,"BEXR TKGKTRQFARI");
    }

    /* Testing deciphering */
    @Test
    public void testDecipheringAtbash(){
        String testDecipheringAtbash = myProgram.decipheringAtbash("QZEZ KILTIZNNRMT");
        Assert.assertEquals(testDecipheringAtbash, s);
    }

    @Test
    public void testDecipheringHex(){
        String testDecipheringHex = myProgram.decipheringHex("4A 41 56 41 20 50 52 4F 47 52 41 4D 4D 49 4E 47");
        Assert.assertEquals(testDecipheringHex ,s);
    }

    @Test
    public void testDecipheringVigenere(){
        String testDecipheringVigenere = myProgram.decipheringVigenere("BEXR TKGKTRQFARI");
        Assert.assertEquals(testDecipheringVigenere ,s);
    }

}