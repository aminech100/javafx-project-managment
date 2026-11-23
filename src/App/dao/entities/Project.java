package App.dao.entities;

import App.models.composite.ProjectItem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Entity representing a project.
 * Acts as a Composite in the GoF Composite pattern.
 * Manages child ProjectItems (Leaves or sub-Composites) and calculates metrics recursively.
 */
public class Project implements ProjectItem {
    private String projectName;
    private String startDate;
    private String endDate;

    private List<ProjectItem> items = new ArrayList<>();

    public Project() {
    }

    public Project(String projectName, String startDate, String endDate) {
        this.projectName = projectName;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    // --- Composite Operations (Children Management) ---

    public void add(ProjectItem item) {
        if (item != null) {
            items.add(item);
        }
    }

    public void remove(ProjectItem item) {
        items.remove(item);
    }

    public List<ProjectItem> getItems() {
        return Collections.unmodifiableList(items);
    }

    // --- ProjectItem (Composite implementation) ---

    @Override
    public String getTitle() {
        return getProjectName();
    }

    @Override
    public int getDuration() {
        int totalDuration = 0;
        for (ProjectItem item : items) {
            totalDuration += item.getDuration();
        }
        return totalDuration;
    }

    @Override
    public double getProgress() {
        if (items.isEmpty()) {
            return 0.0;
        }
        double totalProgress = 0.0;
        for (ProjectItem item : items) {
            totalProgress += item.getProgress();
        }
        return totalProgress / items.size();
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "+ [Project] " + getTitle() + " (Total Duration: " + getDuration() + "h, Overall Progress: " + String.format(java.util.Locale.US, "%.1f", getProgress()) + "%)");
        for (ProjectItem item : items) {
            item.print(indent + "    ");
        }
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
