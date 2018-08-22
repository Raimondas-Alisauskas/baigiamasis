package com.vcs.operators;

import com.vcs.rentalOperations.AdminOps;

public class Administrator extends AdminOps {

public String name;
public String surname;

public Administrator (){
    this("Vardas", "Pavarde");
}

    public Administrator (String n, String s){
        this.name=n;
        this.surname=s;
    }


}
