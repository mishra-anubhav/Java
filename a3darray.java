class a3array{
    public  static void main(String[] args) {
int a[][][]=new int[3][4][5];   //Initialization
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                for(int k=0;k<5;k++){
            a[i][j][k]=i+j+k;  
        }
    }
}
        //Avg Calc
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                for(int k=0;k<5;k++){
            System.out.print(a[i][j][k] +" ");  //Printing array
      
        }      System.out.println();
    }
    System.out.println();  //Printing array

    }
}
}