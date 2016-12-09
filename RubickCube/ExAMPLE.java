package RubickCube;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExAMPLE {
    public static void main(String args[] ) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        int a=Integer.parseInt(line.split(" ")[0]);
        int b=Integer.parseInt(line.split(" ")[1]);
        int c=Integer.parseInt(line.split(" ")[2]);
        int d=Integer.parseInt(line.split(" ")[3]);

        if(a-(b+c+d)>=2 || b-(a+c+d)>=2 || c-(a+b+d)>=2|| d-(a+b+c)>=2)
        {
            System.out.println(0);
            return;
        }
        int aa = a;
        int bb = b;
        int cc = c;
        int dd = d;
        
        long count = 1;
        while(aa>0||bb>0||cc>0||dd>0){
            if(aa>0){
                
                
                if(bb>0){
                
                
                    if(cc>0){
                
                        if(dd>0){
                            if(count==1)
                              count *= 4;
                            else count*=3;
                            aa--;bb--;cc--;dd--;
                        }else{
                            if(count==1)
                                count *= 3;
                            else count*=2;
                            aa--;bb--;cc--;
                        }
                
                
                    }else if(dd>0){
                        if(count==1)
                            count *= 3;
                        else count*=2;
                        aa--;bb--;dd--;
                    }else {
                        if(count==1)
                            count *= 2;
                        else count*=1;
                        aa--;bb--;
                    }
                
                
                }else if(cc>0){
                    if(dd>0){
                        if(count==1)
                            count *= 3;
                        else count*=2;
                        aa--;cc--;dd--;
                    }else{
                        if(count==1)
                            count *= 2;
                        else count*=1;
                        aa--;cc--;
                    }
                }else if(dd>0){
                    if(count==1)
                        count *= 2;
                    else count*=1;
                    aa--;dd--;
                }else {
                    if(count==1)
                        count *= 1;
                    else count*=0;
                    aa--;
                }
                
            
            
            }else if(bb>0){
                if(cc>0){

                    if(dd>0){
                        if(count==1)
                            count *= 3;
                        else count*=2;
                        bb--;cc--;dd--;
                    }else{
                        if(count==1)
                            count *= 2;
                        else count*=1;
                        bb--;cc--;
                    }


                }else if(dd>0){
                    if(count==1)
                        count *= 2;
                    else count*=1;
                    bb--;dd--;
                }else {
                    if(count==1)
                        count *= 1;
                    else count*=0;
                    bb--;
                }
            }else if(cc>0){
                if(dd>0){
                    if(count==1)
                        count *= 2;
                    else count*= 1;
                    cc--;dd--;
                }else{
                    if(count==1)
                        count *= 1;
                    else count*=0;
                    cc--;
                }
            }else if(dd>0){
                if(count==1)
                    count *= 1;
                else count*=0;
                dd--;
            }else {
                if(count==1)
                    count *= 0;
                else count*=0;
            }
            
        }
        System.out.println(count);
    }

}