public class Ex1 {
    // Converts a number string in the wanted base to an integer.
    public static int number2Int(String num) {
        if (num == null) {
            return -1;
        }
       // return -1 if the string is not a valid number.
        if (!isNumber(num)) {

            return -1;
        }
        int bIndex = num.indexOf('b'); // find the index of representation of b index  in the string.
        // If no base,it's  base 10
        if (bIndex == -1) {
            return Integer.parseInt(num);// Integer.parseInt converts a string representation of a number into an int
        }
        String partBase = num.substring(bIndex + 1);// extract base part after 'b'.
        String partNum = num.substring(0, bIndex);//extract number part before 'b'.

        int base;
        // Check if base is a single letter from A-G then turn it to it's value to 10-16.
        if (partBase.length() == 1 && partBase.charAt(0) >= 'A' && partBase.charAt(0) <= 'G') {
            base = partBase.charAt(0) - 'A' + 10;
        } else {
            base = Integer.parseInt(partBase);//converts the string base into an int if not A-G letter
        }

        if (base < 2 || base > 16) {// if the base isn't valid then return -1
            System.out.println("wrong format!");
            return -1;
        } else {
            // converts partNum to an int and if it's bigger than 9 then shows numbers as A-G.
            return Integer.parseInt(partNum, base);
        }
    }

//checks whether a string represents a number in a valid format.
    public static boolean isNumber(String a) {
        if (a == null) {// null strings are not valid.
            return false;
        }
        int bIndex = a.indexOf('b');// find the index of representation of b index  in the string.
        if (bIndex == 0 || bIndex == a.length() - 1) {// invalid if 'b' is at the start or end
            return false;
        }
        if (bIndex == -1) {// If no base, check if all characters are between 0-9
            for (char c : a.toCharArray()) {
                int val = valueOfNumber(c);
                if (val == -1 || val > 9) {
                    return false;
                }
            }
            return true;
        }

        String partNum = a.substring(0, bIndex);// extract number part.
        String partBase = a.substring(bIndex + 1);// extract base part
        if (partNum == null || partBase == null) {// invalid if any part is null.
            return false;
        }
        if (Character.isLowerCase(partNum.charAt(0))) {
            return false;
        }
        if (Character.isLowerCase(partBase.charAt(0))) {
            return false;
        }
        if (partBase.length() > 1) {
            return false;
        }
        int base;
        if (partBase.length() == 1 && partBase.charAt(0) >= 'A' && partBase.charAt(0) <= 'G') {
            base = partBase.charAt(0) - 'A' + 10;
        } else {
            base = Integer.parseInt(partBase);
        }

        if (base < 2 || base > 16) {
            return false;
        }
        //loops for each character in the string
        for (char c : partNum.toCharArray()) {
            int val = valueOfNumber(c);//valueOfNumber is a function that returns the value of character
            if (val == -1 || val >= base) {
                return false;
            }
        }

        return true;
    }


    public static String int2Number(int num, int base) {
        String ans = "";
        if (num < 0) {
            return ans;
        }
        if (base < 2 || base > 16) {
            return ans;
        }
        if (num == 0) {
            return "0";
        }
        String ans2 = Integer.toString(num, base).toUpperCase();
        String baseString;
        if (base == 10) {
            return Integer.toString(num);
        }
        if (base > 11) {
            baseString = Character.toString((char) ('A' + base - 10));

        } else {

            baseString = Integer.toString(base);
        }

        return ans2 + "b" + baseString;

    }

    public static boolean equals(String n1, String n2) {
        int newN1 = number2Int(n1);
        int newN2 = number2Int(n2);
        if (newN1 == newN2) {
            return true;
        }
        return false;
    }

        public static int maxIndex(String[] arr) {
            int indexMax = -1;
            int valueMax = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {
                int currentValue = number2Int(arr[i]);
                if (currentValue == -1) {
                    return -1;
                }
                if (currentValue > valueMax) {
                    valueMax = currentValue;
                    indexMax = i;
                }

            }

                return indexMax;

            }

    public static int valueOfNumber(char n){
        if (n >= '0' && n <= '9') {
            return n - '0';
        }
        if (n >= 'A' && n <= 'G') {
            return n - 'A' + 10;
        }
        if (n >= 'a' && n <= 'g') {
            return n - 'a' + 10;
        }
        return -1;
    }

    public static boolean compareBaseNum(String num, String base) {
        int baseInt = number2Int(base);
        if (baseInt < 2 || baseInt >16) {

            return false;
        }
        for (int i = 0; i < num.length(); i++) {
            int digit = valueOfNumber(num.charAt(i));
            if (digit == -1 || digit >= baseInt) {

                return false;
            }

        }
        return true;

    }

}