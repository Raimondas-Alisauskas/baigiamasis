package operators;

import rentalOperations.AdminOps;
import rentalOperations.InfoOperationsForAdmin;

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
