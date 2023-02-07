package com.alex.behaviorpatterns.chainofresponsibility;

public class SeniorDeveloper extends IssueHandler {
    public SeniorDeveloper(IssueHandler issueHandler) {
        super(issueHandler);
    }

    public void handleIssue(String issueType) {
        if (issueType.contains("performance")) {
            System.out.println("Issue '" + issueType + "' is being handled by the Senior developer.");
        } else {
            super.handleIssue(issueType);
        }
    }

}
