package App.dao.entities;

import javafx.beans.property.SimpleStringProperty;

/**
 * Entity representing a project task.
 * Implements the GoF Builder pattern to eliminate the telescoping constructor smell.
 */
public class Task {

    private final SimpleStringProperty taskName;
    private final SimpleStringProperty taskTime;
    private final SimpleStringProperty taskStartDate;
    private final SimpleStringProperty taskEndDate;
    private final SimpleStringProperty taskProgress;
    private final SimpleStringProperty taskColor;
    private final SimpleStringProperty taskDependency;
    private final SimpleStringProperty taskAssigned;

    private Task(Builder builder) {
        this.taskName = new SimpleStringProperty(builder.taskName);
        this.taskTime = new SimpleStringProperty(builder.taskTime);
        this.taskStartDate = new SimpleStringProperty(builder.taskStartDate);
        this.taskEndDate = new SimpleStringProperty(builder.taskEndDate);
        this.taskProgress = new SimpleStringProperty(builder.taskProgress);
        this.taskColor = new SimpleStringProperty(builder.taskColor);
        this.taskDependency = new SimpleStringProperty(builder.taskDependency);
        this.taskAssigned = new SimpleStringProperty(builder.taskAssigned);
    }

    public String getTaskName() {
        return taskName.get();
    }

    public String getTaskTime() {
        return taskTime.get();
    }

    public String getTaskStartDate() {
        return taskStartDate.get();
    }

    public String getTaskEndDate() {
        return taskEndDate.get();
    }

    public String getTaskProgress() {
        return taskProgress.get();
    }

    public void setTaskProgress(String taskProgress) {
        this.taskProgress.set(taskProgress);
    }

    public String getTaskColor() {
        return taskColor.get();
    }

    public String getTaskDependency() {
        return taskDependency.get();
    }

    public String getTaskAssigned() {
        return taskAssigned.get();
    }

    public String getTaskAssinged() {
        return taskAssigned.get();
    }

    public static class Builder {
        private String taskName;
        private String taskTime = "0";
        private String taskStartDate = "";
        private String taskEndDate = "";
        private String taskProgress = "0";
        private String taskColor = "#000000";
        private String taskDependency = "";
        private String taskAssigned = "";

        public Builder(String taskName) {
            this.taskName = taskName;
        }

        public Builder taskTime(String taskTime) {
            this.taskTime = taskTime;
            return this;
        }

        public Builder taskStartDate(String taskStartDate) {
            this.taskStartDate = taskStartDate;
            return this;
        }

        public Builder taskEndDate(String taskEndDate) {
            this.taskEndDate = taskEndDate;
            return this;
        }

        public Builder taskProgress(String taskProgress) {
            this.taskProgress = taskProgress;
            return this;
        }

        public Builder taskColor(String taskColor) {
            this.taskColor = taskColor;
            return this;
        }

        public Builder taskDependency(String taskDependency) {
            this.taskDependency = taskDependency;
            return this;
        }

        public Builder taskAssigned(String taskAssigned) {
            this.taskAssigned = taskAssigned;
            return this;
        }

        public Task build() {
            if (taskName == null || taskName.trim().isEmpty()) {
                throw new IllegalArgumentException("Task name cannot be empty.");
            }
            return new Task(this);
        }
    }
}
