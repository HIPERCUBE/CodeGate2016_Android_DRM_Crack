package com.hipercube.codegate2016;

import java.util.Random;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/**
 * Created by Joowon on 4/22/16.
 */

public class PValue {
    protected long value;

    protected static final String words = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private byte[] key;
    private byte[] gerbv;

    public PValue(long value) {
        this.value = value;

        Random rand = new Random();
        key = new byte[16];
        for (int i = 0; i < key.length; ++i) {
            key[i] = (byte) words.charAt(rand.nextInt(words.length()));
        }
    }

    public void setValue(long value) {
        this.value = value;

        String input = Long.toString(value);
        SecretKeySpec spec = new SecretKeySpec(key, "AES");
        try {
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, spec);
            gerbv = cipher.doFinal(input.getBytes("UTF-8"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public long getValue() {
        SecretKeySpec spec = new SecretKeySpec(key, "AES");
        try {
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, spec);
            byte[] tmp = cipher.doFinal(gerbv);
            return Long.parseLong(new String(tmp));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}
