package com.vcs.ds._10_model.data;

import com.vcs.ds._20_client.Client;

import java.util.ArrayList;
import java.util.List;

public class ClientsData implements DataStorage{

    private  List<Client> clientsList;

     public ClientsData() {

        clientsList = new ArrayList<>();
        clientsList.add( 0 , new Client("C0"));
        clientsList.add( 1 , new Client("C1"));
        clientsList.add( 2 , new Client("C2"));
    }

    //getset
    public List<Client> getClientsList() {
        return clientsList;
    }

    public void setClientsList(List<Client> clientsList) {
        this.clientsList = clientsList;
    }

}
