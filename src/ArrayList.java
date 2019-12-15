public class ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The sum " + sum(list));

        list.add(10);

        System.out.println("The sum " + sum(list));
        System.out.println("The average " + average(list));
    }

    private static String average(ArrayList list) {
    }

    private void add(int i) {
    }

    public static int sum(ArrayList<Integer> list) {
        int sum =0;
        for(int i = 0; i < list.size(); i++)
        {
            sum += list.get(i);
        }
        
    }

    private int get(int i) {
    }

    private int size() {
    }
}
