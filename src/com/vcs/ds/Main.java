package com.vcs.ds;

import com.vcs.ds._10_model.database.ClientsDatabase;
import com.vcs.ds._10_model.database.RequestsDatabase;
import com.vcs.ds._10_model.input.RequestInput;
import com.vcs.ds._20_client.Client;
import com.vcs.ds._20_request.Request;

public class Main {

    public static void main(String[] args) {

//        ClientsDatabase
        ClientsDatabase clientsDatabase = new ClientsDatabase();

//        RequestsDatabase

//        ProducersDatabase
//        ProposalsDatabase
//
//
//        Receive RequestInput

//        Create RequestInput
        RequestInput requestInput = new RequestInput();

//        If Client is new, create new Client id, put in to ClientDatabase todo Stage2

//        Create new Request
        Request request = new Request(requestInput);

//        Put Request in to RequestsDatabase
        RequestsDatabase requestsDatabase = new RequestsDatabase();
        requestsDatabase.getRequestsDatabase().add(request);

//        Initiate Proposal


//        Sort ProposalsValid todo
//        Put ProposalsValid to ProposalsDatabase todo
//
//        Create OutputToClient put Producer name, availale time, price todo
//
//
//       todo Stage3:
//        Receive ProducerInput
//        Check validity
//        Create ProducerId
//        Put to ProducersDatabase
//
//        Active/NotActive Producer, Proposal


    }
}
