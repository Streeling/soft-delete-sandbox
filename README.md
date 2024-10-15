# soft-delete-sandbox
Soft Delete Sandbox

public class Task {
private Long id;
private String name;
private TaskStatus status; // e.g., NEW, IN_PROGRESS, COMPLETED
private boolean isDeleted;

    // Getters, setters, and other properties
}

public void applyBulkStatusChange(List<Task> tasks, TaskStatus newStatus) {
tasks.stream()
.filter(task -> !task.isDeleted())
.forEach(task -> task.setStatus(newStatus));
}

public void restoreTask(Task task, TaskStatus statusWhenDeleted, TaskStatus currentProjectStatus) {
task.setDeleted(false); // Restore the task

    // Reapply the last bulk action if applicable
    if (!task.getStatus().equals(currentProjectStatus)) {
        task.setStatus(currentProjectStatus);
    }
}