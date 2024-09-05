import java.text.NumberFormat.Style;
import java.util.Arrays;
import java.util.Scanner;
public class accenture1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int[] arr={10,3,2,4,5,6,9,7,3};
        int ans1=Integer.MAX_VALUE;
        int ans2=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=x || arr[i]!=y){
                System.out.print("-1");
                return;
            }
            if(arr[i]==x||arr[i]==y){
                if(arr[i]==x){
                    for(int j=0;j<arr.length;j++){
                        if(arr[j]==y){
                            ans1=Math.min(ans1,Math.abs(j-i)-1);
                        }
                    }
                }
                if(arr[i]==y){
                    for(int j=0;j<arr.length;j++){
                        if(arr[j]==x){
                            ans2=Math.min(ans2, Math.abs(j-i)-1);
                        }
                    }
                }
            }
            else{
                System.out.println("-1");
                return;
            }
        }
        System.out.println(Math.min(ans1,ans2));




        // int ans=fact(n)/fact(m);
        // System.out.print(ans);
        

    }


        // int[] arr=new int[n];
        // int max=Integer.MIN_VALUE;
        // for(int i=0;i<n;i++){
        //     int temp=sc.nextInt();
        //     if(temp>max){
        //         max=temp;
        //     }
        // }
        // System.out.println(max);
        // Arrays.sort(arr);
        // System.out.println(arr[n-1]);

        // public static int fact(int n){
        //     if(n==0||n==1){
        //         return 1;
        //     }
        //     return n*fact(n-1);
        // }

        // int num=123456;
        // int odd=0,even=0;
        // while(num>0){
        //     int rem=num%10;
        //     if(rem%2==0){
        //         even+=rem;
        //     }
        //     else{
        //         odd+=rem;
        //     }
        //     num=num/10;
        // }
        // System.out.println(Math.max(odd, even));





        // int[] arr=new int[26];
        // String str=sc.nextLine();
        // float sum=0;
        // for(int i=0;i<str.length();i++){
        //     sum+=str.charAt(i);
        // }
        // float avg=sum/str.length();
        // System.out.printf("%.2f",avg);


        // for(int i=0;i<26;i++){

            // if(arr[i]==1){
            //     System.out.println((char)(i+97));
            // }
                //System.out.println("character "+ (char)(i+97)+" "+ arr[i]);
            //}

        // int n=sc.nextInt();
        // int[] arr=new int[n];
        // for(int i=0;i<n;i++){
        //     arr[i]=sc.nextInt();
        // }
        // int max=Integer.MIN_VALUE;
        // int sum=0;
        // for(int i=n-1;i>=0;i--){
        //     if(arr[i]>max){
        //         max=arr[i];
        //         sum+=arr[i];
        //     }
        // }

        // for(int i=0;i<n;i++){
        //     int flag=0;
        //     for(int j=i+1;j<n;j++){
        //         if(arr[j]>arr[i]){
        //             flag=1;
        //             break;
                    
        //         }
        //     }
        //     if(flag==0){
        //         sum+=arr[i];
        //     }
        // }
        //System.out.println(sum);



        // String str=sc.nextLine();
        // StringBuilder sb=new StringBuilder(str);
        // String reversed= sb.reverse().toString();
        // int i=0;
        // int j=0;
        // while(i<str.length()){
        //     if(str.charAt(i)!=reversed.charAt(j)){
        //         i++;
        //     }
        //     else{
        //         i++;
        //         j++;
        //     }
        // }
        // for(int k=j;k<reversed.length();k++){
        //     System.out.print(reversed.charAt(k));
        // }

        // String str=str1.replace("A","&").replace("B", "|").replace("C", "^");
        // int result=Character.getNumericValue(str.charAt(0));

        // for(int i=1;i<str.length();i+=2){
        //     char operator=str.charAt(i);
        //     int nextNum=Character.getNumericValue(str.charAt(i+1));

        //     switch(operator){
        //         case '&':
        //             result&=nextNum;
        //             break;
        //         case '|':
        //             result|=nextNum;
        //             break;
        //         case '^':
        //             result^=nextNum;
        //             break;
        //     }
        // }
        // String binaryresult=Integer.toBinaryString(result);
        // System.out.println(binaryresult);
        // System.out.println(result);

    //     int n=sc.nextInt();
    //     int[] arr=new int[n];
    //     for(int i=0;i<n;i++){
    //         arr[i]=sc.nextInt();
    //     }
    //     int k=sc.nextInt();

    //     rotate(arr,0,n-1);
    //     rotate(arr,0,k-1);
    //     rotate(arr,k,n-1);

    //     for(int i=0;i<n;i++){
    //         System.out.print(arr[i]+ " ");
    //     }


    // }
    // public static void rotate(int[] arr,int start,int end){
    //     while(start<=end){
    //         int temp=arr[start];
    //         arr[start]=arr[end];
    //         arr[end]=temp;
    //         start++;
    //         end--;
    //     }
    // }
        // int airTime=sc.nextInt();
        // int size=sc.nextInt();
        // int[] songs=new int[size];
        // for(int i=0;i<size;i++){
        //     songs[i]=sc.nextInt();
        // }
        // int count=0;
        // for(int i=0;i<size-2;i++){
        //     for(int j=i+1;j<size-1;j++){
        //         for(int k=j+1;k<size;k++){
        //             if(songs[i]+songs[j]+songs[k]==airTime){
        //                 count++;
        //             }
        //         }
        //     }
        // }
        // System.out.println(count);
    //     int n=sc.nextInt();
    //     int count=0;
    //     for(int i=0;i<n;i++){
    //         int temp=sc.nextInt();
    //         if(good(temp)){
    //             count++;
    //         }
    //     }
    //     System.out.println(count);
    // }

    // public static boolean good(int temp){
    //     for(int i=1;i<temp;i++){
    //         for(int j=i+1;j<temp;j++){
    //             if((i*i*i)+(j*j*j)==temp){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }
        // int a=10;
        // int b=20;
        // int temp=0;
        // temp=a;
        // a=b;
        // b=temp;
        // System.out.println("New A "+a);
        // System.out.println("New B "+b);
        // int english=sc.nextInt();
        // int math=sc.nextInt();
        // int science=sc.nextInt();
        // int hindi=sc.nextInt();
        // grade(english);
        // grade(math);
        // grade(science);
        // grade(hindi);
        // int arr[]=new int[6];
        // for(int i=0;i<6;i++){
        //     arr[i]=sc.nextInt();
        // }
        // int max=Integer.MIN_VALUE;
        // int min=Integer.MAX_VALUE;
        // for(int i=0;i<6;i++){
        //     if(arr[i]>max ){
        //         max=arr[i];
        //     }
        //     if(arr[i]<min && arr[i]>0){
        //         min=arr[i];
        //     }
        // }
        // System.out.println(max);
        // System.out.println(min);
        
        
        // int length1=sc.nextInt();
        // int length2=sc.nextInt();
        // int k=sc.nextInt();
        // int arr1[]=new int[length1];
        // int arr2[]=new int[length2];
        // for(int i=0;i<length1;i++){
        //     arr1[i]=sc.nextInt();
        // }
        // for(int i=0;i<length2;i++){
        //     arr2[i]=sc.nextInt();
        // }
        // System.out.println(comp(arr1, arr2, length1, length2, k));
        // int size=sc.nextInt();
        // int arr[]=new int[size];
        
        // for(int i=0;i<size;i++){
        //     arr[i]=sc.nextInt();
        // }
        // int n=sc.nextInt();
        // System.out.println("Least absolute difference is: "+ diff(arr,size,n));

        //THIS IS INCOMPLETE AND WRONG
        // int n=sc.nextInt();
        // int nlen=String.valueOf(n).length();
        // int square=n*n;
        // int len=String.valueOf(square).length();
        // int count=0;
        // String squareString=String.valueOf(square);
        // StringBuilder sb=new StringBuilder(nlen);
        // int[] right=new int[];
        // for(int i=len-1;i>=nlen;i--){
        //     sb.append(squareString.charAt(i));
        // }

        // int num=sc.nextInt();
        // int n=sc.nextInt();
        // int rem=num%n;
        // int x=num+rem;
        // int y=num-rem;
        // int largest=0,smallest=0;
        // if(x%n==0){
        //     System.out.println(x);
        // }
        // else if(y%n==0){
        //     System.out.println(y);
        // }

        // int size=sc.nextInt();
        // int[] arr=new int[size];
        // for(int i=0;i<size;i++){
        //     arr[i]=sc.nextInt();
        // }
        // int p1=0;
        // int p2=size-1;
        // while(p1<p2){
        //     while(arr[p1]%2==0 && p1<p2){
        //         p1++;
        //     }
        //     while(arr[p2]%2!=0 && p1<p2){
        //         p2--;
        //     }
        //     if(p1<p2){
        //         int temp=arr[p1];
        //         arr[p1]=arr[p2];
        //         arr[p2]=temp;
        //     }
        // }
        // for(int i=0;i<size;i++){
        //     System.out.print(arr[i]+ " ");
        // }

    

    // public static int diff(int[] arr, int size,int n){
    //     int min=Integer.MAX_VALUE;
    //     int temp=0;
    //     for(int i=0;i<size;i++){
    //         if(Math.abs(arr[i]-n) < min){
    //             min=Math.abs(arr[i]-n);
    //             temp=arr[i];

    //         }
    //     }
    //     return temp;

    // }












    // public static int comp(int[] arr1, int[] arr2,int len1,int len2, int k ){
    //     int c1=0, c2=0;
    //     for(int i=0;i<len1;i++){
    //         if(arr1[i]>k){
    //             c1++;
    //         }
    //     }
    //     for(int i=0;i<len2;i++){
    //         if(arr2[i]<k){
    //             c2++;
    //         }
    //     }

    //     return Math.max(c1, c2);
    // }   
    //     String str=sc.next().toUpperCase();
    //     int sum=0;
    //     for(int i=0;i<str.length();i++){
    //         if(str.charAt(i)=='A'){
    //             sum+=1;
    //         }
    //         else if(str.charAt(i)=='B'){
    //             sum+=10;
    //         }
    //         else if(str.charAt(i)=='C'){
    //             sum+=100;
    //         }
    //         else if(str.charAt(i)=='D'){
    //             sum+=1000;
    //         }
    //         else if(str.charAt(i)=='E'){
    //             sum+=10000;
    //         }
    //         else if(str.charAt(i)=='F'){
    //             sum+=100000;
    //         }
    //         else if(str.charAt(i)=='G'){
    //             sum+=1000000;
    //         }
    //         else{
    //             sum+=0;
    //         }
    //     }
    // System.out.println(sum);
        // int n=sc.nextInt();
        // int solution=n*(n*3+1)/2;
        // System.out.println(solution);
        
        
        // int size=sc.nextInt();
        // int arr[]=new int[size];
        // for(int i=0;i<size;i++){
        //     arr[i]=sc.nextInt();
        // }
        // int num=sc.nextInt();
        // int diff=sc.nextInt();
        // int count=0;
        // for(int i=0;i<arr.length;i++){
        //     if(Math.abs(num-arr[i])<=diff){
        //         count+=1;
        //     }
        // }
        // if(count==0){
        //     System.out.println(-1);
        // }
        // System.out.println("Count :"+count);
        
}
    // public static void grade(int marks){
    //     if(marks>=90){
    //         System.out.println("O grade");
    //     }
    //     else if(marks>=80 && marks<90){
    //         System.out.println("A grade");
    //     }
    //     else if(marks>=70 && marks<80){
    //         System.out.println("B grade");
    //     }
    //     else if(marks>=60 && marks<70){
    //         System.out.println("C grade");
    //     }
    //     else if(marks>=50 && marks<60){
    //         System.out.println("D grade");
    //     }
    //     else{
    //         System.out.println("F grade");
    //     }
    // }
// }
