package App.dao.entities;

public class Project {
    private String projectName;
    private String startDate;
    private String endDate;

    public Project() {
    }

    public Project(String projectName, String startDate, String endDate) {
        this.projectName = projectName;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getProjectName() { return projectName; }
    public void setProjectName(String projectName) { this.projectName = projectName; }

    public String getProjectStartDate() { return startDate; }
    public void setProjectStartDate(String startDate) { this.startDate = startDate; }

    public String getProjectEndDate() { return endDate; }
    public void setProjectEndDate(String endDate) { this.endDate = endDate; }

    public String getStartDate() { return startDate; }
    public void setStartDate(String startDate) { this.startDate = startDate; }

    public String getEndDate() { return endDate; }
    public void setEndDate(String endDate) { this.endDate = endDate; }

    @Override
    public String toString() {
        return projectName != null ? projectName : "";
    }
}