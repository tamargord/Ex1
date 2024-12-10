public class Ex1 {
    public static int number2Int(String num) {
        if (num == null) {
            return -1;
        }
        if (!isNumber(num)) {
            System.out.println("wrong format!");
            return -1;
        }

        int bIndex = num.indexOf('b');
        if (bIndex == -1) {
            return Integer.parseInt(num);
        }
        String partBase = num.substring(bIndex + 1);
        String partNum = num.substring(0, bIndex);

        int base;
        if (partBase.length() == 1 && partBase.charAt(0) >= 'A' && partBase.charAt(0) <= 'G') {
            base = partBase.charAt(0) - 'A' + 10;
        } else {
            base = Integer.parseInt(partBase);
        }

        if (base < 2 || base > 16) {
            System.out.println("wrong format!");
            return -1;
        } else {
            return Integer.parseInt(partNum, base);
        }
    }


    public static boolean isNumber(String a) {
        if (a == null) {
            return false;
        }
        int bIndex = a.indexOf('b');
        if (bIndex == 0 || bIndex == a.length() - 1) {
            return false;
        }


        if (bIndex == -1) {
            for (char c : a.toCharArray()) {
                int val = valueOfNumber(c);
                if (val == -1 || val > 9) {
                    return false;
                }
            }
            return true;
        }

        String partNum = a.substring(0, bIndex);
        String partBase = a.substring(bIndex + 1);
        if (partNum==null || partBase==null) {
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
        return Integer.toString(num, base).toUpperCase() + "b" + base;
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

        public static int valueOfNumber(char n) {
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
        if (baseInt < 2 || baseInt > 16) {
            System.out.println("wrong format!");
            return false;
        }
        for (int i = 0; i < num.length(); i++) {
            int digit = valueOfNumber(num.charAt(i));
            if (digit == -1 || digit >= baseInt) {
                System.out.println("wrong format!");
                return false;
            }

        }
        return true;

    }
}

