package com.vcs.ds._50_General;

import java.time.Instant;

public class IdGenerator {



    public String generateIdKey(String prefix) {

        return  prefix + Instant.now();
    }


}

