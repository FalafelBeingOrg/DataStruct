import java.awt.*;

public class WardrobeDriver {
    public static  void
    main(String[] args) {
        // Creating a wardrobe consisting of an Apparel array containing 10 Apparel objects
        Apparel[] wardrobe = new Apparel[10];
        // Hard coding some Pant and Shirt objects into the wardrobe, making sure to include one shirt with text, one without text, one pair of pants, and two other objects.
        wardrobe[0] = new Pants("brown", 15.99, Apparel.Condition.POOR, 32, 33);
        wardrobe[1] = new Pants("blue", 5.99, Apparel.Condition.NEW, 30, 32);
        wardrobe[2] = new Shirt("red", 12.87, Apparel.Condition.TRASHED, Shirt.Size.LARGE, "Have you tried telling it to the rubber duck?");
        wardrobe[3] = new Shirt("orange", 8.99, Apparel.Condition.POOR, Shirt.Size.MED);
        wardrobe[4] = new Shirt("teal", 9.99, Apparel.Condition.GOOD, Shirt.Size.XLARGE, "!false. It's funny because it's true.");
        // iterating over the wardrobe and printing out all non null Apparel objects using the toString() function
        for (Apparel item : wardrobe) {
            if (item != null) {
                System.out.println(item);
            }
        }
    }
}
