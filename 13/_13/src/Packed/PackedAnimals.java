package Packed;
import Animals.Animals;
public class PackedAnimals extends Animals {
    private int cargoWeight;

    public int getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(int cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    @Override
    public String toString() {
        return String.format("%d. %s: имя: %s, дата рождения: %s, максимальная масса груза: %d ", getPetId(), getClass().getSimpleName(), name, getBirthday(), cargoWeight);
    }
}
