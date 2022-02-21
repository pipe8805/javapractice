package exercises.recursion;

import java.util.ArrayList;
import java.util.List;
class Knapsack {
    int maximumValue(int capacity, List<Item> items) {
        return items.stream().mapToInt(item -> {
            if (item.getWeight() > capacity) {
                return 0;
            }
            return item.getValue() + maximumValue(capacity - item.getWeight(),
                    items.subList(items.indexOf(item) + 1, items.size()));
        }).max().orElse(0);
    }
    public int maximumValueTwo(final int capacity, final List<Item> items) {
        List<Integer> results = new ArrayList<>();
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getWeight() > capacity) {
                results.add(0);
            } else {
                results.add(items.get(i).getValue()
                        + maximumValueTwo(capacity - items.get(i).getWeight(),
                        items.subList(i + 1, items.size())));
            }
        }
        return results.stream().mapToInt(i -> i).max().orElse(0);
    }


    public static void main(String args[]){
        Knapsack knapsack=new Knapsack();
        List<Item> items = List.of(
                new Item(2, 5),
                new Item(2, 5),
                new Item(2, 5),
                new Item(2, 5),
                new Item(10, 21)
        );
        System.out.println(knapsack.maximumValueTwo(10,items));
    }
}


class Item{
    private int weight;
    private int value;

    public Item(int weight, int value){
        this.weight=weight;
        this.value=value;
    }

    public int getWeight(){
        return  weight;
    }
    public int getValue(){
        return  value;
    }

}
