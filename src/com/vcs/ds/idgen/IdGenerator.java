package com.vcs.ds.idgen;

import java.time.Instant;

public class IdGenerator {



    public String generateIdKey(String prefix) {

        return  prefix + Instant.now();
    }


}

