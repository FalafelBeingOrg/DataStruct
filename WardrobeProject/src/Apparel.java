public class Apparel {
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
    String color;
    double price;
    Condition cond;
    Apparel(){
        color = null;
        price = 0.0;
        cond = Condition.NEW;
    }
    Apparel(String color, double price, Condition cond){
        this.color = color;
        this.price = price;
        this.cond = cond;
    }
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

    public void
    setColor(String color) {
        this.color = color;
    }
    public void
    setPrice(double price){
        this.price = price;
    }

    public void setCond(Condition cond) {
        this.cond = cond;
    }
    public String
    toString() {
        return "Color: " + color + ". Price: $" + price + ". Condition: " + cond + ".";
    }
}
