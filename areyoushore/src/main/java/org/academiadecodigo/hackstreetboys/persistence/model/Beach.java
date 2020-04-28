package org.academiadecodigo.hackstreetboys.persistence.model;

import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "beach")
public class Beach {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String beachName;
    private String location;
    private CapacityEvaluator capacityEvaluator;


    @UpdateTimestamp
    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBeachName() {
        return beachName;
    }

    public void setBeachName(String beachName) {
        this.beachName = beachName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public CapacityEvaluator getCapacityEvaluator() {
        return capacityEvaluator;
    }

    public void setCapacityEvaluator(CapacityEvaluator capacityEvaluator) {
        this.capacityEvaluator = capacityEvaluator;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
