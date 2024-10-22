public class LoopStatement {
    public static void main(String[] args) {
        int no = 10;
        System.out.println("Loop starts ");
        
        for (int i = 0; i < no; i++) {
           
            System.out.println(i);
            
        }
        System.out.println("Loop ends");
        breakstatement(no);
        continuestatement(no);

    }
    // Loop with the break staement stop the loop when the break statemtnt is found 
    public static void breakstatement(int num){
        System.out.println("Loop starts of Break statement");
        
        // Initialize 'i' to 0
        for (int i = 0; i < num; i++) {
            if (i==6){
                break;
            }
            else
            {
            System.out.println(i);
            }
        }
        System.out.println("Loop ends");
    }

    public static void continuestatement(int num){
        System.out.println("Loop starts of Continue statement");
        
        // Initialize 'i' to 0
        for (int i = 0; i < num; i++) {
            if (i==6){
                continue;
            }
            else
            {
            System.out.println(i);
            }
        }
        System.out.println("Loop ends of continue statement");
        
    }


}



