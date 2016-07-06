package com.fuckthebug.entity;

import com.fuckthebug.entity.enumeration.IssuePriority;
import com.fuckthebug.entity.enumeration.IssueResolution;
import com.fuckthebug.entity.enumeration.IssueStatus;
import com.fuckthebug.entity.enumeration.IssueType;

import java.sql.Date;
import java.sql.Timestamp;

public class Issue {
    private int issueId;
    private Project projectId;
    private String title;
    private String name;
    private String description;
    private User createdBy;
    private User assignedTo;
    private Timestamp updatedTime;
    private Timestamp createdTime;
    private Date dueDate;
    private IssuePriority priority;
    private IssueStatus status;
    private IssueType type;
    private String rootCause;
    private IssueResolution resolution;
    private String foundInBuild;
    private String labels;

    public Issue() {
    }

    public Issue(int issueId, Project projectId, String title, String name, String description, User createdBy, User assignedTo, Timestamp updatedTime, Timestamp createdTime, Date dueDate, IssuePriority priority, IssueStatus status, IssueType type, String rootCause, IssueResolution resolution, String foundInBuild, String labels) {
        this.issueId = issueId;
        this.projectId = projectId;
        this.title = title;
        this.name = name;
        this.description = description;
        this.createdBy = createdBy;
        this.assignedTo = assignedTo;
        this.updatedTime = updatedTime;
        this.createdTime = createdTime;
        this.dueDate = dueDate;
        this.priority = priority;
        this.status = status;
        this.type = type;
        this.rootCause = rootCause;
        this.resolution = resolution;
        this.foundInBuild = foundInBuild;
        this.labels = labels;
    }

    public int getIssueId() {
        return issueId;
    }

    public void setIssueId(int issueId) {
        this.issueId = issueId;
    }

    public Project getProjectId() {
        return projectId;
    }

    public void setProjectId(Project projectId) {
        this.projectId = projectId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }

    public User getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(User assignedTo) {
        this.assignedTo = assignedTo;
    }

    public Timestamp getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Timestamp updatedTime) {
        this.updatedTime = updatedTime;
    }

    public Timestamp getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Timestamp createdTime) {
        this.createdTime = createdTime;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public IssuePriority getPriority() {
        return priority;
    }

    public void setPriority(IssuePriority priority) {
        this.priority = priority;
    }

    public IssueStatus getStatus() {
        return status;
    }

    public void setStatus(IssueStatus status) {
        this.status = status;
    }

    public IssueType getType() {
        return type;
    }

    public void setType(IssueType type) {
        this.type = type;
    }

    public String getRootCause() {
        return rootCause;
    }

    public void setRootCause(String rootCause) {
        this.rootCause = rootCause;
    }

    public IssueResolution getResolution() {
        return resolution;
    }

    public void setResolution(IssueResolution resolution) {
        this.resolution = resolution;
    }

    public String getFoundInBuild() {
        return foundInBuild;
    }

    public void setFoundInBuild(String foundInBuild) {
        this.foundInBuild = foundInBuild;
    }

    public String getLabels() {
        return labels;
    }

    public void setLabels(String labels) {
        this.labels = labels;
    }

    @Override
    public String toString() {
        return "Issue{" +
                "issueId=" + issueId +
                ", projectId=" + projectId +
                ", title='" + title + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", createdBy=" + createdBy +
                ", assignedTo=" + assignedTo +
                ", updatedTime=" + updatedTime +
                ", createdTime=" + createdTime +
                ", dueDate=" + dueDate +
                ", priority=" + priority +
                ", status=" + status +
                ", type=" + type +
                ", rootCause='" + rootCause + '\'' +
                ", resolution=" + resolution +
                ", foundInBuild='" + foundInBuild + '\'' +
                ", labels='" + labels + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Issue)) return false;

        Issue issue = (Issue) o;

        if (getIssueId() != issue.getIssueId()) return false;
        if (!getProjectId().equals(issue.getProjectId())) return false;
        if (!getTitle().equals(issue.getTitle())) return false;
        if (!getName().equals(issue.getName())) return false;
        if (getDescription() != null ? !getDescription().equals(issue.getDescription()) : issue.getDescription() != null)
            return false;
        if (getCreatedBy() != null ? !getCreatedBy().equals(issue.getCreatedBy()) : issue.getCreatedBy() != null)
            return false;
        if (getAssignedTo() != null ? !getAssignedTo().equals(issue.getAssignedTo()) : issue.getAssignedTo() != null)
            return false;
        if (!getUpdatedTime().equals(issue.getUpdatedTime())) return false;
        if (!getCreatedTime().equals(issue.getCreatedTime())) return false;
        if (getDueDate() != null ? !getDueDate().equals(issue.getDueDate()) : issue.getDueDate() != null) return false;
        if (getPriority() != issue.getPriority()) return false;
        if (getStatus() != issue.getStatus()) return false;
        if (getType() != issue.getType()) return false;
        if (getRootCause() != null ? !getRootCause().equals(issue.getRootCause()) : issue.getRootCause() != null)
            return false;
        if (getResolution() != issue.getResolution()) return false;
        if (getFoundInBuild() != null ? !getFoundInBuild().equals(issue.getFoundInBuild()) : issue.getFoundInBuild() != null)
            return false;
        return getLabels() != null ? getLabels().equals(issue.getLabels()) : issue.getLabels() == null;

    }

    @Override
    public int hashCode() {
        int result = getIssueId();
        result = 31 * result + getProjectId().hashCode();
        result = 31 * result + getTitle().hashCode();
        result = 31 * result + getName().hashCode();
        result = 31 * result + (getDescription() != null ? getDescription().hashCode() : 0);
        result = 31 * result + (getCreatedBy() != null ? getCreatedBy().hashCode() : 0);
        result = 31 * result + (getAssignedTo() != null ? getAssignedTo().hashCode() : 0);
        result = 31 * result + getUpdatedTime().hashCode();
        result = 31 * result + getCreatedTime().hashCode();
        result = 31 * result + (getDueDate() != null ? getDueDate().hashCode() : 0);
        result = 31 * result + (getPriority() != null ? getPriority().hashCode() : 0);
        result = 31 * result + getStatus().hashCode();
        result = 31 * result + (getType() != null ? getType().hashCode() : 0);
        result = 31 * result + (getRootCause() != null ? getRootCause().hashCode() : 0);
        result = 31 * result + (getResolution() != null ? getResolution().hashCode() : 0);
        result = 31 * result + (getFoundInBuild() != null ? getFoundInBuild().hashCode() : 0);
        result = 31 * result + (getLabels() != null ? getLabels().hashCode() : 0);
        return result;
    }
}
