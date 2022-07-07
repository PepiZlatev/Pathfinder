package bg.softuni.pathfinder.model.entity;

import bg.softuni.pathfinder.model.enums.CategoryEnum;

import javax.persistence.*;

@Entity
@Table(name = "categories")
public class CategoriesEntity extends BaseEntity{

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, unique = true)
    private CategoryEnum name;

    @Column(columnDefinition = "text")
    private String description;

    public CategoriesEntity() {
    }

    public CategoryEnum getName() {
        return name;
    }

    public CategoriesEntity setName(CategoryEnum name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CategoriesEntity setDescription(String description) {
        this.description = description;
        return this;
    }
}
