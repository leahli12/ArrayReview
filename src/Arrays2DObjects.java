public class Arrays2DObjects {
    Country[][] countries2D = new Country[4][5];

    public static void main(String[] args) {
        Arrays2DObjects a2do = new Arrays2DObjects();
    }

    public Arrays2DObjects(){
        for(int r = 0; r < countries2D.length; r++){
            for (int c = 0; c < countries2D[r].length; c++){
                countries2D[r][c] = new Country();
                countries2D[r][c].setPop((int)(Math.random() * 1001));
            }
        }
        printArray();
        System.out.println(addPop());
        System.out.println(avgPop());
    }

    public void printArray(){
        for(int r = 0; r < countries2D.length; r++){
            for (int c = 0; c < countries2D[r].length; c++){
//                countries2D[r][c].printInfo();
                System.out.print(countries2D[r][c].getPop() + " ");
            }
            System.out.println();
        }
    }

    public int addPop(){
        int sum = 0;
        for(int r = 0; r < countries2D.length; r++){
            for (int c = 0; c < countries2D[r].length; c++){
                sum += countries2D[r][c].getPop();
            }
        }
        return sum;
    }

    public double avgPop(){
        int size = countries2D.length * countries2D[0].length;
        return addPop()/size;
    }
}
