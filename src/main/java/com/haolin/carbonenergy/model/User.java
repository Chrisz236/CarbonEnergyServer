package com.haolin.carbonenergy.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class User {
    @Id
    private String id;

    private int energy;

    private int treesPlanted;

    public User(String id, int energy, int treesPlanted) {
        this.id = id;
        this.energy = energy;
        this.treesPlanted = treesPlanted;
    }

    public String getId() {
        return id;
    }

    public int getEnergy() {
        return energy;
    }

    public int getTreesPlanted() {
        return treesPlanted;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }
}
