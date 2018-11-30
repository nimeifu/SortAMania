public class Team12SortCompetition extends SortCompetition {

    @Override
    public int challengeOne(int[] arr) {

    }

    @Override
    public int challengeTwo(String[] arr, String query) {
        return 0;
    }

    @Override
    public int challengeThree(int[] arr) {
        return 0;
    }

    @Override
    public int challengeFour(int[][] arr) {
        return 0;
    }

    @Override
    public int challengeFive(Comparable[] arr, Comparable query) {
        return 0;
    }

    @Override
    public String greeting() {
        return null;
    }


    public int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = arr[left - 1];
        for (int j = left; j < right; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        arr[right] = arr[i + 1];
        arr[i + 1] = pivot;
        return i + 1;
    }
    public int median(int[] arr)
    {
        int median=arr[(arr.length-1)/2];
        return median;
    }


}