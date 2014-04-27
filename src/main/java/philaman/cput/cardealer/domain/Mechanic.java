/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package philaman.cput.cardealer.domain;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author phila
 */
@Embeddable
public class Mechanic implements Serializable {

    private String speciality;
    private String ratings;

    private Mechanic() {
    }

    private Mechanic(Builder build) {
        this.speciality = build.speciality;
        this.ratings = build.ratings;
    }

    public static class Builder {

        private String speciality;
        private String ratings;

        public Builder(String speciality) {
            this.speciality = speciality;
        }

        public Builder ratings(String value) {
            ratings = value;
            return this;
        }

        public Builder mechanic(Mechanic mechanic) {
            this.speciality = mechanic.getSpeciality();
            this.ratings = mechanic.getRatings();
            return this;
        }

        public Mechanic build() {
            return new Mechanic(this);
        }

    }

    public String getSpeciality() {
        return speciality;
    }

    public String getRatings() {
        return ratings;
    }    
}
