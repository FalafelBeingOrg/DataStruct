public class Shirt extends Apparel{
    // Making an enum for the sizes of the shirts
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
    // creating two variables to store the size and text of the shirt
    Size size;
    String text;
    // Creating a null constructor
    Shirt(){
        size = Size.MED;
        text = null;
    }
    // creating a constructor for textless shirts
    Shirt(String color, double price, Condition cond, Size size){
        this.color = color;
        this.price = price;
        this.cond = cond;
        this.size = size;
    }
    // creating a constructor for shirts that have text
    Shirt(String color, double price, Condition cond, Size size, String text){
        this.color = color;
        this.price = price;
        this.cond = cond;
        this.size = size;
        this.text = text;
    }
    // getters for size and text
    public Size
    getSize() {
        return size;
    }

    public String
    getText() {
        return text;
    }
    // setters for size and text
    public void
    setSize(Size size) {
        this.size = size;
    }

    public void
    setText(String text) {
        this.text = text;
    }
    // a toString() function that returns what is shown by the moodle assignment, making sure to only print the part about the text if the shirt's text is not null.
    public String
    toString() {
        String returnString = "This size " + size + " " + color + " shirt cost $" + price + " and is in " + cond + " condition.";
        if (text != null) {
            returnString += " It contains the text \"" + text + "\"";
        }
        return returnString;
    }
}
