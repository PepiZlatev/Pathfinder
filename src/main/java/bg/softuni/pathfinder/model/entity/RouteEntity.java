package bg.softuni.pathfinder.model.entity;

import bg.softuni.pathfinder.model.enums.LevelEnum;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "routes")
public class RouteEntity extends BaseEntity {

    @Lob
    @Column(name = "gpx_coordinates")
    private String gpxCoordinates;

    @Enumerated(EnumType.STRING)
    @Column(name = "level_enum")
    private LevelEnum level;

    private String name;

    @Column(columnDefinition = "text")
    private String description;

    @ManyToOne
    private UserEntity author;

    @Column(name = "video_url")
    private String videoURL;

    @OneToMany(targetEntity = CommentsEntity.class, mappedBy = "route", cascade = CascadeType.ALL)
    private Set<CommentsEntity> comments;


    @OneToMany(mappedBy = "route", fetch = FetchType.EAGER)
    private Set<PictureEntity> pictures;

    @ManyToMany
    private Set<CategoriesEntity> categories;

    public RouteEntity() {
        this.comments = new HashSet<>();
        this.categories = new HashSet<>();
    }

    public String getGpxCoordinates() {
        return gpxCoordinates;
    }

    public RouteEntity setGpxCoordinates(String gpxCoordinates) {
        this.gpxCoordinates = gpxCoordinates;
        return this;
    }

    public LevelEnum getLevel() {
        return level;
    }

    public RouteEntity setLevel(LevelEnum level) {
        this.level = level;
        return this;
    }

    public String getName() {
        return name;
    }

    public RouteEntity setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public RouteEntity setDescription(String description) {
        this.description = description;
        return this;
    }

    public UserEntity getAuthor() {
        return author;
    }

    public RouteEntity setAuthor(UserEntity author) {
        this.author = author;
        return this;
    }

    public String getVideoURL() {
        return videoURL;
    }

    public RouteEntity setVideoURL(String videoURL) {
        this.videoURL = videoURL;
        return this;
    }

    public Set<CommentsEntity> getComments() {
        return comments;
    }

    public RouteEntity setComments(Set<CommentsEntity> comments) {
        this.comments = comments;
        return this;
    }

    public Set<PictureEntity> getPictures() {
        return pictures;
    }

    public RouteEntity setPictures(Set<PictureEntity> pictures) {
        this.pictures = pictures;
        return this;
    }

    public Set<CategoriesEntity> getCategories() {
        return categories;
    }

    public RouteEntity setCategories(Set<CategoriesEntity> categories) {
        this.categories = categories;
        return this;
    }
}
