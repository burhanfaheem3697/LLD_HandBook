import java.util.Date;

public class ReferenceLeakDemo {

    static class MutablePeriod{
        private final Date start;
        private final Date end;

        public MutablePeriod(Date start,Date end){
            if(!start.before(end)){
                throw new IllegalArgumentException("Start is not before end");
            }

            this.start = start;
            this.end = end;
        }

        public Date getStart(){
            return start;
        }

        public Date getEnd(){
            return end;
        }
    }

    public static void main(String[] args){
        Date start = new Date();
        Date end = new Date(start.getTime() + 10000);

        MutablePeriod period = new MutablePeriod(start, end);

        period.getStart().setTime(end.getTime() + 50000);

        System.out.println("Start is after end ? " + period.getStart().after(period.getEnd()));
    }
    
}