public class Team12SortCompetition extends SortCompetition {

    @Override
    public int challengeOne(int[] arr) {
        int left=arr[1];
        int mid=arr[(arr.length-1)/2];
        int right=arr[arr.length-1];
        int[] temp=new int[]{};


       merge(arr,left,mid,right,temp);
       return median(arr);
    }

    @Override
    public int challengeTwo(String[] arr, String query) {
        bubbleSort(arr);

        for(int i=0;i<arr.length;i++)
        {
            return (arr[i].compareTo(query));
        }
        return -2;
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
        return "Team12,hello guys";
    }

    public void merge(int[] arr,int left,int mid,int right,int[] temp)
    {
        int i=left;
        int j=mid+1;
        int k=left;

        while(i<=mid && j<=right)
        {
            if(arr[i]<arr[j])
            {
                temp[k]=arr[i];
            }
            else{
                temp[k]=temp[j];
            }
            k++;
        }
        while(i<= mid)
        {
            temp[k]=arr[i];
            i++;
            k++;
        }
        while(j<=right)
        {
            temp[k]=arr[i];
            i++;
            k++;
        }
        for (int x=i;i<j;x++)
        {
            arr[x]=temp[x];
        }
    }

    public static void bubbleSort(String[] arr)
    {
        int swaps=1;
        while(swaps !=0)
        {
            for(int i=0;i<arr.length;i++)
            {
                if (arr[i].compareTo(arr[i+1])>0)
                {
                    String first=arr[i];
                    String second=arr[i+1];
                    arr[i]=second;
                    arr[i+1]=first;
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
        int temp=arr[i+1];
        arr[i+1]=arr[right];
        arr[right] = temp;
        return i + 1;
    }

public void quickSort(int[] arr,int left,int right) {

    if (left < right) {
        int pivot =partition(arr, left, right);

        quickSort(arr,left,pivot-1);
        quickSort(arr,pivot + 1,right);
    }
}



    public int median(int[] arr)
    {
        int median=arr[(arr.length-1)/2];
        return median;
    }


}