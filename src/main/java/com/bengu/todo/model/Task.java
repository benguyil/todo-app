package main.java.com.bengu.todo.model;

import java.time.LocalDate;

public class Task {
    private String title;
    private boolean status;
    private LocalDate dueDate;
    private String note;

    public Task(){

    }

    public Task(String title, boolean status, LocalDate dueDate, String note) {
        this.title = title;
        this.status = status;
        this.dueDate = dueDate;
        this.note = note;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", status=" + status +
                ", dueDate=" + dueDate +
                ", note='" + note + '\'' +
                '}';
    }
}
