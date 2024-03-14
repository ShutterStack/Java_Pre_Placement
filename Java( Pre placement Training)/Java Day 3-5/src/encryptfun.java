import java.util.*;
public class encryptfun {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a length: ");
        int n = sc.nextInt();
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int[] numarr = new int[n];
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        char[] conso = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};
        int vinc = 0;
        int cinc = 0;
                int i = 0;
        String str = "";

        while(num>0){
            numarr[i] = num % 10;
            num = num/10;
            i++;
        }

        for(int j = n-1;j>=0;j--){
            if(numarr[j]%2==0 || numarr[j]%3==0){
                if(numarr[j]==2 || numarr[j]==3){
                    str += vowels[vinc];
                    vinc++;



                }
                else{
                    str+= conso[cinc];
                    cinc++;
                }


            }

            else if(numarr[j]==1){

                str+= conso[cinc];
                cinc++;


            }

            else{

                str += vowels[vinc];
                vinc++;

            }




        }
        System.out.println(str);
    }
}