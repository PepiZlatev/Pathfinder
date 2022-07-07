package bg.softuni.pathfinder.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "comments")
public class CommentsEntity extends BaseEntity{

    private boolean approved;

    private LocalDateTime created;

    @Column(columnDefinition = "text", nullable = false)
    private String textContent;

    @ManyToOne
    private UserEntity author;

    @ManyToOne
    private RouteEntity route;

    public CommentsEntity() {
    }

    public boolean isApproved() {
        return approved;
    }

    public CommentsEntity setApproved(boolean approved) {
        this.approved = approved;
        return this;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public CommentsEntity setCreated(LocalDateTime created) {
        this.created = created;
        return this;
    }

    public String getTextContent() {
        return textContent;
    }

    public CommentsEntity setTextContent(String textContent) {
        this.textContent = textContent;
        return this;
    }

    public UserEntity getAuthor() {
        return author;
    }

    public CommentsEntity setAuthor(UserEntity author) {
        this.author = author;
        return this;
    }

    public RouteEntity getRoute() {
        return route;
    }

    public CommentsEntity setRoute(RouteEntity route) {
        this.route = route;
        return this;
    }
}
