import java.util.Date;

/**
 * SecurePeriod
 */
public class SecurePeriod {

    private final Date start;
    private final Date end;

    public SecurePeriod(Date start, Date end){
        this.start = new Date(start.getTime());
        this.end = new Date(end.getTime());


        if(start.after(end)){
            throw new IllegalArgumentException("Start after end");
        }
    }

    public Date getStart(){
        return new Date(start.getTime());
    }

    public Date getEnd(){
        return new Date(end.getTime());
    }

    public static void main(String[] args){
        Date start = new Date();
        Date end = new Date(start.getTime() + 10000);
        SecurePeriod period = new SecurePeriod(start, end);

        period.getStart().setTime(end.getTime() + 50000);

        System.out.println("Start is after End ? " + period.getStart().after(period.getEnd()));

        System.out.println("Start : " + period.getStart());

        System.out.println("End : " + period.getEnd());
    }
}