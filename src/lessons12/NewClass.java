package lessons12;

public class NewClass {


    public static int countingValleys(int steps, String path) {
        int curentLevel = 0;
        int prevLevel = 0;
        int counter = 0;

        for (char c : path.toCharArray()) {
            switch (c) {
                case 'U':
                    prevLevel = curentLevel;
                    curentLevel ++;
                    break;
                case 'D':
                    prevLevel = curentLevel;
                    curentLevel --;
                    break;

            }
            if (curentLevel == 0 && prevLevel < 0) counter++;
        }

        return counter;
    }

    public static void main(String[] args) {
        String path = "";

        System.out.println(countingValleys(8, "UDDDUDUU"));
    }

}




