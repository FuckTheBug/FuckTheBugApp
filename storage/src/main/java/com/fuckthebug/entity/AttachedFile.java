package com.fuckthebug.entity;

public class AttachedFile {
    private int fileId;
    private Issue issueId;
    private String filePath;
    private String name;

    public AttachedFile() {
    }

    public AttachedFile(int fileId, Issue issueId, String filePath, String name) {
        this.fileId = fileId;
        this.issueId = issueId;
        this.filePath = filePath;
        this.name = name;
    }

    public int getFileId() {
        return fileId;
    }

    public void setFileId(int fileId) {
        this.fileId = fileId;
    }

    public Issue getIssueId() {
        return issueId;
    }

    public void setIssueId(Issue issueId) {
        this.issueId = issueId;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AttachedFile{" +
                "fileId=" + fileId +
                ", issueId=" + issueId +
                ", filePath='" + filePath + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AttachedFile)) return false;

        AttachedFile that = (AttachedFile) o;

        if (fileId != that.fileId) return false;
        if (!issueId.equals(that.issueId)) return false;
        if (!filePath.equals(that.filePath)) return false;
        return name.equals(that.name);

    }

    @Override
    public int hashCode() {
        int result = fileId;
        result = 31 * result + issueId.hashCode();
        result = 31 * result + filePath.hashCode();
        result = 31 * result + name.hashCode();
        return result;
    }
}
