public class officeSuppliesTester {
    public static void main(String[] args) {
        //test tally counter  
        int testsPassed = 0; 
        System.out.println("Creating a new tally counter...");
        tallyCounter a = new tallyCounter();
        testsPassed++;
        System.out.println("Clicking the tally counter...");
        a.click();
        a.click();
        a.click();
        a.click();
        a.click();
        testsPassed++;
        System.out.println("Checking the count...");
        System.out.println(a.getClicks());
        testsPassed++;
        System.out.println("Checking if the count is correct...");
        if(a.getClicks() == 5){
            System.out.println("Counter is correct");
            testsPassed++;
        } else {
            System.out.println("Failed");
        }
        System.out.println("Results: " + testsPassed + ("/4 tests passed"));

        //test folder
        System.out.println("Creating a new folder...");
        folder b = new folder();
        System.out.println("Adding papers to folder...");
        

        //test snack cabinet
    }
}
