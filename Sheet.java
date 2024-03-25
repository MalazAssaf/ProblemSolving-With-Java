import java.util.Scanner;

public class Sheet {
                        public static void main(String[] args) {
                            Scanner i = new Scanner(System.in);
                            int n = i.nextInt(), m = i.nextInt();
                            int[][] array = new int [20][20];
                            int d = 0;
                            int c = 0;
                            while(d<m){
                                c = i.nextInt();
                                int v = i.nextInt();
                                array [d][0] = c;
                                array [d][1] = v;
                                d++;
                            }
                            int profit = 0;
                            while(n > 0){
                                int x = 0;
                                for(int w = 0; w<m;w++){
                                    if(array[x][1]<array[w][1])
                                        x=w;
                                }
                                if(n<=array[x][0]){
                                    profit+=n*array[x][1];
                                    System.out.println(profit);
                                    break;
                                }
                                else{
                                    profit+=array[x][0]*array[x][1];
                                    n-= array[x][0];
                                    array[x][1]=0;
                                }
                            }
                        }
                            }
                    