package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int sum = 0;
        for(int i = 0; i<=lastInRow; i++){
            if(i % numberToSkip == 0){
                sum = sum + i;
            }
            else if (numberToSkip > lastInRow){
                System.out.println("number to skip is bugger then the last");
                break;
            } else if (lastInRow < 0){
                System.out.println("last number in row is negative");
            }
            else {
                System.out.println("skipped sum is number " + sum);
            }
        }
    }
//    public static void main (String[] args){
//        printSumOfTwoRanges(2,9);
//    }
    }

