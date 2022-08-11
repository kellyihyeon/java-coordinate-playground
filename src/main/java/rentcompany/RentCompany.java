package rentcompany;

import rentcompany.car.Car;
import java.util.ArrayList;
import java.util.List;

public class RentCompany {

    private final String NEWLINE = System.getProperty("line.separator");
    private final String COLON_WITH_SPACE = " : ";
    private final String LITER = "리터";
    private static RentCompany rentCompany = null;
    private final List<Car> cars = new ArrayList<>();


    public static RentCompany create() {
        if (rentCompany == null) {
            rentCompany = new RentCompany();
        }
        return rentCompany;
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public String generateReport() {
        StringBuilder result = new StringBuilder();

        for (Car car : cars) {
            result.append(car.getName())
                    .append(COLON_WITH_SPACE)
                    .append((int)car.getFuelChargeQuantity())
                    .append(LITER)
                    .append(NEWLINE);
        }
        return result.toString();
    }
}
