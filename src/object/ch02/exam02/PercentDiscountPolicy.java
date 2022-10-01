package object.ch02.exam02;

public class PercentDiscountPolicy extends DefaultDiscountPolicy {
    private double percent;

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return screening.getMovieFee().times(percent);
    }
    
}
