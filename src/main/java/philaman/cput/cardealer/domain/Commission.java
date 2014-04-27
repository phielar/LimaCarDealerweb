/*
 * To change this template, choose Tools | Templates
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
public class Commission implements Serializable {

    private double rate;
    private double carPrice;
    private double commission;

    private Commission() {
    }

    public Commission(Builder Build) {
        this.rate = Build.rate;
        this.carPrice = Build.carPrice;
        this.commission = Build.commission;
    }

    public static class Builder {

        private double rate;
        private double carPrice;
        private double commission;

        public Builder(double carPrice) {
            this.carPrice = carPrice;
        }

        public Builder rate(double value) {
            rate = value;
            return this;
        }

        public Builder commission(double value) {
            commission = value;
            return this;
        }

        public Commission build() {
            return new Commission(this);
        }

    }

    public double getRate() {
        return rate;
    }

    public double getCarPrice() {
        return carPrice;
    }

    public double getCommission() {
        return commission;
    }
}
