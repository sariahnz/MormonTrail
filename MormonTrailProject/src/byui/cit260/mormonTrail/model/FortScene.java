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
public class FortScene extends Scene implements Serializable {

//class instance variables
private int locationDistance;

    public FortScene() {
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
        hash = 97 * hash + this.locationDistance;
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
        final FortScene other = (FortScene) obj;
        if (this.locationDistance != other.locationDistance) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "FortScene{" + "locationDistance=" + locationDistance + '}';
    }

}
