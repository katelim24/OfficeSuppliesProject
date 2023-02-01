public class email {
    //fields
    private String username;
    private String password;
    private String email;
    private String inbox;

    //constructors
    public email(){
        username = "panther";
        password = "123456";
        inbox = "";
    }

    //methods
    public boolean checkUsername(String myUsername){
        if(myUsername == username){
            return true;
        } else {
            return false;
        }
    }

    public boolean checkPassword(String curr){
        for(int i = 0; i < password.length(); i++){
            if(!curr.substring(i, i+1).equals(password.substring(i, i+1))){
                return false;
            }
        } return true;
    }

    public void recieveEmail(String email){
        inbox += email;
    }

    public String printEmails(){
        return inbox;
    }
}