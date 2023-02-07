package com.alex.behaviorpatterns.chainofresponsibility;

public abstract class IssueHandler {

    private final IssueHandler next;

    public IssueHandler(IssueHandler next) {
        this.next = next;
    }

    public void handleIssue(String issueType) {
        if (next != null) {
            next.handleIssue(issueType);
        }
    }
}
