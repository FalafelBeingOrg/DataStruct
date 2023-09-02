public class Pants extends Apparel{
    // creating variables for waist size in inches and inseam size in inches
    int waist;
    int inseam;
    // null constructor
    Pants(){
        waist = 0;
        inseam = 0;
    }
    // Pants constructor allowing the initialization of color, price, cond, waist, inseam
    Pants(String color, double price, Condition cond, int waist, int inseam) {
        this.color = color;
        this.price = price;
        this.cond = cond;
        this.waist = waist;
        this.inseam = inseam;
    }
    // getters for waist and inseam
    public int
    getWaist() {
        return waist;
    }
    public int
    getInseam() {
        return inseam;
    }
    // setters fpr waist, inseam
    public void
    setWaist(int waist) {
        this.waist = waist;
    }
    public void
    setInseam(int inseam) {
        this.inseam = inseam;
    }
    // toString() function that returns the text shown in moodle
    public String
    toString() {
        return "This " + color + " pair of pants has a(n) " + waist + " waist and a(n) " + inseam + " inch inseam. It cost $" + price + " and is in " + cond + " condition.";
    }
}
