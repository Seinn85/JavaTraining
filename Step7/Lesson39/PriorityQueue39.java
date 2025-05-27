import java.util.PriorityQueue;

// Task class with name and priority
class Task implements Comparable<Task> {
    private String name;
    private int priority;

    // Constructor
    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    // Compare tasks by priority (lower number = higher priority)
    @Override
    public int compareTo(Task other) {
        return Integer.compare(this.priority, other.priority);
    }

    // To print task nicely
    @Override
    public String toString() {
        return "Task(name: " + name + ", priority: " + priority + ")";
    }
}

public class PriorityQueue39 {
    public static void main(String[] args) {
        // Create PriorityQueue of Task
        PriorityQueue<Task> taskQueue = new PriorityQueue<>();

        // Add tasks to the queue
        taskQueue.add(new Task("レポート作成", 3));       // Report Writing
        taskQueue.add(new Task("緊急バグ修正", 1));     // Urgent Bug Fix
        taskQueue.add(new Task("メールチェック", 5));     // Mail Check
        taskQueue.add(new Task("コードレビュー", 2));     // Code Review

        // Poll tasks from the queue until it's empty
        System.out.println("優先度順にタスクを取り出します:");
        while (!taskQueue.isEmpty()) {
            Task task = taskQueue.poll(); // Get and remove the task with the highest priority
            System.out.println(task.getName() + " (優先度: " + task.getPriority() + ")");
        }
    }
}