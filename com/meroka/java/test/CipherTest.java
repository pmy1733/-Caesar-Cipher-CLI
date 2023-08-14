package com.meroka.java.test;

import com.meroka.java.main.CaecerCipher;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CipherTest {
    @Test
    void confirmEncryption(){
        String enString= CaecerCipher.encrypt("ewJaghcsR",9);
        assertEquals("nFSjpqlBa",enString);
    }
    @Test
    void confirmDecryption(){
        String deString= CaecerCipher.decrypt("MerIOPKaz",9);
        assertEquals("DVizFGBRq",deString);
    }


}