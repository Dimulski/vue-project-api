package dimulski.vueprojectapi.entities;

import dimulski.vueprojectapi.entities.contracts.TitledEntity;

import javax.persistence.*;

@Entity
@Table(name = "tasks")
public class Task extends TitledEntity {

    @Column(name = "user_id", nullable = false)
    private long userId;

    @Column(name = "completed", nullable = false)
    private Boolean completed;

    public Task() {
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }
}
