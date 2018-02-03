/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mormonTrail.model;

import java.io.Serializable;

/**
 *
 * @author saria
 */
public class HotelScene extends Scene implements Serializable {
    
    //class instance variables
    private int availableCharacters;
    private int locationDistance;
    
    public HotelScene() {
    }

    public int getAvailableCharacters() {
        return availableCharacters;
    }

    public void setAvailableCharacters(int availableCharacters) {
        this.availableCharacters = availableCharacters;
    }

    public int getLocationDistance() {
        return locationDistance;
    }

    public void setLocationDistance(int locationDistance) {
        this.locationDistance = locationDistance;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.availableCharacters;
        hash = 41 * hash + this.locationDistance;
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
        final HotelScene other = (HotelScene) obj;
        if (this.availableCharacters != other.availableCharacters) {
            return false;
        }
        if (this.locationDistance != other.locationDistance) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "HotelScene{" + "availableCharacters=" + availableCharacters + ", locationDistance=" + locationDistance + '}';
    }
    
}
