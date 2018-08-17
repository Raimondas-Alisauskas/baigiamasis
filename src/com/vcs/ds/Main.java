package com.vcs.ds;

import com.vcs.ds._10_model.database.RequestsDatabase;
import com.vcs.ds._10_model.input.RequestInput;
import com.vcs.ds._20_request.Request;
import com.vcs.ds._30_proposal.Proposal;
import com.vcs.ds._50_General.DateToInteger;

public class Main {

    public static void main(String[] args) {

//        ClientsDatabase
//        RequestsDatabase
//        ProducersDatabase
//        ProposalsDatabase
//
//
//        Receive RequestInput

//        Create RequestInput
        RequestInput requestInput = new RequestInput();

//       DateToInteger a = new DateToInteger();
//       int b = a.stringToIntegerCalc("1", "1");
       int b = new DateToInteger().stringToIntegerCalc("2","3");

//        If Client is new, create new Client id, put in to ClientDatabase todo V
//        Create RequestId    todo? ar cia ar Requeste?

//        Create new Request
        Request request = new Request(requestInput);

//        Put Request in to RequestsDatabase
        RequestsDatabase addRequest = new RequestsDatabase();
        addRequest.requestsDatabase.add(request);

//        Create new Proposal todo
        Proposal proposal = new Proposal();

//        Calculate Avalibility. If True => Proposal is Valid todo
//        Calculate Price. If < MaxPrice   => Proposal is Valid todo
//        Calculate Score todo
//        Create ProposalId todo
//        Put ID, availale time, Price, Score in to Proposal todo
//        Create List ProposalsRanked put Proposal to ProposalsRanked todo
//        Sort ProposalsRanked todo
//        Put ProposalsRanked to ProposalsDatabase todo
//
//        Create OutputToClient put Producer name, availale time, price todo
//
//
//       Vėliau:
//        Receive ProducerInput
//        Check validity
//        Create ProducerId
//        Put to ProducersDatabase
//
//        Active/NotActive Producer, Proposal


    }
}
