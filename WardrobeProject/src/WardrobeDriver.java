import java.awt.*;

public class WardrobeDriver {
    public static  void
    main(String[] args) {
        // Creating a wardrobe consisting of an Apparel array containing 10 Apparel objects
        Apparel[] wardrobe = new Apparel[10];
        // Hard coding some Pant and Shirt objects into the wardrobe, making sure to include one shirt with text, one without text, one pair of pants, and at least two other objects.
        wardrobe[0] = new Pants("brown", 15.99, Apparel.Condition.POOR, 32, 33);
        wardrobe[1] = new Pants("blue", 5.99, Apparel.Condition.NEW, 30, 32);
        wardrobe[2] = new Shirt("red", 12.87, Apparel.Condition.TRASHED, Shirt.Size.LARGE, "Have you tried telling it to the rubber duck?");
        wardrobe[3] = new Shirt("orange", 8.99, Apparel.Condition.POOR, Shirt.Size.MED);
        wardrobe[4] = new Shirt("teal", 9.99, Apparel.Condition.GOOD, Shirt.Size.XLARGE, "!false. It's funny because it's true.");
        wardrobe[5] = new Shirt("peach", 11.27, Apparel.Condition.GOOD, Shirt.Size.LARGE, "I love CTRL+Z.");
        wardrobe[6] = new Shirt("mahogany", 8.99, Apparel.Condition.TRASHED, Shirt.Size.MED, "MMM Crab Rangoons.");
        wardrobe[7] = new Shirt("black", 6.99, Apparel.Condition.GOOD, Shirt.Size.SMALL, "I need a <br>.");
        wardrobe[8] = new Shirt("pink", 12.89, Apparel.Condition.POOR, Shirt.Size.LARGE, "I am engi-nearing my limit.");
        wardrobe[9] = new Shirt("sea foam blue", 9.99, Apparel.Condition.NEW, Shirt.Size.SMALL, "Save the Bees.");

        // iterating over the wardrobe and printing out all non null Apparel objects using the toString() function
        for (Apparel item : wardrobe) {
            if (item != null) {
                System.out.println(item);
            }
        }
    }
}
