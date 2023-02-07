package com.alex.behaviorpatterns.chainofresponsibility;

public class ProductManager extends IssueHandler {
    public ProductManager(IssueHandler issueHandler) {
        super(issueHandler);
    }

    public void handleIssue(String issueType) {
        if (issueType.contains("requirement")) {
            System.out.println("Issue '" + issueType + "' is being handled by the Product manager.");
        } else {
            super.handleIssue(issueType);
        }
    }
}
