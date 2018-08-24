package com.vcs.ds._10_model.data;

public class ProposalsDBFactory  {

    private static DASData dbInstance = null;

    public static DASData getDbInstance(){


        if (dbInstance == null) {
            dbInstance = creteDbInstance();
        }
        return dbInstance;
    }

    private static DASData creteDbInstance(){
        //config mode
        int mode = 0;//For static data mode

       switch (mode){
           case 0:
               return new ProposalsStaticDASData();
           default:
               break;
        }
        throw new RuntimeException("Not existing mode type"); // TODO: 18.8.22 Make test
    }
}
