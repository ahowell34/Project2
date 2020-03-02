package com.company.Howell;
public class Task {
    private String name;
    private String description;
    private int priority;



    Task(String name, String description, int priority) {
        this.name = name;
        this.description = description;
        this.priority = priority;
    }

    void setName(String name) {
        this.name = name;
    }

    void setDescription(String description) {
        this.description = description;
    }

    int getPriority() {
        return priority;
    }

    void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", priority=" + priority +
                '}';
    }
}
