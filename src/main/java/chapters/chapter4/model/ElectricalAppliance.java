package chapters.chapter4.model;

import java.io.Serializable;

public abstract class ElectricalAppliance implements Serializable, Comparable<ElectricalAppliance> {

    private String name;
    private boolean switched = false;
    private double powerConsumption;

    public ElectricalAppliance() {
    }

    public ElectricalAppliance(String name, double powerConsumption) {
        this.name = name;
        this.powerConsumption = powerConsumption;
    }

    public ElectricalAppliance(String name, boolean switched, double powerConsumption) {
        this.name = name;
        this.switched = switched;
        this.powerConsumption = powerConsumption;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSwitched() {
        return switched;
    }

    public void setSwitched(boolean switched) {
        this.switched = switched;
    }

    public void switchOn() {
        this.switched = true;
    }

    public void switchOff() {
        this.switched = false;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    @Override
    public int compareTo(ElectricalAppliance o) {
        return Double.compare(getPowerConsumption(), o.getPowerConsumption());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ElectricalAppliance that = (ElectricalAppliance) o;

        return Double.compare(that.powerConsumption, powerConsumption) == 0 && name.equals(that.name);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        temp = Double.doubleToLongBits(powerConsumption);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "ElectricalAppliance{" +
                "name='" + name + '\'' +
                ", switched=" + switched +
                ", powerConsumption=" + powerConsumption + "W" +
                '}';
    }
}
