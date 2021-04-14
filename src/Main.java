import models.Car;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        String[] testData = {"C100_1-100", "C200_1-120-1200", "C300_1-120-30", "C400_1-80-20",
                "C100_2-50", "C200_2-40-1000", "C300_2-200-45", "C400_2-10-20", "C100_3-10",
                "C200_3-170-1100", "C300_3-150-29", "C400_3-100-28", "C100_1-300",
                "C200_1-100-750", "C300_1-32-15"};

        Map<Integer, String> typeCar = new HashMap<>() {{
            put(100, "легковой авто");
            put(200, "грузовой авто");
            put(300, "пассажирский транспорт");
            put(400, "тяжелая техника(краны)");
        }};
        Map<Integer, Double> costLiterFuel  = new HashMap<>() {{
            put(100, 46.10);
            put(200, 48.90);
            put(300, 47.50);
            put(400, 48.90);
        }};
        Map<Integer, Double> fuelConsumption   = new HashMap<>() {{
            put(100, 12.5);
            put(200, 12.);
            put(300, 11.5);
            put(400, 20.);
        }};

        ArrayList<Car> cars = new ArrayList<>();

        Double fullPrice = 0.;

        for (String item: testData) {
            item.split("_");
            Integer codeCar = Integer.parseInt(item.split("_")[0].split("C")[1]);
            Integer number = Integer.parseInt(item.split("_")[1].split("-")[0]);
            Integer mileage = Integer.parseInt(item.split("_")[1].split("-")[1]);
            Boolean additionallyExists = item.split("_")[1].split("-").length == 3;
            Car car;

            if(additionallyExists){
               Integer additionally = Integer.parseInt(item.split("_")[1].split("-")[2]);
                car = new Car(codeCar,number,mileage,additionally);
            }else{
                 car = new Car(codeCar,number,mileage);
            }
            cars.add(car);
        }


        for (Car item: cars) {
            fullPrice += item.getMileage() / 100 * fuelConsumption.get(item.getCodeCar()) * costLiterFuel.get(item.getCodeCar());
        }
        System.out.print("общая стоимость расходов на ГСМ: ");
        System.out.println(fullPrice);

        Double maxValue = 0.;
        Double minValue = 0.;
        String maxType = "";
        String minType = "";
        Integer index = 0;

        for (Integer item: typeCar.keySet()) {
            System.out.print("стоимость расходов на ");
            System.out.print(typeCar.get(item));
            System.out.print(": ");
            Double price = 0.;

            for (Car car: cars) {
                if(car.getCodeCar().equals(item)) {
                    price += car.getMileage() / 100 * fuelConsumption.get(car.getCodeCar()) * costLiterFuel.get(car.getCodeCar());
                }
            }
            if(index == 0){
                maxValue = price;
                minValue = price;
                maxType = typeCar.get(item);
                minType = typeCar.get(item);
            }else{
                if(price> maxValue){
                    maxValue = price;
                    maxType = typeCar.get(item);
                }
                if(price< minValue){
                    minValue = price;
                    minType = typeCar.get(item);
                }
            }

            System.out.println(price);
            index += 1;
        }
        System.out.print("тип авто имеющий наибольшую стоимость расходов - ");
        System.out.print(maxType);
        System.out.print(" (");
        System.out.print(maxValue);
        System.out.println(") ");

        System.out.print("тип авто имеющий наименьшую стоимость расходов - ");
        System.out.print(minType);
        System.out.print(" (");
        System.out.print(minValue);
        System.out.println(") ");

        printCars(100);
    }

    private static void printCars(Integer type) {
        System.out.print(type);
    }

//    void printCars(Integer type){
//
//    }

}
