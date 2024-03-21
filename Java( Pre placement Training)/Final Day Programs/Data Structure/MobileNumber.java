public class MobileNumber {
    public static void main(String[] args) {
        long[] mobileNumbers = {
                9876543210l,
                8765432100l,
                7654321090l,
                6543210980l,
                5432109870l,
                4321098760l,
                3210987650l,
                2109876540l,
                1098765430l,
                9876543210l
        };

        String tempNumber;
        for (int k = 0; k < 10; k++) {
            tempNumber = Long.toString(mobileNumbers[k]);
            if (tempNumber.length() != 10) {
                System.out.println(tempNumber + " is not a 10 digit number!");
            } else {
                System.out.println(tempNumber + " is a 10 digit number!");

            }
        }

        System.out.println();

        // Sorting logic.
        // Bubble sort.
        long temp = 0l;
        for (int i = 0; i < mobileNumbers.length; i++) {
            for (int j = 0; j < mobileNumbers.length - 1; j++) {
                if (mobileNumbers[j] > mobileNumbers[j + 1]) {
                    temp = mobileNumbers[j];
                    mobileNumbers[j] = mobileNumbers[j + 1];
                    mobileNumbers[j + 1] = temp;
                }
            }
        }

        // Conctenating hello to 4th and 7th numbers and others with Hi.
        for (int i = 0; i < 10; i++) {
            tempNumber = Long.toString(mobileNumbers[i]);

            if (i == 3 || i == 4 || i == 5 || i == 6) {
                System.out.println("Hello " + tempNumber);
            } else {
                System.out.println("Hi " + tempNumber);
            }
        }
    }
}
