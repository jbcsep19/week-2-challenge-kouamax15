import java.util.Random;
public class RandomBorrito {
    public static void main (String[] args){
        String[] rice = {"white rice", "brown rice", "no rice"};
        String[] beat = {"chicken", "steak", "carnidas", "chorizo", "sofritas", "veggies"};
        String[] beans = {"pinto", "black", "no beans"};
        String[] Salsa = {"mild", "medium", "hot", "no salsa"};
        String[] veggies = {"lettuce", "fajita", "veggies", "no veggies"};
        Random r = new Random();
        int index;
        for (int b = 1; b< rice.length ; b++) {
            System.out.print( rice[b] + ",");
            index = 0 + r.nextInt(3);
            System.out.print(rice[index]);
        }
        }

    }


//    String[] borrito = {"white rice", "carnidas meat", "no beans", "hot salsa", "no veggies"};
//    String[] rice = {"white", "brown", "no rice"};
//    String[] beat = {"chicken", "steak", "carnidas", "chorizo", "sofritas", "veggies"};
//    String[] beans = {"pinto", "black", "no beans"};
//    String[] Salsa = {"mild", "medium", "hot", "no salsa"};
//    String[] veggies = {"lettuce", "fajita", "veggies", "no veggies"};
//    Random r = new Random();
//    int index;
//    for (int b = 0; b< borrito.length ; b++) {
//        System.out.print("Borrito: " + (borrito[b] + ","));
//        index = 0 + r.nextInt(5);
//        for (int r = 0; b< rice.length; r++){
//            System.out.print("Rice: " + (rice[r] + ","));
//            index = 0 + r.nextInt(5);
//        }

//}



        //import java.util.Random;
///for (row = 1; row <= MAX; row++){
//            for (column = 1; column <= MAX; column++){
//                System.out.print(row * column + "\t");/
// public class RandomWeekDay {
////    public static void main (String[] args){
////        String[] weekDays = {"Mon", "Tues", "Wed", "Thur", "Fri", "Sat", "Sun"};
////        Random r = new Random();
////        int index;
////
////        for (int counter = 1; counter <=10 ; counter++) {
////                index = 0 + r.nextInt(7);
////                System.out.println(weekDays[index]);
////                System.out.println("Generated number: " + index);
////        }
////        System.out.println("Have a nice day!");
//public class RandomnessGenerator {
//    public static void main(String[] args)
//    {
//        Random r = new Random();
//        int randomInt;
//
//
//        for ( int counter  = 1; counter <=10; counter++) {
//            randomInt = 1 + r.nextInt(6);
//            System.out.println("Generated number: " + randomInt);
//        }
//        System.out.println("Done!");
//    }
//
//    private static void output(String aMessage){
//
//    }
//
//}
