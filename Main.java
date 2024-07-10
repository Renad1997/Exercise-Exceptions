import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);


    /*1-lap1*/
//        System.out.println("Enter first number:");
//        try{
//            int number1 = input.nextInt();
//            System.out.println("Enter second number:");
//            int number2 = input.nextInt();
//            System.out.println(number1+"+"+number2+"="+(number1+number2));
//            System.out.println(number1+"-"+number2+"="+(number1-number2));
//            System.out.println(number1+"*"+number2+"="+(number1*number2));
//            System.out.println(number1+"/"+number2+"="+(number1/number2));
//            System.out.println(number1+"mod"+number2+"="+(number1%number2));
//        }catch(InputMismatchException e){  // letter-Zero
//            System.out.println(e.getMessage());
//        }
        /*2-lap1*/
//        System.out.println("Input number:");
//        try{
//            int num = input.nextInt();
//            for (int i = 1; i <=10 ; i++) {
//                System.out.println(num+"*"+i+"="+ num*i);
//            }
//        }catch(InputMismatchException e){
//            System.out.println(e.toString());
//        }
        /*3-lap1*/
//        System.out.println("Enter the radius:");
//        try {
//            double radius = input.nextDouble();
//            double perimeter = 2 * Math.PI * radius;
//            double area = Math.PI * radius * radius;
//            System.out.println("Radius="+radius);
//            System.out.println("Perimeter is= "+perimeter);
//            System.out.println("Area is= "+area);
//        }catch (InputMismatchException e){
//            System.out.println(e.toString());
//        }
        /*4-lap1*/
//        System.out.println("Enter the count of numbers:");
//        try{
//            double num2= input.nextDouble();
//            double score=0;
//            double sum=0;
//            while (score != -1){
//                System.out.println("Enter an integer:");
//                score=input.nextDouble();
//                sum+=score;
//            }
//            System.out.println("The average is:"+ (sum/num2));
//        }catch(InputMismatchException e){
//            System.out.println(e.getMessage());
//        }
      /*5-lap1*/
//        int sum1=0;
//        System.out.println("Input the first number: ");
//        try{
//            int first = input.nextInt();
//            System.out.println("Input the second number: ");
//            int second = input.nextInt();
//            System.out.println("Input the third number: ");
//            int third = input.nextInt();
//            sum1=first+second;
//            boolean test=(sum1==third);
//            System.out.println("The result is: "+test);
//        }catch (InputMismatchException e){
//            System.out.println(e.getMessage());
//        }
        /*6-call*/
//        System.out.println("Input a word:");
//        String word=input.nextLine();
//        try{
//            reverseWord(word);
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//        System.out.println(word);

     /*7-lap1*/
//        System.out.println("Enter a number:");
//        try{
//            int n = input.nextInt();
//            if (n % 2 == 0) {
//                System.out.println("The number is Even");
//            }else{
//                System.out.println("The number is Odd");
//            }
//        }catch (InputMismatchException e){
//            System.out.println(e.toString());
//        }
        /*8-lap1*/
//        System.out.println("Enter temperature in Centigrade:");
//        try {
//            double temperature = input.nextDouble();
//            double result= (temperature*9/5+32);
//            System.out.print("Temperature in Fahrenheit is: ");
//            System.out.println(result);
//        }catch (InputMismatchException e) {
//            System.out.println(e.getMessage());
//        }

      /*9-call*/
//        System.out.println("Input a string: ");
//        String str = input.nextLine();
//        System.out.println("Input a number: ");
//        int val = input.nextInt();
//      try {
//          checkString(str,val);
//      }catch(Exception e) {
//          System.out.println(e.getMessage());
//      }

        /*10-call*/
//        System.out.print("Width= ");
//        float width=input.nextFloat();
//        System.out.print("Height= ");
//        float height=input.nextFloat();
//        try {
//            rectangle(width,height);
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }



    }
    /*6-lap1*/
//    public static void reverseWord(String word)throws Exception{
//        String z = "";
//        char c;
//        for (int i = 0; i < word.length(); i++) {
//            c = word.charAt(i);
//            z = c + z;
//        }
//        if(z.length() >=6 ){
//            throw new Exception("invalid");
//        }
//        System.out.println("Reverse word: "+z);
//    }






    /*9-lap1*/
//    public  static void checkString(String str ,int val) throws Exception{
//        char ch =0;
//        ch = str.charAt(val);
//        System.out.println(ch);
//        if(str.length()>val){
//            throw new Exception("String index out of range ");
//        }
//    }


    /*10-lap1*/
//   public static void rectangle(float width,float height)throws Exception {
//       if (width<=0 && height<=0){
//           throw new Exception("width and height must be greater than 0");
//       }
//       System.out.print("Area is "+width+" * "+height+" = ");
//       float area1=width*height;
//       System.out.println(area1);
//       System.out.print("Perimeter is 2"+" * "+"("+width+" + "+height+")"+" = ");
//       float perimeter1=2*(width+height);
//       System.out.println(perimeter1);
//
//   }




}