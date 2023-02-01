public class email {
    //fields
    private String username;
    private String password;
    private String draft;
    private String inbox;

    //constructors
    public email(String myUsername, String myPassword, String myDraft, String myInbox){
        username = "panther";
        password = "apcompsci23";
        draft = myDraft;
        inbox = myInbox;
    }

    //methods
    public boolean checkUsername(String myUsername){
        if(myUsername == username){
            return true;
        } else {
            return false;
        }
    }

    public boolean checkPassword(String myPassword){
        if(myPassword == password){
            return true;
        } else {
            return false;
        }
    }

    public void recieveEmail(){

    }

    public String printEmails(){

    }
}