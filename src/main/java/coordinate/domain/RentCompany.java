package coordinate.domain;

import java.text.DecimalFormat;
import java.util.List;

public class RentCompany {

    private final List<Car> carList;

    public RentCompany(List<Car> carList) {
        this.carList = carList;
    }


    public void addCar(Car car) {
        carList.add(car);
    }

    public String generateReport() {
        StringBuilder result = new StringBuilder();
        DecimalFormat format = new DecimalFormat("0.#");
        String newLine = System.getProperty("line.separator");
        for (Car car : carList) {
            result.append(car.getModelName())
                    .append(" : ")
                    .append(format.format(car.getChargeQuantity()))
                    .append("리터")
                    .append(newLine);
        }

        return result.toString();
    }
}
