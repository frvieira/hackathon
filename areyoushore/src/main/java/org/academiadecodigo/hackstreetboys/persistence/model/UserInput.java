package org.academiadecodigo.hackstreetboys.persistence.model;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "capacityEvaluator")
public class UserInput {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private User user;

    @ManyToOne
    private Beach beach;

    private CapacityEvaluator capacityEvaluator;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Beach getBeach() {
        return beach;
    }

    public void setBeach(Beach beach) {
        this.beach = beach;
    }

    public CapacityEvaluator getCapacityEvaluator() {
        return capacityEvaluator;
    }

    public void setCapacityEvaluator(CapacityEvaluator capacityEvaluator) {
        this.capacityEvaluator = capacityEvaluator;
    }
}
