public class Cargo {
    private Dimensions dimensions;
    private int weight;
    private String deliveryAddress;
    private boolean isItPossibleToFlip;
    private String registrationNumber;
    private boolean isTheCargoFragile;

    public Cargo(Dimensions dimensions, int weight, String deliveryAddress, boolean isItPossibleToFlip,
                 String registrationNumber, boolean isTheCargoFragile) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.deliveryAddress = deliveryAddress;
        this.isItPossibleToFlip = isItPossibleToFlip;
        this.registrationNumber = registrationNumber;
        this.isTheCargoFragile = isTheCargoFragile;
    }

    public Cargo setDimensions(Dimensions dimensions) {
        return new Cargo(dimensions, weight, deliveryAddress, isItPossibleToFlip,
                registrationNumber, isTheCargoFragile);
    }

    public Cargo setWeight(int weight) {
        return new Cargo(dimensions, weight, deliveryAddress, isItPossibleToFlip,
                registrationNumber, isTheCargoFragile);
    }

    public Cargo setDeliveryAddress(String deliveryAddress) {
        return new Cargo(dimensions, weight, deliveryAddress, isItPossibleToFlip,
                registrationNumber, isTheCargoFragile);
    }

    public Cargo setIsItPossibleToFlip(boolean isItPossibleToFlip) {
        String flip = isItPossibleToFlip == true ?
                "да" : "нет";
        return new Cargo(dimensions, weight, deliveryAddress, isItPossibleToFlip,
                registrationNumber, isTheCargoFragile);

    }

    public Cargo setRegistrationNumber(String registrationNumber) {
        return new Cargo(dimensions, weight, deliveryAddress, isItPossibleToFlip,
                registrationNumber, isTheCargoFragile);
    }

    public Cargo setIsTheCargoFragile(boolean isTheCargoFragile) {
        return new Cargo(dimensions, weight, deliveryAddress, isItPossibleToFlip,
                registrationNumber, isTheCargoFragile);
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public int getWeight() {
        return weight;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public boolean getIsItPossibleToFlip() {
        return isItPossibleToFlip;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public boolean getIsTheCargoFragile() {
        return isTheCargoFragile;
    }

    @Override
    public String toString() {
        String answerFlip = isItPossibleToFlip == true ?
                "да" : "нет";
        String answerFragile = isTheCargoFragile == true ?
                "да" : "нет";
        return "характеристики груза:" + "\n" +
                "габариты = " + dimensions + "\n" +
                "вес = " + weight + "\n" +
                "адрес доставки = " + deliveryAddress + "\n" +
                "можно ли переворачевать? = " + answerFlip + "\n" +
                "регистрационный номер = " + registrationNumber + "\n" +
                "хрупкий? = " + answerFragile + "\n";

    }
}
