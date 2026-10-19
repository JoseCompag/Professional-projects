package assignment5_exercises.checkit;

import assignment5_exercises.path.Path;

public class CheckIt {
    Path path;

    public CheckIt() {
        path = new Path();
    }

    /***
     * This method checks the following condition:
     * P = a && (b || c)
     */
    public boolean checkIt (boolean a, boolean b, boolean c) {
        if (a && (b || c)) {
            System.out.println("P is true");
            return true;
        } else {
            System.out.println("P isn’t true");
            return false;
        }
    }

    /***
     * This method checks the following condition:
     * P = a && (b || c)
     * Also is used to generate the path for the checkIt method
     */
    public boolean checkItExpand(boolean a, boolean b, boolean c) {
        boolean result;
        path.addNode(1);
        if (a) {
            path.addNode(2);
            if (b) {
                path.addNode(4);
                System.out.println("P is true");
                result = true;
            } else {
                path.addNode(5);
                if (c) {
                    path.addNode(6);
                    System.out.println("P is true");
                    result = true;
                } else {
                    path.addNode(7);
                    System.out.println("P isn’t true");
                    result = false;
                }
            }
        } else {
            path.addNode(3);
            System.out.println("P isn’t true");
            result = false;
        }
        path.addNode(8);
        return result;
    }
}
