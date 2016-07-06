package com.fuckthebug.entity;

import com.fuckthebug.entity.enumeration.LinkType;

public class Link {
    private int linkId;
    private LinkType type;
    private Issue issueId;
    private Issue linkedIssueId;

    public Link() {
    }

    public Link(int linkId, LinkType type, Issue issueId, Issue linkedIssueId) {
        this.linkId = linkId;
        this.type = type;
        this.issueId = issueId;
        this.linkedIssueId = linkedIssueId;
    }

    public int getLinkId() {
        return linkId;
    }

    public void setLinkId(int linkId) {
        this.linkId = linkId;
    }

    public LinkType getType() {
        return type;
    }

    public void setType(LinkType type) {
        this.type = type;
    }

    public Issue getIssueId() {
        return issueId;
    }

    public void setIssueId(Issue issueId) {
        this.issueId = issueId;
    }

    public Issue getLinkedIssueId() {
        return linkedIssueId;
    }

    public void setLinkedIssueId(Issue linkedIssueId) {
        this.linkedIssueId = linkedIssueId;
    }

    @Override
    public String toString() {
        return "Link{" +
                "linkId=" + linkId +
                ", type=" + type +
                ", issueId=" + issueId +
                ", linkedIssueId=" + linkedIssueId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Link)) return false;

        Link link = (Link) o;

        if (getLinkId() != link.getLinkId()) return false;
        if (getType() != link.getType()) return false;
        if (!getIssueId().equals(link.getIssueId())) return false;
        return getLinkedIssueId().equals(link.getLinkedIssueId());

    }

    @Override
    public int hashCode() {
        int result = getLinkId();
        result = 31 * result + getType().hashCode();
        result = 31 * result + getIssueId().hashCode();
        result = 31 * result + getLinkedIssueId().hashCode();
        return result;
    }
}
