public class Ex1 {
    public static int number2Int(String num) {
        if (num == null) {
            return -1;
        }
        int bIndex = num.indexOf('b');
        if (bIndex == -1 || bIndex == 0 || bIndex == num.length() - 1) {
            System.out.println("wrong format!");
            return -1;
        }

        String partNum = num.substring(0, bIndex);
        String partBase = num.substring(bIndex + 1);
        if (partBase.length() > 1) {
            System.out.println("wrong format!");
            return -1;
        }
        if (Character.isLowerCase(partNum.charAt(0))) {
            System.out.println("wrong format!");
            return -1;
        }
        if (Character.isLowerCase(partBase.charAt(0))) {
            System.out.println("wrong format!");
            return -1;
        }

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
        if (bIndex == -1 || bIndex == 0 || bIndex == a.length() - 1) {
            return false;
        }

        String partNum = a.substring(0, bIndex);
        String partBase = a.substring(bIndex + 1, a.length());
        if (partBase.length() > 1) {
            return false;
        }
        if (Character.isLowerCase(partNum.charAt(0))) {
            return false;
        }
        if (Character.isLowerCase(partBase.charAt(0))) {
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
        } else {
            return true;
        }
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

}