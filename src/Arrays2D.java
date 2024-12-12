public class Arrays2D {
    int[][] nums = new int[4][5];

    public static void main(String[] args) {
        Arrays2D a2d = new Arrays2D();
    }
    public Arrays2D(){
        for(int r = 0; r < nums.length; r++){
            // length gives you how many rows you have
            for(int c = 0; c < nums[r].length; c++) {
                nums[r][c] = (int) (Math.random() * 101);
            }
        }
        printArray();
        System.out.println(sum2D());
        System.out.println(avg2D());
    }

    public void printArray(){
        for(int r = 0; r < nums.length; r++){
            // length gives you how many rows you have
            for(int c = 0; c < nums[r].length; c++) {
                System.out.print(nums[r][c] + " ");
            }
            System.out.println();
        }
    }

    public int sum2D(){
        int sum = 0;
        for(int r = 0; r < nums.length; r++){
            for(int c = 0; c < nums[r].length; c++) {
                sum += nums[r][c];
            }
        }
        return sum;
    }

    public double avg2D(){
        int size = nums.length * nums[0].length;
        return sum2D()/size;
    }
}
