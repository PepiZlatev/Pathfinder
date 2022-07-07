package bg.softuni.pathfinder.model.entity;

import bg.softuni.pathfinder.model.enums.RoleEnum;

import javax.persistence.*;

@Entity
@Table(name = "roles")
public class RoleEntity extends BaseEntity{

    @Column(unique = true)
    @Enumerated(EnumType.STRING)
    private RoleEnum name;

    public RoleEntity() {
    }

    public RoleEnum getName() {
        return name;
    }

    public RoleEntity setName(RoleEnum name) {
        this.name = name;
        return this;
    }
}
