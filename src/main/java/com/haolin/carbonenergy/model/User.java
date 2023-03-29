package com.haolin.carbonenergy.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class User {
    @Id
    private String id;

    private int energy;
    private int trees_planted;

    public User(String id, int energy, int trees_planted) {
        this.id = id;
        this.energy = energy;
        this.trees_planted = trees_planted;
    }

    public String getId() {
        return id;
    }

    public int getEnergy() {
        return energy;
    }

    public int getTreesPlanted() {
        return trees_planted;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }
}
