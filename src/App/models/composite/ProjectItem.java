package App.models.composite;

/**
 * Component interface in the GoF Composite pattern.
 * Defines the common operations for both leaf items (Task) and composite items (Project).
 */
public interface ProjectItem {

    /**
     * Returns the title or name of the project item.
     * @return the title
     */
    String getTitle();

    /**
     * Returns the duration of the item in hours.
     * For a leaf (Task), returns its individual duration.
     * For a composite (Project), computes the sum recursively across all children.
     * @return the duration in hours
     */
    int getDuration();

    /**
     * Returns the completion progress percentage (0.0 to 100.0).
     * For a leaf (Task), returns its individual progress.
     * For a composite (Project), computes the average progress across all children.
     * @return the progress percentage
     */
    double getProgress();

    /**
     * Prints the hierarchical structure with indentation for tree visualization.
     * @param indent the indentation prefix string
     */
    void print(String indent);
}
