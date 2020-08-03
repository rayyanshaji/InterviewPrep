public class InterviewTest {

    public static int Demo(int a){
        int root = (int)Math.round(Math.sqrt(a));
        System.out.println("closest : "+root);
        for(int i=2; i<root;i++){
            if(a%i == 0){
                System.out.println("Not Prime");
                break;
            } else {System.out.println("Prime");
            break;}
        }

    return a;
    }
    public static void main(String args[]) {
        Demo(100);
    }
}

// Find Root of the passed number
// Check for divisibility for all numbers before the root number
