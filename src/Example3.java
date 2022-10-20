import javax.xml.crypto.Data;

public class Example3 {
    public static void main(String[] args) {

    }

    public class Time {
        private int hr;
        private int min;
        private int second;

        public  Time(){

        }
        public Time(int hr, int min, int second) {
            if (hr >= 0 && hr <= 23 && min >= 0 && min <= 59 && second >= 0 && second <= 59) {
                this.hr = hr;
                this.min = min;
                this.second = second;
            }
        }

        @Override
        public String toString() {
            return "Time{" +
                    "hr=" + hr +
                    ", min=" + min +
                    ", second=" + second +
                    '}';
        }
    }
}
