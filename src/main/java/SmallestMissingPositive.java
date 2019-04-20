
public class SmallestMissingPositive {

    public int findFirstMissingPositive(int[] A) {
        int n = A.length;

        for (int i = 0; i < n; i++) {
            while (A[i] != i + 1) {
                if (A[i] <= 0 || A[i] >= n)
                    break;

                if(A[i]==A[A[i]-1])
                    break;

                int temp = A[i];
                A[i] = A[temp - 1];
                A[temp - 1] = temp;
            }
        }

        for (int i = 0; i < n; i++){
            if (A[i] != i + 1){
                return i + 1;
            }
        }

        return n + 1;
    }


    public static void main(String[] args) {
        SmallestMissingPositive o = new SmallestMissingPositive();

        int[] arr1 = {1,2,0};
        int[] arr2 = {3,4,-1,1};
        int[] arr3 = {7,8,9,11,12};

        System.out.println(o.findFirstMissingPositive(arr1));
        System.out.println(o.findFirstMissingPositive(arr2));
        System.out.println(o.findFirstMissingPositive(arr3));
    }
}
