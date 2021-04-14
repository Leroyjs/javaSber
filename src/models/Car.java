package models;

public class Car {
    private Integer codeCar;
    private Integer number;
    private Integer mileage;
    private Integer additionally;

    public Car(Integer codeCar, Integer number, Integer mileage, Integer additionally) {
        this.codeCar = codeCar;
        this.number = number;
        this.mileage = mileage;
        this.additionally = additionally;
    }

    public Car(Integer codeCar, Integer number, Integer mileage) {
        this.codeCar = codeCar;
        this.number = number;
        this.mileage = mileage;
    }

    public Car() {
    }

    public Integer getCodeCar() {
        return codeCar;
    }

    public void setCodeCar(Integer codeCar) {
        this.codeCar = codeCar;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public Integer getAdditionally() {
        return additionally;
    }

    public void setAdditionally(Integer additionally) {
        this.additionally = additionally;
    }
}
//[
//        {
//            'CODE_CAR':12312,
//            'гос номер':1233,
//            'Пробег':3453,
//            'доп. параметр':23443,
//        },
//        {
//        'CODE_CAR':12312,
//        'гос номер':1233,
//        'Пробег':3453,
//        'доп. параметр':23443,
//        },
//]
