package dimulski.vueprojectapi.entities;

import dimulski.vueprojectapi.entities.contracts.TitledEntity;

import javax.persistence.*;

@Entity
@Table(name = "todos")
public class Todo extends TitledEntity {

    @Column(name = "completed", nullable = false)
    private Boolean completed;

    public Todo() {
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }
}
