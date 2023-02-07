package com.alex.behaviorpatterns.chainofresponsibility;

public class HelpDesk extends IssueHandler {

    public HelpDesk(IssueHandler issueHandler) {
        super(issueHandler);
    }

    public void handleIssue(String issueType) {
        if (issueType.contains("general")) {
            System.out.println("Issue '" + issueType + "' is being handled by the Helpdesk.");
        } else {
            super.handleIssue(issueType);
        }
    }
}
