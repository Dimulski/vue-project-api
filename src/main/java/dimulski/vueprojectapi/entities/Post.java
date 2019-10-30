package dimulski.vueprojectapi.entities;

import dimulski.vueprojectapi.entities.contracts.TitledEntity;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name = "posts")
public class Post extends TitledEntity {

    @Column(name = "user_id", nullable = false)
    private long userId;

    @Column(name = "body", nullable = false)
    private String body;

    public Post() {
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
