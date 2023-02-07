package com.alex.behaviorpatterns.chainofresponsibility;

public class BackendDeveloper extends IssueHandler {
    public BackendDeveloper(IssueHandler issueHandler) {
        super(issueHandler);
    }

    public void handleIssue(String issueType) {
        if (issueType.contains("backend")) {
            System.out.println("Issue '" + issueType + "' is being handled by the Backend developer.");
        } else {
            super.handleIssue(issueType);
        }
    }
}
