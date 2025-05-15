package creational.abstractFactory;

import creational.abstractFactory.factories.EconomyFactory;
import creational.abstractFactory.factories.LuxuryFactory;

public class MainAbstractFactory {

    public static CarFactory getCarFactory(String carType) {

        if (carType.equals("economy")) {
            return new EconomyFactory();
        } else {
            return new LuxuryFactory();
        }
    }


    public static void getCarFactory2(String carType, String carModel ) {

        if (carType.equals("economy")) {
            CarFactory carFactoryEconomy =  new EconomyFactory();

            if(carModel.equals("sedan")) {
                carFactoryEconomy.createSedan().drive();
            }
            else
            {
                carFactoryEconomy.createSUV().drive();
            }
        } else {
            CarFactory carFactoryLuxury = new  LuxuryFactory();

            if(carModel.equals("sedan")) {
                carFactoryLuxury.createSedan().drive();
            }
            else
            {
                carFactoryLuxury.createSUV().drive();
            }
        }
    }


    public static void main(String[] args) {

       //SUV LUXURY

        getCarFactory2("luxury","suv");


        // sedan economic

        getCarFactory2("economy","sedan");



    }
}
