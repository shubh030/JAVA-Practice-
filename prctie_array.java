public class prctie_array{
    public static void main(String[] args) {
        // //xxx PROBLEM 1
        // float[] arr = new float[5];
        // arr[0]=25f;
        // arr[1]=56f;
        // arr[2]=64f;
        // arr[3]=45f;
        // arr[4]=23f;
        // System.out.println(arr[0]+arr[1]+arr[2]+arr[3]+arr[4]);

        //XXXXX  PROBLEM 2    XXXXXX

//         float a[]={92f,44f,56f,64f,23f};
//         float sum=0.0f;
// for(float add:a){
//     sum=sum+add;
// }
// System.out.println("Addtion of all arry is:"+sum);
// System.out.println(add);
// System.out.println



// xxx  PRBLEM 3   XXX
// float a[]={92f,44f,56f,64f,23f};
// for(float add:a){
// System.out.println(add);
// }






//xxxx PRBLEM 4 XXX

// int b[]={86,26,74,36,46,};
// int num =75;
// boolean isinarryarray = false;
// for(int element:b) {
//     if(num==element)
//     {
//         isinarryarray = true;
//         break;
//     }
// }
//     if(isinarryarray)
//     {
//         System.out.println("number is in the arrya");
//     }
//     else{
//         System.out.println("number is not in the arrya");
//     }


// xxx  PRBLEM 5   XXX

// int marks[]={56,70,60,30,56};
// int sum = 0;
// for(int element:marks)
// {
//     sum =sum+element;
// }
// int average=sum/marks.length;
// System.out.println("avrage marks is:"+average);





//XXX  PROBEM 6   XXX


int[][]mat1={{1,2,3},
            {4,5,6}};
int [][]mat2={{4,5,6},
            {1,2,3}};         

int [][]result={{0,0,0},
            {0,0,0}};

for(int i=0;i<mat1.length;i++)
    for(int j=0;j<mat1[i].length;j++)
    {
        result[i][j] = mat1[i][j]+mat2[i][j];
        System.out.print(result[i][j]);
    
    }
    System.out.println("");
}



}


    
