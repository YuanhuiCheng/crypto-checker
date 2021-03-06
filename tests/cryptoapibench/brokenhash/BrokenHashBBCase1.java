package org.cryptoapi.bench.brokenhash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class BrokenHashBBCase1 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        String name = "abcdef";
        // :: error: algorithm.not.allowed
        MessageDigest md = MessageDigest.getInstance("SHA1");
        md.update(name.getBytes());
        System.out.println(md.digest());
    }
}
