package com.fuckthebug.entity;

import java.sql.Timestamp;

public class Comment {
    private int commentId;
    private Issue issueId;
    private User userId;
    private String commentText;
    private Timestamp time;

    public Comment() {
    }

    public Comment(int commentId, Issue issueId, User userId, String commentText, Timestamp time) {
        this.commentId = commentId;
        this.issueId = issueId;
        this.userId = userId;
        this.commentText = commentText;
        this.time = time;
    }

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
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

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "commentId=" + commentId +
                ", issueId=" + issueId +
                ", userId=" + userId +
                ", commentText='" + commentText + '\'' +
                ", time=" + time +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Comment)) return false;

        Comment comment = (Comment) o;

        if (getCommentId() != comment.getCommentId()) return false;
        if (!getIssueId().equals(comment.getIssueId())) return false;
        if (!getUserId().equals(comment.getUserId())) return false;
        if (!getCommentText().equals(comment.getCommentText())) return false;
        return getTime().equals(comment.getTime());

    }

    @Override
    public int hashCode() {
        int result = getCommentId();
        result = 31 * result + getIssueId().hashCode();
        result = 31 * result + getUserId().hashCode();
        result = 31 * result + getCommentText().hashCode();
        result = 31 * result + getTime().hashCode();
        return result;
    }
}
