class FirstJavaPro{
    public  static void main(String[] args) {
int a[]={10,20,30,40,50};   //Initialization
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);  //Printing array
        }
        //Avg Calc
        int sum=0,avg;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        avg=sum/a.length;
        System.out.println(avg);  //Printing array
    }
}