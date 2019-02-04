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

    Cipher_Helper ciphering;

    @Test
    @Before
    public void testCiphering_Helper() {
        ciphering = new Cipher_Helper();
    }

    /* Test ciphering */
    @Test
    public void testCipheringAtbash() {
        String testCipheringAtbash = ciphering.cipheringAtbash(s);
        Assert.assertEquals(testCipheringAtbash, "QZEZ KILTIZNNRMT");
    }

    @Test
    public void testCipheringHex() {
        String testCipheringHex = ciphering.cipheringHex(s);
        Assert.assertEquals(testCipheringHex, "4A 41 56 41 20 50 52 4F 47 52 41 4D 4D 49 4E 47 ");
    }

    @Test
    public void testCipheringVigenere() {
        String testCipheringVigenere = ciphering.cipheringVigenere(s);
        Assert.assertEquals(testCipheringVigenere, "BEXR TKGKTRQFARI");
    }

    /* Testing deciphering */
    @Test
    public void testDecipheringAtbash() {
        String testDecipheringAtbash = ciphering.cipheringAtbash("QZEZ KILTIZNNRMT");
        Assert.assertEquals(testDecipheringAtbash, s);
    }

    @Test
    public void testDecipheringHex() {
        String testDecipheringHex = ciphering.decipheringHex("4A 41 56 41 20 50 52 4F 47 52 41 4D 4D 49 4E 47 ");
        Assert.assertEquals(testDecipheringHex, s);
    }

    @Test
    public void testDecipheringVigenere() {
        String testDecipheringVigenere = ciphering.decipheringVigenere("BEXR TKGKTRQFARI");
        Assert.assertEquals(testDecipheringVigenere, s);
    }

}