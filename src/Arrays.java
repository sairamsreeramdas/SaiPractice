public class Arrays {
    public static void main(String[] args){
        double[] values = new double[100];
        values[1] = 44;
        values[99] = 222;
        System.out.println(values[1]);

        int[] value = new int[150];
        value[0] = 143;
        value[10] = 345;
        System.out.println(value[0]);

        //String[] words = new String[]{"YOU","AND","ME"};
        //System.out.println(words[1]);
//or
        String[] words = new String[3];
        words[0]="my";
        words[1]="name";
        words[2]="sjrs";


        System.out.println(words[1]);


    }
}
