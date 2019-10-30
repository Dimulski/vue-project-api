package dimulski.vueprojectapi.entities.contracts;

import javax.persistence.MappedSuperclass;
import javax.persistence.Column;

@MappedSuperclass
public abstract class TitledEntity extends BaseEntity {

    @Column(name = "title", nullable = false)
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
