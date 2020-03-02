import java.util.Scanner;

public class opposite_sit_train {
    public static void main(String[] args)
    {
        //to get No. of input
        int n=0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

       // create array for input and to store results
        int[] test = new int[n];
        int[]result = new int[n];

        //taking seat number in array
        for(int i = 0; i < n; i++)
        {
            // checking user is giving inpute more then 108
            int seat = sc.nextInt();
            if (seat>108){
                System.out.println("Wrong input");
                System.out.println("Enter again");
                i--;
                continue;
            }

            else
                test[i] = seat;
        }

       // for multiple input
        for(int i = 0; i<n; i++)
        {
            // to find the opposite seat
            int st = test[i],colum=12;
            for (;colum<=108;colum+=12){    // colum will increaase 12
                int j=colum-12+1,k=colum;   //1st j =1,k=12..2nd j=13,k=24....so on upto 108
                for (; j<=colum-6;j++,k--)  // j will check in increasing and j will check in
                                            // decreaseing order
                {
                    if(j==st)
                    {
                        result[0]=k;
                        break;
                    }
                    if(k==st)
                    {
                        result[0]=j;
                        break;
                    }
                }
            }
        }

        // to display the result
        for(int i = 0; i < n; i++)
        {

            System.out.print(result[i]+" ");
            //To Check seat position
            int r = result[i]%6;
            if(r==0 || r==1)
                System.out.println("WS");
            if (r==2 || r==5)
                System.out.println("MS");
            if(r==3 || r==4)
                System.out.println("AS");
        }

    }
}
