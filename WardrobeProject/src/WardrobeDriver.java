import java.awt.*;

public class WardrobeDriver {
    public static  void
    main(String[] args) {
        Apparel[] wardrobe = new Apparel[10];

        wardrobe[0] = new Apparel();
        wardrobe[1] = new Apparel("Blue", 5.99, Apparel.Condition.NEW);

        for (Apparel item : wardrobe) {
            if (item != null) {
                System.out.println(item);
            }
        }
    }
}
