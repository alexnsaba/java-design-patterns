package com.alex.behaviorpatterns.chainofresponsibility;

public class FrontendDeveloper extends IssueHandler {
    public FrontendDeveloper(IssueHandler issueHandler) {
        super(issueHandler);
    }

    public void handleIssue(String issueType) {
        if (issueType.contains("frontend")) {
            System.out.println("Issue '" + issueType + "' is being handled by the Frontend developer.");
        } else {
            super.handleIssue(issueType);
        }
    }
}
