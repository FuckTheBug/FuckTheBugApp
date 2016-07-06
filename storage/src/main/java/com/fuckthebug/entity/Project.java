package com.fuckthebug.entity;

public class Project {
    private int projectId;
    private User createdBy;
    private String fullName;
    private String shortName;
    private String avatarPath;
    private String projectType;

    public Project() {
    }

    public Project(int projectId, User createdBy, String fullName, String shortName, String avatarPath, String projectType) {
        this.projectId = projectId;
        this.createdBy = createdBy;
        this.fullName = fullName;
        this.shortName = shortName;
        this.avatarPath = avatarPath;
        this.projectType = projectType;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getAvatarPath() {
        return avatarPath;
    }

    public void setAvatarPath(String avatarPath) {
        this.avatarPath = avatarPath;
    }

    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectId=" + projectId +
                ", createdBy=" + createdBy +
                ", fullName='" + fullName + '\'' +
                ", shortName='" + shortName + '\'' +
                ", avatarPath='" + avatarPath + '\'' +
                ", projectType='" + projectType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Project)) return false;

        Project project = (Project) o;

        if (getProjectId() != project.getProjectId()) return false;
        if (!getCreatedBy().equals(project.getCreatedBy())) return false;
        if (!getFullName().equals(project.getFullName())) return false;
        if (!getShortName().equals(project.getShortName())) return false;
        if (getAvatarPath() != null ? !getAvatarPath().equals(project.getAvatarPath()) : project.getAvatarPath() != null)
            return false;
        return getProjectType().equals(project.getProjectType());

    }

    @Override
    public int hashCode() {
        int result = getProjectId();
        result = 31 * result + getCreatedBy().hashCode();
        result = 31 * result + getFullName().hashCode();
        result = 31 * result + getShortName().hashCode();
        result = 31 * result + (getAvatarPath() != null ? getAvatarPath().hashCode() : 0);
        result = 31 * result + getProjectType().hashCode();
        return result;
    }
}
