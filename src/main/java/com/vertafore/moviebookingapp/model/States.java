package com.vertafore.moviebookingapp.model;

import javax.persistence.*;

@Entity
@Table(name = "States")
public class States {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "state_id")
    private Integer stateId;

    @Column(name = "state")
    private String state;

    public Integer getStateId() {
        return stateId;
    }

    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
