public class email {
    //fields
    private String username;
    private String password;
    private String email;
    private String inbox;

    //constructors
    public email(String myUsername, String myPassword, String myEmail, String myInbox){
        username = "panther";
        password = "123456";
        email = myEmail;
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

    public boolean checkPassword(String myPassword){
        for(int i = 0; i < password.length(); i++){
            if(myPassword.substring(i, i+1) = password.substring(i, i+1)){
                return 
            }
        }
    }

    public void recieveEmail(String email){
        inbox += email;
    }

    public String printEmails(){
        return inbox;
    }
}