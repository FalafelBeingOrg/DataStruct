import java.awt.*;

public class WardrobeDriver {
    public static  void
    main(String[] args) {
        Apparel[] wardrobe = new Apparel[10];

        wardrobe[0] = new Apparel();
        wardrobe[1] = new Apparel("blue", 5.99, Apparel.Condition.NEW);
        wardrobe[2] = new Shirt("red", 12.87, Apparel.Condition.TRASHED, Shirt.Size.LARGE, "Have you tried telling it to the rubber duck?");
        wardrobe[3] = new Shirt("orange", 8.99, Apparel.Condition.POOR, Shirt.Size.LARGE);

        for (Apparel item : wardrobe) {
            if (item != null) {
                System.out.println(item);
            }
        }
    }
}
