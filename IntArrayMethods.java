public class IntArrayMethods{

    public static int arraySum(int[] a){
        int sum =0;
        for(int i =0; i<a.length;i++){
            sum+=a[i];
        }
        return sum;
    }
  
    public static double arrayMean(int[] a){
        double sum =0;
        for(int i =0; i<a.length;i++){
            sum+=a[i];
        }return sum/a.length;
    }
  
    public static int arrayMin(int[] a){
        int min=100;
        for(int i =0; i<a.length;i++){
           if(a[i]<min){
            min=a[i];
           } 
        }
        return min;
    }
  

public static int arrayMax(int[] a){
    int max=00;
        for(int i =0; i<a.length;i++){
           if(a[i]>max){
            max=a[i];
           } 
        }
        return max;
}

public static boolean[] arrayLocalMin(int[] a){
   boolean [] b = new boolean[a.length];
    b[0]=a[0]<a[1];

    for(int i =1; i<a.length-1;i++){
            b[i]=a[i]<a[i-1] && a[i]<a[i+1];
        }
    b[a.length-1]=a[a.length-1]<a[a.length-2];
    return b;
}


public static boolean[] arrayLocalMax(int[] a){
  boolean [] c = new boolean[a.length];
    c[0]=a[0]>a[1];

    for(int i =1; i<a.length-1;i++){
            c[i]=a[i]>a[i-1] && a[i]>a[i+1];
        }
    c[a.length-1]=a[a.length-1]>a[a.length-2];
    return c;
}

public static int arrayMode(int[] a){
    int mode;
    int num=0;
    int index=0;
    int maxIndex=0;
    int max=0;
    for(mode=0;mode<a.length;mode++){
        for(int i =0;i<a.length;i++){
            if(a[mode]==(a[i])){
                index=i;
                num++;
            }
        
        }
        if(num>max){
            maxIndex=index;
            max=num;
            num=0;
        }else{
            index=0;
            num=0;
        }
}
return a[maxIndex];
}
 
public static int arrayCount(int[] a, int b){
     int sum=0;
     for(int i =0;i<a.length;i++){
        if(a[i]==b){
            sum++;
        }
    }
    return sum;
}

public static boolean arrayContainsDuplicates(int[] a){
    
    int num=0;
    int index;
    int maxIndex;
    int max=0;
    if(a.length<2){
        return false;
    }
    for(int mode=0;mode<a.length;mode++){
        for(int i =0;i<a.length;i++){
            if(a[mode]==(a[i])){
                return true;
            }
        
        }
        
}
return false;
}

public static boolean arrayAllEqual(int[] a){
  for(int i =0;i<a.length;i++){
    if(a[0]==a[i]){

    }
    else{
        return false;
    }
    
  }
return true;
}

public static double[] arrayRollingAverage(int[] a, int b){

    double[]c=new double[a.length];
    int index;
    double sum=0;
    int count=0;
    if(a==null || a.length==0 || b<=0){
        return new double[0];
    }
    for(int i =0; i<b && i<a.length;i++){
        sum+=a[i];
        c[i]=sum/(i+1);
    }
    for(int i =b; i<a.length;i++){
        sum+=a[i];
        sum-=a[i-b];
        c[i]=sum/b;
    }
    return c;
}
  

public static int[] arrayShift(int[] a, int b){
    int [] c = new int[a.length];
    int index;
    int sum;
    for(int i =0; i<a.length;i++){
        if((i+b)>a.length-1){
            index=i+b-a.length;
        }else{
            index=i+b;
        }
        c[index]=a[i];
    }
    return c;
}
  

public static int[] arrayReverse(int[] a){
    int[] c = new int[a.length];
    for(int i =0; i<a.length;i++){
        c[i]=a[a.length-1-i];
        
    }
    return c;
}
  

}