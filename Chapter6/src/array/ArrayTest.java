package array;

public class ArrayTest {
    public static void main(String[] args) {
//        int[] arr = new int[10];
////        int[] arr1 = {1, 2, 3};
//        for (int i = 0, num = 1; i < arr.length; num++, i++) {
//            arr[i] = num;
//            System.out.println(arr[i]);
//        }

        char[] alphabet = new char[26];
        char ch = 'A';
        for(int i=0; i<alphabet.length;i++){
            alphabet[i] = ch++;
        }
        for(int i=0; i<alphabet.length;i++){
            System.out.println(alphabet[i] + "," + (int)alphabet[i]);
        }
    }

}
