public class MyInteger {
        private int value;

        public MyInteger(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public boolean isEven() {
            return isEven(value);
        }

        public boolean isOdd() {
            return isOdd(value);
        }

        public boolean isPrime() {
            return isPrime(value);
        }

        public static boolean isEven(int value) {
            return value % 2 == 0;
        }

        public static boolean isOdd(int value) {
            return value % 2 != 0;
        }

        public static boolean isPrime(int value) {
            if (value <= 1)
                return false;
            for (int i = 2; i <= Math.sqrt(value); i++) {
                if (value % i == 0)
                    return false;
            }
            return true;
        }

        public static boolean isEven(MyInteger obj) {
            return obj.isEven();
        }

        public static boolean isOdd(MyInteger obj) {
            return obj.isOdd();
        }

        public static boolean isPrime(MyInteger obj) {
            return obj.isPrime();
        }

        public boolean equals(int value) {
            return this.value == value;
        }

        public boolean equals(MyInteger obj) {
            return this.value == obj.getValue();
        }

        public static void main(String[] args) {
            MyInteger num1 = new MyInteger(5);
            MyInteger num2 = new MyInteger(10);

            System.out.println("num1 isEven: " + num1.isEven());
            System.out.println("num1 isOdd: " + num1.isOdd());
            System.out.println("num1 isPrime: " + num1.isPrime());

            System.out.println("num2 isEven: " + num2.isEven());
            System.out.println("num2 isOdd: " + num2.isOdd());
            System.out.println("num2 isPrime: " + num2.isPrime());

            System.out.println("num1 equals 5: " + num1.equals(5));
            System.out.println("num1 equals num2: " + num1.equals(num2));
        }
    }

