public class Main {

    public static void main(String[] args) {
        int valA = 21;
        int valB = 6;
        int valC = 3;
        int valD = 1;

        int result1 = valA - valB / valC;

        int result2 = (valA - valB) / valC;

        System.out.println(result1); //19
        System.out.println(result2); //5

        int result3 = valA / valC * valD + valB; //13
        int result4 = valA / (valC * (valD + valB)); //1
    }
}
