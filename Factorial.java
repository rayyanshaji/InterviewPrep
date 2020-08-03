public class InterviewTest {

    public static int Demo(int a){
        int fact = a;
        for(int i=a-1; i>0; i--){
            fact = fact*i;
        }
    return fact;
    }
    public static void main(String args[]) {
        System.out.println(Demo(5));
    }
}

//Assign value subtracted by 1 of passed argument in for loop
// store factorial value in variable by multiplying same resultant with each decrement value
