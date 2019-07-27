public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");
//        int[] arr = { 1, 2, 9, 4, 5, 0, 4, 11, 6 };
//        int[] arr = { -3,-4,-5,-11,0};
        int[] arr = {4,1,1,4,2,1 };
//        int[] arr = {4,5,4,3};
        int n = arr.length;
        int incl=arr[0];
        int exl=0;
        int temp;
        String inclout=""+arr[0];
        String exlOut="";
        String tempStr;

        for (int i = 1; i < arr.length; i++) {
            temp=incl;
            tempStr=inclout;
            ////////////////////////////////
            int t2=exl+arr[i];
            if(t2>=incl){
                inclout=exlOut+arr[i];
            }else{
                inclout=inclout;
            }

            ///////////////////////////////

            incl=Integer.max(incl,exl+arr[i]);

            exl=temp;
            exlOut=tempStr;
            System.out.println("==========================");
            System.out.println(arr[i]);
            System.out.println("exlOut : "+exlOut);
            System.out.println(exl);
            System.out.println("inclout : "+inclout);
            System.out.println(incl);

        }

        System.out.println("Maximum non contiguous sum is "+
                Integer.max(incl,exl));
        inclout=reverseString(inclout);
        exlOut=reverseString(exlOut);
        if (exl>incl){
            System.out.println(exlOut);
        }else if(exl<incl){
            System.out.println(inclout);
        }
        else{
            if(Integer.parseInt(exlOut)>Integer.parseInt(inclout)){
                System.out.println(exlOut);
            }else{
                System.out.println(inclout);
            }
        }
    }


    public static String  reverseString(String input){
        byte [] strAsByteArray = input.getBytes();

        byte [] result =
                new byte [strAsByteArray.length];

        // Store result in reverse order into the
        // result byte[]
        for (int i = 0; i<strAsByteArray.length; i++)
            result[i] =strAsByteArray[strAsByteArray.length-i-1];

        return new String(result);
    }


}
