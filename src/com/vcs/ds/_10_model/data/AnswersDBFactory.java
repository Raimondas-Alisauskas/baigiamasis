package com.vcs.ds._10_model.data;

public class AnswersDBFactory {

    private static DataInterface dbInstance = null;

    public static DataInterface getDbInstance(){


        if (dbInstance == null) {
            dbInstance = creteDbInstance();
        }
        return dbInstance;
    }

    private static DataInterface creteDbInstance(){
        //config mode
        int mode = 0;//For static data mode

       switch (mode){
           case 0:
               return new AnswersStaticData();
           default:
               break;
        }
        throw new RuntimeException("Not existing mode type"); // TODO: 18.8.22 Make test
    }
}