import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String[] str = kb.nextLine().split("-");
        int sum = Integer.MAX_VALUE;

        for (int i = 0; i < str.length; i++) {
            int temp = 0;

            String[] tmp = str[i].split("\\+");

            for (int j = 0; j < tmp.length; j++) {
                temp += Integer.parseInt(tmp[i]);
            }

            if (sum == Integer.MAX_VALUE) {
                sum = temp;
            } else {
                sum -= temp;
            }
        }

        System.out.println(sum);

    }
}
