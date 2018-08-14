package com.vcs.ds._50_General;

import java.time.Instant;

public class IdGenerator {


    public static String idKeyGen(String prefix) {
        String idKey;
        return idKey = prefix + Instant.now().getEpochSecond();
    }


}

