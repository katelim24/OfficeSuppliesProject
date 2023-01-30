public class folder {
    //fields
    private int count;
    private boolean status;

    //constructors

    //methods
    public int getPapers(){
        return count;
    }

    public void addPapers(int papers){
        count += papers;
    }

    public void removePapers(int papers){
        count -= papers;
    }

    public boolean getStatus(){
        return status;
    }

    
}