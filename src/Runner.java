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
    public static void main(String[] args) {
        SortCompetition team1 = new Team12SortCompetition();
        int[] ranIntArr = randomIntsArr(10000);
        String[] randStringArr=randomStringArr(10000,5);


        System.out.println("Unsorted");
        System.out.print(ranIntArr);

        long time=System.currentTimeMillis();
        int median=team1.challengeOne(ranIntArr);
        time=System.currentTimeMillis()- time;
        System.out.println("Challenge one Time Taken:" + time*0.001+"Seconds");
        System.out.println("Median equals: "+ median);

        System.out.println("Sorted");
        System.out.print(ranIntArr);

    }
}
