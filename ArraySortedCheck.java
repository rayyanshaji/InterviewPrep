    public static void fibonacci(int[] number) {
        int[] a = number;
        int checker = a[0];
        boolean flag = false;
        for(int i = 1; i<a.length; i++){
            if(a[i] > checker){
                checker = a[i];
                flag = true;
                System.out.println(checker);
                if(i == a.length-1 && flag){
                    System.out.println("Array is sorted");
                }
            } else {
                flag = false;
                System.out.println("Not sorted");
                break;

            }
        }
    }

    public static void main(String args[]) {

        int[] data = {10,20,30,1,40,50};

        fibonacci(data);

    }
