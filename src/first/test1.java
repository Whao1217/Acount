package first;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Random;
import java.util.Scanner;
public class test1 {
    static Scanner sc = null;
    public static int s1 = new Random().nextInt(100);
    public static int s2 = new Random().nextInt(100);
    public static int s3 = new Random().nextInt(100);
    public static int a[][]=new int[100000][2] ;//用于从操作数
 
    public static int s[]=new int[100000];//用于存操作符
 
    public static void main(String[] args) throws FileNotFoundException {
    	
    	FileOutputStream fos=new FileOutputStream ("D:/test.csv");
    	
        sc = new Scanner(System.in);
        System.out.println("请输入题数：");
        int n=sc.nextInt();
        System.out.println("请输入每行的题数：");
        int m=sc.nextInt();
 
        for(int i=0;i<n;i++) {
            if((i)%m==0)
                System.out.print("\n");
            System.out.print((i+1)+":");
 
            //产生随机数
            s1 = new Random().nextInt(100);
            System.out.print(s1);
            s2 = new Random().nextInt(100);
            s3 = new Random().nextInt(100);            
 
            //检查重复
                a[i][0]=s1;
                a[i][1]=s3;
                s[i]=s2;
            for(int j=0;j<i;j++) {
                if(a[j][0]==s1&&a[j][1]==s3&&s[j]==s2) {
                    s3 = new Random().nextInt(100);
                    while(s3==a[i][1]) {
                        s3 = new Random().nextInt(100);
                }
                s3 = new Random().nextInt(100);
                while(s3==a[i][1]) {
 
                }
            }}
 
            //判断操作符
            if(s2%4==0)
                System.out.print("+");
            if(s2%4==1) {
                System.out.print("-");
 
                    while(s1<s3) {
                        s3 = new Random().nextInt(100);
                    }
 
            }
 
            if(s2%4==2) {
                System.out.print("*");
                while(s1*s3>=100) {
                    //s1 = new Random().nextInt(100);
                    s3 = new Random().nextInt(100);
                }
            }
 
            if(s2%4==3) {
                System.out.print("/");
                while(s3!=0&&s1/s3!=0){
                    //s1 = new Random().nextInt(100);
                    s3 = new Random().nextInt(100);
                }
            }
 
            System.out.print(s3);
            System.out.print("=");
            System.out.print(" "+'\t');
        }
 
    }
 
}