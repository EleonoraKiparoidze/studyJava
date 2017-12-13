package chapters.chapter4.controller;

import chapters.chapter4.model.ElectricalAppliance;

import java.util.ArrayList;
import java.util.List;

public class ApplianceFinder {

    public static List<ElectricalAppliance> findApplianceByPowerConsumption(double powerConsumption, WattConsumptionCalculator wattConsumptionCalculator) {
        List<ElectricalAppliance> result = new ArrayList<>();
        for (ElectricalAppliance appliance : wattConsumptionCalculator.getElectricalAppliances()) {
            if (appliance.getPowerConsumption() == powerConsumption)
                result.add(appliance);
        }
        return result;
    }
}
