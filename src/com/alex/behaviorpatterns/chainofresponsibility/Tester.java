package com.alex.behaviorpatterns.chainofresponsibility;

public class Tester {
    public static void main(String[] args) {
        //create success chain
        IssueHandler bugHandler = new HelpDesk(new ProductManager(new SeniorDeveloper( new FrontendDeveloper( new BackendDeveloper(null)))));

        //Tester forwarding the bug to be handled
        bugHandler.handleIssue("over all performance is not good");
    }
}
