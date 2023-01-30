public class tallyCounter {
    //fields
    private int clicks;

    //constructors
    public tallyCounter(){
        clicks = 0;
    }

    //methods
    public int getClicks(){
        return clicks;
    }

    public void reset(){
        clicks = 0;
    }

    public void click(){
        clicks++;
    }
}
