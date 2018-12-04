public class Runner {
    public static int[] randomIntsArr(int num)
    {
        int[] numbers=new int[num];
        for(int i=0;i<numbers.length;i++)
        {
            numbers[i]=(int)(Math.random()*num+1);
        }
        return numbers;
    }

    public static String[] randomStringArr(int num,int length)
    {
       String [] arr=new String[num];
       while(num>0)
       {
           int i=0;
           String s="";
           while(i<length)
           {
               char c=(char)((Math.random()*26)+97);
               s=s+c;
               i++;
           }
           num--;
           arr[num]=s;
       }
       return arr;
    }

    public static void printarr(int [] arr)
    {
        for( int i:arr)
        {
            System.out.println(i);
        }
    }
    public static void printString(String[]arr)
    {
        for(String i:arr)
        {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {

        SortCompetition team12 = new Team12SortCompetition();

        String greeting=team12.greeting();
        System.out.println(greeting);
        int[] ranIntArr = randomIntsArr(10000);
        String[] randStringArr=randomStringArr(10000,5);
        String query=randStringArr[0];


        System.out.println("Unsorted");
        printarr(ranIntArr);

        long time=System.currentTimeMillis();
        int median=team12.challengeOne(ranIntArr);
        int compare=team12.challengeTwo(randStringArr,query);
        time=System.currentTimeMillis()- time;
        System.out.println("\n\tChallenge one Time Taken:" + time*0.001+"Seconds");
       // System.out.println("\n\tMedian equals: "+ median);
        System.out.println(compare);
        System.out.println(query);
        System.out.println("Sorted");
        //printarr(ranIntArr);
        printString(randStringArr);


    }
}
