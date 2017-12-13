package chapters.chapter4.run;

import chapters.chapter4.controller.ApplianceFinder;
import chapters.chapter4.controller.WattConsumptionCalculator;
import chapters.chapter4.model.*;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {

        ElectricalAppliance desktopComputer = new DesktopComputer();
        ElectricalAppliance dishwasher = new Dishwasher();
        ElectricalAppliance freezer = new Freezer();
        ElectricalAppliance laptop = new Laptop();
        ElectricalAppliance printer = new Printer();
        ElectricalAppliance tv = new TV();

        List<ElectricalAppliance> electricalAppliances = new ArrayList<>();
        electricalAppliances.add(desktopComputer);
        electricalAppliances.add(dishwasher);
        electricalAppliances.add(freezer);
        electricalAppliances.add(laptop);
        electricalAppliances.add(tv);
        electricalAppliances.add(printer);

        desktopComputer.switchOn();
        printer.switchOn();
        freezer.switchOn();

        List<ElectricalAppliance> switchedElectricalAppliances = new ArrayList<>();
        switchedElectricalAppliances.add(desktopComputer);
        switchedElectricalAppliances.add(printer);
        switchedElectricalAppliances.add(freezer);

        WattConsumptionCalculator wattConsumptionCalculator = new WattConsumptionCalculator();
        wattConsumptionCalculator.setElectricalAppliances(electricalAppliances);
        wattConsumptionCalculator.setSwitchedElectricalAppliances(switchedElectricalAppliances);

        System.out.println("All electrical appliances-> " + wattConsumptionCalculator.getElectricalAppliances());
        System.out.println("Switched electrical appliances-> " + wattConsumptionCalculator.getSwitchedElectricalAppliances());

        System.out.println("Fined 600W appliances-> " + ApplianceFinder.findApplianceByPowerConsumption(600,wattConsumptionCalculator));
    }
}
