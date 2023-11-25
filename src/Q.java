
public class Flower {
    public Flower(String rose, int i, float v) {
    }

    public static void main(String[] args) {
        // Create a Flower object
        Flower rose = new Flower("Rose", 20, 2.5f);

        // Set new values using setter methods
        rose.setName("Red Rose");
        rose.setNumOfPetals(25);
        rose.setPrice(3.2f);

        // Get values using getter methods
        String name = rose.getName();
        int numOfPetals = rose.getNumOfPetals();
        float price = rose.getPrice();

        System.out.println("Name: " + name);
        System.out.println("Number of Petals: " + numOfPetals);
        System.out.println("Price: $" + price);
    }

    private float getPrice() {
        return 0;
    }

    private int getNumOfPetals() {
        return 0;
    }

    private String getName() {
        return null;
    }

    private void setPrice(float v) {
    }

    private void setNumOfPetals(int i) {
    }

    private void setName(String redRose) {
    }
}
