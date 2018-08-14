package com.vcs.toptags;

public enum EnumNewsPages {
    DIENA_LT("NewsPageDienaLt"), VZ_LT("NewsPageVZLt"), DELFI_LT("NewsPageDienaLt"), MIN_LT("NewsPageDienaLt");

//    DIENA_LT(), VZ_LT("https://www.vz.lt/", "article-img", "\""), DELFI_LT("http://www.delfi.lt/", "tag", "\'"), MIN_LT("https://www.15min.lt/", "tag", "\'");

    private String adapterClass;

    private EnumNewsPages(String setedAdapterClass){
       adapterClass = setedAdapterClass;

    }

    public String getAdapterClass(){
        return adapterClass;
    }

    public EnumNewsPages valueOfSilent(String value) {
        try {
            return EnumNewsPages.valueOf(value);
        } catch (Exception e) {

        }
        return null;
    }

//    Naugojimas kitoje klaseje:
//    NewsPages wp = null;
//    NewsPages newsPage = NewsPages.DELFI_LT;
//    System.out.printl(" day: " NewsPages.getNameOfPage());

}
