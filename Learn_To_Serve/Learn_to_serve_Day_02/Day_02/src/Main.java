

public class Main {
    public static void main(String[] args) throws CustomException {

        System.out.println("Hello world!");
        try {
            int[] array = new int[5];
            //System.out.println(array[7]);//unchecked exception
            Exception();
        } catch (Exception e) {
            System.out.println(e);
        }
        throw new CustomException("This is my error");
    }

    public static int[] Exception() throws IndexOutOfBoundsException {
        int[] array = new int[5];
        return new int[]{array[8]};
    }
}

class CustomException extends Exception{
    public CustomException(String s){
        super (s);
    }
}