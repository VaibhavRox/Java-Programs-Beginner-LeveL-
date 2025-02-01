public class frequency {
    public static void countFrequency(int[] array)
    {
        int n=array.length;
        boolean[] visited=new boolean[n];
        System.out.println("Element     |   Frequency");
        for(int i=0;i<n;i++)
        {
            if(!visited[i])
            {
                int count=1;
                for(int j=i+1;j<n;j++)
                {
                    if(array[i]==array[j])
                    {
                        count++;
                        visited[j]=true;
                    }
                }
                System.out.println(array[i]+"   |   "+count);
            }
        }
    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, 8, 3, 2, 2, 2, 5, 1};
        countFrequency(numbers);
    }



}
