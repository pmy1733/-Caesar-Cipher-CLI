package com.meroka.java.test;

import com.meroka.java.main.Cipher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CipherTest {
    Cipher tests=new Cipher();

    @Test
    void confirmEncryption(){
        String enString= Cipher.decrypt("VnARXYTjI",9);
        assertEquals("MerIOPKaz",enString);
    }

    void confirmDecryption(){
        String enString= Cipher.encrypt("MerIOPKaz",9);
        assertEquals("VnARXYTjI",enString);
    }




}