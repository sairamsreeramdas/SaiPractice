public class Pattern2 {
    public static void main(String args[]) {

        /*for (int i = 1; i <= 4; i++) {

            for (int j = 4; j>= i; j--) {
                System.out.print("*");
            }

            System.out.println();
        }*/


            /*for (int i = 4; i>= 1; i--)
            {
                for (int j = 4; j > i; j--)
                {
                    System.out.print(" ");
                }
                for (int k = 1; k <= i; k++)
                {
                    System.out.print("*");
                }
                System.out.println();   //out put ****, 3 2 1

            }*/


        /*for (int i = 1; i<= 4; i++)
        {
            for (int j = 4; j > i; j--)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <=(2*i)-1; k++)
            {
                System.out.print("*");
            }

            System.out.println();

        }*/


        /*for (int i = 7; i>= 4; i--)
        {
            for (int j = 7; j > i; j--)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <=(2*i)-7; k++)
            {
                System.out.print("*");
            }

            System.out.println();

        }*/

       /* for (int i = 1; i<= 3; i++)
        {
            for (int j = 3; j > i; j--)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <=(2*i)-1; k++)
            {
                System.out.print("*");   // out put 1 ,3,5,3,1
            }

            System.out.println();

        }
        for (int i = 2; i>= 1; i--)
        {
            for (int j = 2; j >= i; j--)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <=(2*i)-1; k++) // or we can implement another format also k<4 it will consider 3
                                                //k<=4 i will consider 4 th value also
                                                //for(int k=1; k<(2*i); k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }*/


        for (int i = 1; i <= 5; i++) {

            for (int j = 5; j>i; j--) {
                System.out.print("*");
            }

            System.out.println();
        }


    }
}
