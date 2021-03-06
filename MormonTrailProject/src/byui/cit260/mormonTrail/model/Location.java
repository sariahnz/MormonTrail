/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mormonTrail.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author alyssahundley
 */
public class Location implements Serializable{
    
    private String name;
    private int type;
    private int locationDistance;
    private char symbol;
    String description;

    public Location() {
    }
    
    public Location(String name, int type, int locationDistance, char symbol, String description) {
        this.name = name;
        this.type = type;
        this.locationDistance = locationDistance;
        this.symbol = symbol;
        this.description = description;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getLocationDistance() {
        return locationDistance;
    }

    public void setLocationDistance(int locationDistance) {
        this.locationDistance = locationDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.type);
        hash = 89 * hash + this.locationDistance;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Location other = (Location) obj;
        if (this.locationDistance != other.locationDistance) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "name=" + name + ", type=" + type + ", locationDistance=" + locationDistance + ", symbol=" + symbol + ", description=" + description + '}';
    }

    

    
}