public class Apparel {
    // Begin code copied from Dr. Carl Albing's COS212 data structures class with permission
    // This is an enum for the shirts condition containing the different possible conditions of the apparel
    public enum Condition{
        NEW("new"),
        GOOD("good"),
        POOR("poor"),
        TRASHED("trashed");
        private final String mCond;
        Condition(String cond){
            mCond = cond;
        }
        public String toString(){ return mCond; }
    };
    // End copied code
    // creating 3 vars for the color, price, and condition of the apparel
    String color;
    double price;
    Condition cond;
    // null constructor
    Apparel(){
        color = null;
        price = 0.0;
        cond = Condition.NEW;
    }
    // constructor that allows initializing color, price, and condition
    Apparel(String color, double price, Condition cond){
        this.color = color;
        this.price = price;
        this.cond = cond;
    }
    // getters for color, price, and condition
    public String
    getColor() {
        return this.color;
    }
    public double
    getPrice() {
        return this.price;
    }
    public Condition
    getCond() {
        return this.cond;
    }
    // setters for color, price, and condition
    public void
    setColor(String color) {
        this.color = color;
    }
    public void
    setPrice(double price){
        this.price = price;
    }
    public void
    setCond(Condition cond) {
        this.cond = cond;
    }
    // toString() function that returns basic facts about the apparel for testing
    public String
    toString() {
        return "Color: " + color + ". Price: $" + price + ". Condition: " + cond + ".";
    }
}
