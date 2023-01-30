public class snackCabinet {
    //fields
    private String chips;
    private String candy;
    private String drinks;
    private boolean status;

    //constructors
    public snackCabinet(String myChips, String myCandy, String myDrinks){
        chips = myChips;
        candy = myCandy;
        drinks = myDrinks;
    }

    //methods

    public String getChips(){
        return chips;
    }

    public String getCandy(){
        return candy;
    }

    public String getDrinks(){
        return drinks;
    }

    public void changeStatus(){
        status = !status;
    }

    public boolean getStatus(){
        return status;
    }

    public void randomSnack(){
        int position = Math.random()* snackCabinet.length;
        return 
    }
}
