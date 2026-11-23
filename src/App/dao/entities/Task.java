package App.dao.entities;

public class Task {
    private String taskName;
    private String taskTime;
    private String taskStartDate;
    private String taskEndDate;
    private String taskProgress;
    private String taskColor;
    private String taskDependency;
    private String taskAssigned;

    private Task(Builder builder) {
        this.taskName = builder.taskName;
        this.taskTime = builder.taskTime;
        this.taskStartDate = builder.taskStartDate;
        this.taskEndDate = builder.taskEndDate;
        this.taskProgress = builder.taskProgress;
        this.taskColor = builder.taskColor;
        this.taskDependency = builder.taskDependency;
        this.taskAssigned = builder.taskAssigned;
    }

    public String getTaskName() { return taskName; }
    public String getTaskTime() { return taskTime; }
    public String getTaskStartDate() { return taskStartDate; }
    public String getTaskEndDate() { return taskEndDate; }
    public String getTaskProgress() { return taskProgress; }
    public String getTaskColor() { return taskColor; }
    public String getTaskDependency() { return taskDependency; }
    public String getTaskAssigned() { return taskAssigned; }
    public String getTaskAssinged() { return taskAssigned; }

    public void setTaskName(String taskName) { this.taskName = taskName; }
    public void setTaskTime(String taskTime) { this.taskTime = taskTime; }
    public void setTaskStartDate(String taskStartDate) { this.taskStartDate = taskStartDate; }
    public void setTaskEndDate(String taskEndDate) { this.taskEndDate = taskEndDate; }
    public void setTaskProgress(String taskProgress) { this.taskProgress = taskProgress; }
    public void setTaskColor(String taskColor) { this.taskColor = taskColor; }
    public void setTaskDependency(String taskDependency) { this.taskDependency = taskDependency; }
    public void setTaskAssigned(String taskAssigned) { this.taskAssigned = taskAssigned; }
    public void setTaskAssinged(String taskAssinged) { this.taskAssigned = taskAssinged; }

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
