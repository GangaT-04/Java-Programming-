import java.lang.*;
import java.io.*;

class Main
{
        public static void main (String[] args) throws java.lang.Exception
        {
                        Scanner sc = new Scanner(System.in);
                        int t = sc.nextInt();
                        for(int i=0; i<t; i++){
                                        int X = sc.nextInt();
                                                        int Y = sc.nextInt();
                                                                        int D = sc.nextInt();
                                                                                        if(Math.abs(X-Y)<=D){
                                                                                            System.out.println("YES");

                                                                                        }else{

                                                                                            System.out.println("NO");



                                                                                        }

                        }

        }

}

