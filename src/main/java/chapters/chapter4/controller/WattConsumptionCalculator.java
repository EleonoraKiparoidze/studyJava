package chapters.chapter4.controller;

import chapters.chapter4.model.ElectricalAppliance;

import java.util.Collections;
import java.util.List;

public class WattConsumptionCalculator {

    private List<ElectricalAppliance> electricalAppliances;
    private List<ElectricalAppliance> switchedElectricalAppliances;

    public List<ElectricalAppliance> getElectricalAppliances() {
        return electricalAppliances;
    }

    public void setElectricalAppliances(List<ElectricalAppliance> electricalAppliances) {
        this.electricalAppliances = electricalAppliances;
    }

    public List<ElectricalAppliance> getSwitchedElectricalAppliances() {
        return switchedElectricalAppliances;
    }

    public void setSwitchedElectricalAppliances(List<ElectricalAppliance> switchedElectricalAppliances) {
        this.switchedElectricalAppliances = switchedElectricalAppliances;
    }

    public static double totalPowerConsumption(List<ElectricalAppliance> switchedElectricalAppliances) {
        double powerConsumption = 0;
        for (ElectricalAppliance electricalAppliance : switchedElectricalAppliances) {
            powerConsumption += electricalAppliance.getPowerConsumption();
        }
        return powerConsumption;
    }

    public static void sortByAppliancesPower(List<ElectricalAppliance> electricalAppliances){
        Collections.sort(electricalAppliances);
    }
}
