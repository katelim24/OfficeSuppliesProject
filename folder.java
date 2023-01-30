public class folder {
    //fields
    private int count;
    private int papers;
    private int capacity;

    //constructors
    public folder(int myPapers){
        count = 0;
        papers = myPapers;
        capacity = 100;
    }

    //methods
    public int getPapers(){
        return count;
    }

    public void addPapers(int numPapers){
        if((count + numPapers) < capacity){
            count += numPapers;
        } else{
            System.out.println("too many papers, cannot add " + numPapers + " papers");
        }
    }

    public void removePapers(int numPapers){
        if((count - numPapers) > 0){
            count -= numPapers;
        } else{
            System.out.println("not enough papers, cannot remove " + numPapers + " papers");
        }
    }
}