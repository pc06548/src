package codepractice;

/* IMPORTANT: Multiple classes and nested static classes are supported */

import java.io.BufferedReader;
import java.io.InputStreamReader;


class problem1 {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        for (int i = 0; i < N; i++) {
            line = br.readLine();
            int M = Integer.parseInt(line);
            if(isUnlimitedPower(line))
                System.out.println("Unlimited Power");
            else{
                int next = getNextNumber(line);
                System.out.println(next);
                int prev = getPrevNumber(line);
                System.out.println(prev);
                int gcd = findGCD((next-M),(M-prev));
                System.out.println((next-M)/gcd+"/"+(M-prev)/gcd);
            }
        }
    }

    public static boolean isUnlimitedPower(String str){
        for(int i=0;i<str.length();i++){
            if(Character.getNumericValue(str.charAt(i))%2 != 0)
                return false;
        }
        return true;
    }


    public  static int getNextNumber(String str){
        StringBuilder strb = new StringBuilder();
        if(str.contains("9")){
            int last = str.lastIndexOf('9');
            for(int i =last;i<str.length();i++){
                strb.append('0');
            }
            int carry = 1;
            for(int i = last-1;i<=0;i++){
                int value = Character.getNumericValue(str.charAt(i)) + carry ;
                if(value==10){
                    carry = 1;
                    strb.append('0');
                }else
                {
                    if(value%2==0){
                        strb.append(value);
                        carry=0;
                    }else{
                        value++;
                        if(value==10){
                            carry = 1;
                            strb.append('0');
                        }
                        else {
                            carry=0;
                            strb.append(value);
                        }
                    }
                }
            }
            if(carry==1)
                strb.append('2');
            strb.reverse();
        }
        else {
        for(int i=0;i<str.length();i++){
            int value = Character.getNumericValue(str.charAt(i));
            if(value%2 != 0)
            {
                strb.append(value + 1);
                    for(int j = i+1;j<str.length();j++)
                        strb.append('0');
                    break;
            }else{
                strb.append(value);
            }
        }
        }
        return Integer.valueOf(strb.toString());
    }

    public  static int getPrevNumber(String str){
        StringBuilder strb = new StringBuilder();
        if(str.contains("0"))
        {
            int init = str.indexOf('0');
            for(int i = 0; i< init; i++) {
                int value = str.charAt(i);
                if(value%2==0)
                    strb.append(value);
                else
                    strb.append(Character.getNumericValue(value) - 1);
            }
            for(int i =init;i<str.length();i++)
                strb.append('8');
        }
        else if(str.contains("1")){
            int init = str.indexOf('1');
            if(init==0){
                for(int i = init+1;i<str.length();i++)
                    strb.append('8');
            }else{
                for(int i=0; i<init - 1;i++){
                    int value = str.charAt(i);
                    if(value%2==0)
                        strb.append(value);
                    else
                        strb.append(Character.getNumericValue(value) - 1);
                }
                int value = str.charAt(init-1);
                if(value%2==0)
                    strb.append(value);
                else
                    strb.append(Character.getNumericValue(value) - 1);
                strb.append('0');
                for(int i=init+1;i<str.length();i++)
                    strb.append('8');

            }

        } else
        for(int i=0;i<str.length();i++){

            int value = Character.getNumericValue(str.charAt(i));
            if(value%2 != 0)
            {
                strb.append(value - 1);
            }else{
                strb.append(str.charAt(i));

            }
        }
        return Integer.valueOf(strb.toString());
    }

    private static int findGCD(int number1, int number2) {
        if(number2 == 0){
            return number1;
        }
        return findGCD(number2, number1%number2);
    }

}