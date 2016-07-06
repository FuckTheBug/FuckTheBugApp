package com.fuckthebug.entity;

public class Watcher {
    private int watcherId;
    private Issue issueId;
    private User userId;

    public Watcher() {
    }

    public Watcher(int watcherId, Issue issueId, User userId) {
        this.watcherId = watcherId;
        this.issueId = issueId;
        this.userId = userId;
    }

    public int getWatcherId() {
        return watcherId;
    }

    public void setWatcherId(int watcherId) {
        this.watcherId = watcherId;
    }

    public Issue getIssueId() {
        return issueId;
    }

    public void setIssueId(Issue issueId) {
        this.issueId = issueId;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Watcher{" +
                "watcherId=" + watcherId +
                ", issueId=" + issueId +
                ", userId=" + userId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Watcher)) return false;

        Watcher watcher = (Watcher) o;

        if (watcherId != watcher.watcherId) return false;
        if (!issueId.equals(watcher.issueId)) return false;
        return userId.equals(watcher.userId);

    }

    @Override
    public int hashCode() {
        int result = watcherId;
        result = 31 * result + issueId.hashCode();
        result = 31 * result + userId.hashCode();
        return result;
    }
}
