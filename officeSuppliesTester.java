import javax.swing.event.SwingPropertyChangeSupport;

public class officeSuppliesTester {
    public static void main(String[] args) {
        //testing tally counter
        System.out.println("");
        System.out.println("Testing tally ocunter");
        System.out.println("");
        int tallyTests = 0; 
        System.out.println("Creating a new tally counter...");
        tallyCounter a = new tallyCounter();
        tallyTests++;
        System.out.println("Clicking the tally counter...");
        a.click();
        a.click();
        a.click();
        a.click();
        a.click();
        tallyTests++;
        System.out.println("Checking the count...");
        System.out.println("current clicks: " + a.getClicks());
        if(a.getClicks() == 5){
            tallyTests++;
        } else {
            System.out.println("Test failed!");
        }
        System.out.println("Checking if the count is correct...");
        if(a.getClicks() == 5){
            System.out.println("Counter is correct");
            tallyTests++;
        } else {
            System.out.println("Failed");
        }
        System.out.println("Results: " + tallyTests + ("/4 tests passed"));

        //testing folder
        System.out.println("");
        System.out.println("Testing folder");
        System.out.println("");
        int folderTests = 0; 
        System.out.println("Creating a new folder...");
        folder b = new folder(0);
        folderTests++;
        System.out.println("Adding 10 papers to folder...");
        b.addPapers(10);
        if(b.getPapers() == 10){
            folderTests++;
        } else{
            System.out.println("Test failed");
        }
        System.out.println("Getting number of papers in folder...");
        System.out.println("Papers in folder: " + b.getPapers());
        if(b.getPapers() == 10){
            folderTests++;
        } else{
            System.out.println("Test failed");
        }
        System.out.println("Removing 20 papers from folder...");
        b.removePapers(20);
        if(b.getPapers() == 10){
            folderTests++;
        } else{
            System.out.println("Test failed");
        }
        System.out.println("Removing 5 papers instead...");
        b.removePapers(5);
        System.out.println("Papers remaining in folder: " + b.getPapers());
        if(b.getPapers() == 5){
            folderTests++;
        } else{
            System.out.println("Test failed");
        }
        System.out.println("Results: " + folderTests + ("/5 tests passed"));

        //testing email
        System.out.println("");
        System.out.println("Testing email");
        System.out.println("");
        int emailTests = 0;
        System.out.println("Testing if panther is the username...");
        email c = new email();
        if(c.checkUsername("panther") == true){
            System.out.println("username correct!");
            emailTests++;
        } else{
            System.out.println("username false. try again");
        }

        System.out.println("Testing if 654321 is the password...");
        if(c.checkPassword("654321") == true){
            System.out.println("password correct!");
            emailTests++;
        } else{
            System.out.println("wrong password! try again");
        }

        System.out.println("Testing if 123456 is the password...");
        if(c.checkPassword("123456") == true){
            System.out.println("password correct!");
            emailTests++;
        } else{
            System.out.println("password false. try again");
        }

        System.out.println("Recieving an email...");
        c.recieveEmail("Email 1");

        System.out.println("Priniting number of emails in inbox...");
        System.out.println(c.printEmails());

        if(c.printEmails() == ""){
            System.out.println("Test failed");
        } else {
            System.out.println("Test passed!");
            emailTests++;   
        }
        System.out.println("Results: " + emailTests + ("/3 tests passed"));
    }
     
}
