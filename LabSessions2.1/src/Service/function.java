package Service;

public class function {

    public void count(int[] a, int key) {

        int[] notesArray = new int[a.length];
        try {
            for (int i = 0; i < a.length; i++) {
                if (key >= a[i]) {
                    notesArray[i] = key / a[i];
                    key = key - (a[i] * notesArray[i]);
                }
            }
            if (key > 0) {
                System.out.println(
                        "The target values cannot be acheived using the denomination value present in the array");
            } else if (key == 0) {
                for (int i = 0; i < notesArray.length; i++) {
                    System.out.println(a[i] + " : " + notesArray[i]);
                }
            }
        } catch (Exception e) {
            System.out.println("Exception : The Denomination value cannot be 0");
        }
    }

}
