package object.ch02.exam01;

public class PercentDiscountPolicy extends DiscountPolicy {
    private double percent;

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return screening.getMovieFee().times(percent);
    }
    
}
