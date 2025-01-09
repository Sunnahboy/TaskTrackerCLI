package projoetcs;

import java.time.LocalDateTime;

public class Tasks {


    public class Task {
        private int id;
        private String description;
        private String status; // todo, in-progress, done
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;

        // Constructor, Getters, and Setters
        public Task(int id, String description) {
            this.id = id;
            this.description = description;
            this.status = "todo";
            this.createdAt = LocalDateTime.now();
            this.updatedAt = LocalDateTime.now();
        }

        // Update status
        public void setStatus(String status) {
            this.status = status;
            this.updatedAt = LocalDateTime.now();
        }

        @Override
        public String toString() {
            return "Task [id=" + id + ", description=" + description +
                    ", status=" + status + ", createdAt=" + createdAt +
                    ", updatedAt=" + updatedAt + "]";
        }
    }

}
