public class Array1DObjects {
    Country[] countries = new Country[10];

    public static void main(String[] args) {
        Array1DObjects obj = new Array1DObjects();
    }
    public Array1DObjects(){
        Country us = new Country();
        us.printInfo();

        for (int i = 0; i < 10; i++) {
            countries[i] = new Country();
            countries[i].setPop((int)(Math.random() * 1001));
        }
        printArray();
        System.out.println(addPops());
        System.out.println(averagePops());
    }

    public void printArray(){
        for(int i = 0; i < countries.length; i++){
            countries[i].printInfo();
        }
    }

    public int addPops(){
        int sum = 0;
        for(int i = 0; i < countries.length; i++){
            sum += countries[i].getPop();
        }
        return(sum);
    }

    public int averagePops(){
        int average = addPops()/countries.length;
        return average;
    }
}
