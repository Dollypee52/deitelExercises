package acceleration;

public class ArrayPopulate {
    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int sum = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println("add:"+numbers[i]);
//            sum = sum + numbers[i];
//
//
//        }
//        System.out.println("the sum is:"+sum);
//    }
//}

        int[][] numbers = {{1,2,3}, {4, 5, 6}};
        int sum = 0;;

        for (int i = 0; i < numbers.length; i++) {
//            int sum = 0;
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.println("add;" + numbers[i][j]);

                sum = sum + numbers[i][j];
            }
//
//            System.out.println("the sum is:"+sum);
        }
        System.out.println("the sum is:"+sum);
    }
}
