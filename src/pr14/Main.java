package pr14;

public class Main {
    public static void main(String[] args) {
        WaitList<Integer> waitList = new BoundedWaitList<Integer>(3);
        waitList.add(10);
        waitList.add(35);
        waitList.add(55);
        waitList.add(95);
        System.out.println(waitList);
        UnfairWaitList<Integer> unfairwaitList = new UnfairWaitList<Integer>();
        unfairwaitList.add(10);
        unfairwaitList.add(35);
        unfairwaitList.add(55);
        unfairwaitList.add(95);
        unfairwaitList.moveToBack(3);
        System.out.println(unfairwaitList);
    }
}