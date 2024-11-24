package OOP.OtherProject;

public class GarbageCreator {
    public static void main(String[] args) {
        StringBuffer garbage = new StringBuffer();
        long startTime = System.currentTimeMillis();
        
        for (int i = 0; i < 10000; i++) {
            garbage.append("abcbcbabbabcbcababcbabacbacb ");
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Time taken to create garbage: " + (endTime - startTime));
        
    }
}
