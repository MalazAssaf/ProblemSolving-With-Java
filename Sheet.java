    import java.util.Scanner;
        public class Sheet {
            public static void main(String[] args) {
                Scanner f = new Scanner (System.in);  
                Scanner e = new Scanner (System.in);            
                int a = f.nextInt();
                int b = f.nextInt();
                int j = a+b+1;
                String array = "poo";
                if(e.hasNextLine()){
                   array = e.nextLine();
                }
                System.out.println(array.length());
                char[] ch = new char[array.length()];
                for (int i = 0; i < array.length(); i++) {
                  ch[i] = array.charAt(i);
                }
              int counter=0;
              for(int w = 0; w<array.length(); w++){
                if((int)ch[w]>=48&&(int)ch[w]<=57&&w!=a){
                  counter++;
                }
              }
                if(ch[a]=='-'&&counter==a+b){
                  System.out.println("Yes");
                }
                else{
                  System.out.println("No");
                }
                e.close();
              }
            }
                
          

        
