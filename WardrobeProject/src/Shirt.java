public class Shirt extends Apparel{
    public enum Size{
        SMALL("S"),
        MED("M"),
        LARGE("L"),
        XLARGE("XL");
        private final String mSize;
        Size(String size){
            mSize = size;
        }
        public String toString(){ return mSize; }
    };

    Size size;
    String text;

    Shirt(){
        size = Size.MED;
        text = null;
    }
    Shirt(String color, double price, Condition cond, Size size){
        this.color = color;
        this.price = price;
        this.cond = cond;
        this.size = size;
    }
    Shirt(String color, double price, Condition cond, Size size, String text){
        this.color = color;
        this.price = price;
        this.cond = cond;
        this.size = size;
        this.text = text;
    }

    public Size getSize() {
        return size;
    }

    public String getText() {
        return text;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String
    toString() {
        String returnString = "This size " + size + " " + color + " shirt cost $" + price + " and is in " + cond + " condition.";
        if (text != null) {
            returnString += " It contains the text \"" + text + "\"";
        }
        return returnString;
    }
}
