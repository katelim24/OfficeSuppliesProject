public class officeSuppliesTester {
    public static void main(String[] args) {
        //test tally counter  
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
        System.out.println(a.getClicks());
        testsPassed++;
        System.out.println("Checking if the count is correct...");
        if(a.getClicks() == 5){
            System.out.println("Counter is correct");
            tallyTests++;
        } else {
            System.out.println("Failed");
        }
        System.out.println("Results: " + tallyTests + ("/4 tests passed"));

        //test folder
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
        b.getPapers();
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
        if(b.getPapers() == 5){
            folderTests++;
        } else{
            System.out.println("Test failed");
        }
        System.out.println("Remaining paper in folder: " + b.getPapers());
        if(b.getPapers() == 5){
            folderTests++;
        } else{
            System.out.println("Test failed");
        }
        System.out.println("Results: " + folderTests + ("/6 tests passed"));

        //test snack cabinet
    }
}
