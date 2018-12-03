public class Team12SortCompetition extends SortCompetition {

    @Override
    public int challengeOne(int[] arr) {
        int left=arr[0];
        int right=arr[arr.length-1];


       quickSort(arr,left,right);
       return median(arr);
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

    public static void bubbleSort(String[] list1)
    {
        int swaps=1;
        while(swaps !=0)
        {
            for(int i=0;i<list1.length;i++)
            {
                if (list1[i].compareTo(list1[i+1])>0)
                {
                    String first=list1[i];
                    String second=list1[i+1];
                    list1[i]=second;
                    list1[i+1]=first;
                }
                swaps++;
            }
        }
    }
    public static void selectionSort(int[] arr)
    {
        for (int j = 0; j < arr.length-1; j++)
        {
            int minIndex = j;
            for (int k = j + 1; k < arr.length; k++)
            {
                if (arr[k] < arr[minIndex])
                {
                    minIndex = k;
                }
            }
            int temp = arr[j];
            arr[j] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
    public int partition ( int[] arr, int left, int right){
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

public void quickSort(int[] arr,int left,int right) {

    if (left < right) {
        int pivot =partition(arr, left, right);

        quickSort(arr, left, pivot - 1);
        quickSort(arr, pivot + 1, right);
    }
}



    public int median(int[] arr)
    {
        int median=arr[(arr.length-1)/2];
        return median;
    }


}