public class multiDimentionalArray
{
    public static void main(String[] args)
    {
        //2d array
        int a[] = {1,2,3,4};
        int b[] = {5,6,7,8};
        int c[] = {9,0,1,2};

        int d[][] = {
                        a,b,c
                    };

        System.out.println("using for loop:");
        for (int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                    System.out.print(d[i][j] +" ");
            }
            System.out.println();
        }


        //enhanced for loop
        System.out.println("using enhanced for loop:");
        for(int k[]:d){
            for(int l:k){
                System.out.print(l+" ");
            }
            System.out.println();
        }

        //3d array
        int arr[][][] = new int[3][3][4];
        arr[0][0][0] = 1;
        arr[1][0][0] = 2;
        arr[2][0][0] = 3;
        arr[2][1][0] = 4;

        System.out.println("3d Array:");
        for (int p[][] :arr){
            for (int q[]:p){
                for (int r:q){
                    System.out.print(r+" ");
                }
               System.out.print("");
            }
            System.out.println("");
        }

        //jagged array size are not fix

        int j[][] = new int[3][];
        j[0] = new int[1];
        j[1] =new int[2];
        j[2] = new int[3];

        for(int x[]:j){
            for(int y:x){
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }

}