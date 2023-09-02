public class Pants extends Apparel{
    int waist;
    int inseam;

    Pants(){
        waist = 0;
        inseam = 0;
    }
    Pants(String color, double price, Condition cond, int waist, int inseam) {
        this.color = color;
        this.price = price;
        this.cond = cond;
        this.waist = waist;
        this.inseam = inseam;
    }

    public int
    getWaist() {
        return waist;
    }
    public int
    getInseam() {
        return inseam;
    }

    public void
    setWaist(int waist) {
        this.waist = waist;
    }
    public void
    setInseam(int inseam) {
        this.inseam = inseam;
    }

    public String
    toString() {
        return "This " + color + " pair of pants has a(n) " + waist + " waist and a(n) " + inseam + " inch inseam. It cost $" + price + " and is in " + cond + " condition.";
    }
}
