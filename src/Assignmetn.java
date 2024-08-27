public class Assignmetn {
    public static void main(String[] args) {
        System.out.println(hasEqualSum(1, 1, 1));
        System.out.println(hasEqualSum(1, 1, 2));
        System.out.println(hasEqualSum(1, -1, 0));
    }

    private static boolean hasEqualSum(int num1, int num2, int num3) {
        //find sum of num1 and num2 store it as variable

        int sum = num1 + num2;

        //return whether that same is equal to num3;

        if (sum == num3){
            return true;
        }else{
            return false;
        }
    }

}