import javax.xml.crypto.Data;
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
            return hr + " hour "+min+" minut "+second+" second ";
        }
    }

