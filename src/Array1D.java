public class Array1D {
    int[] numbers = new int[10];

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Array1D a1d = new Array1D();
    }

    public Array1D(){
        numbers[0] = 54;
        for(int i = 0; i < 10; i++){
            int temp = (int)(Math.random() * 101);
            numbers[i] = temp;
        }
        printArray();
        System.out.println(sumArray());
        System.out.println(avgArray());
    }

    public void printArray(){
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }

    public int sumArray(){
        int sum = 0;
        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        return sum;
    }

    public double avgArray(){
        int sum = sumArray();
        return ((double) sum /numbers.length);
    }
}
