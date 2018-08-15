package com.vcs.ds._50_General;

import java.time.Instant;

public class IdGenerator {

    public static String generateIdKey(String prefix) { // TODO: V Sudeti prefiksus i viena vieta

        return prefix + Instant.now();
    }


}

