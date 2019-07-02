


public class Task_15 {
    public static void main(String[] args) {
        int []a=new int [] {34,67,32,76,32,8,5,21,69,43};

        for (int i=0; i<a.length; i++){
            for (int j=0; j<a.length-1; j++){
                if(a[j]>a[j+1]){
                    int d =a[j];
                    a[j]=a[j+1];
                    a[j+1]=d;
                }
            }
        }
        System.out.println ( "отсортированный массив : ");
        for (int i=0; i<a.length; i++){
            System.out.printf(a[i] + " ");
        }
    }

}