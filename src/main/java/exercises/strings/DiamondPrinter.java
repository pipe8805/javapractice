package exercises.strings;

import java.util.*;

class DiamondPrinter {
    final static String[] array = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};

    List<String> printToList(char a) {
        int position = getPosition(a);

        List<String> list = new ArrayList<>();
        String carPosicion = "";
        Stack<String> queue=new Stack<>();
        carPosicion = getEdge(position, array);
        list.add(carPosicion);
        queue.add(carPosicion);
        if (position > 1) {
            for (int i = 1; i < position - 1; i++) {
                carPosicion = getBody(i, position, array);
                list.add(carPosicion);
                queue.add(carPosicion);

            }
            carPosicion = getStringMedio(position, array);
            list.add(carPosicion);
            while(!queue.isEmpty()){
                list.add(queue.pop());
            }
        }
        return list;
    }

    private String getEdge(int position, String[] array) {
        StringBuilder builder = new StringBuilder();

        int lateralSpace = (position * 2 - 2) / 2;
        builder.append(getSpaces(lateralSpace));
        builder.append(array[0]);
        builder.append(getSpaces(lateralSpace));
        return builder.toString();
    }

    private String getBody(int i, int position, String[] array) {
        StringBuilder builder = new StringBuilder();
        int totalChar = (position * 2) - 1;

        int lateralSpace = ((position * 2 - 2) / 2) - i;
        int centralSpace = totalChar - 2 - (lateralSpace * 2);
        builder.append(getSpaces(lateralSpace));
        builder.append(array[i]);
        builder.append(getSpaces(centralSpace));
        builder.append(array[i]);
        builder.append(getSpaces(lateralSpace));
        return builder.toString();

    }


    private String getStringMedio(int position, String[] array) {
        StringBuilder builder = new StringBuilder();
        int centralSpace = position * 2 - 3;

        builder.append(array[position - 1]);
        builder.append(getSpaces(centralSpace));
        builder.append(array[position - 1]);
        return builder.toString();

    }

    private String getSpaces(int number) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < number; i++) {
            builder.append(" ");
        }
        return builder.toString();
    }

    private int getPosition(char a) {

        int temp = (int) a;
        int temp_integer = 64; //for upper case
        return temp - temp_integer;
    }

    public static void main(String args[]) {
        DiamondPrinter diamondPrinter = new DiamondPrinter();
        diamondPrinter.printToList('E')
                .forEach(e -> System.out.println(e));
    }

}
