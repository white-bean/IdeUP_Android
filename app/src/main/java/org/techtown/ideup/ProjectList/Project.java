package org.techtown.ideup.ProjectList;

public class Project {
    private Long id; // 프로젝트 아이디

    private String teamName; // 창업팀 이름

    private String projectName; // 프로젝트명

    private String projectContent; // 프로젝트 내용

    public Project(String teamName, String projectName, String projectContent){
        this.teamName = teamName;
        this.projectName = projectName;
        this.projectContent = projectContent;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectContent() {
        return projectContent;
    }

    public void setProjectContent(String projectContent) {
        this.projectContent = projectContent;
    }
}
