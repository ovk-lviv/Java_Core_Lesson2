package ua.lviv.lgs.Lesson17;

import java.util.Arrays;

public class Collection {
    private int[] number;

    public Collection(int[] number) {
        this.number = number;
    }

    public class Order implements Iterator {
        @Override
        public void hasNext() {
            System.out.println(Arrays.toString(number));
        }

        @Override
        public void next() {
            for (int i = 0; i < number.length; i++) {
                if (number[i] % 2 == 0) {
                    number[i] = 0;
                }
            }
            System.out.println(Arrays.toString(number));

        }
    }

    public class ReverseOrder implements Iterator {
        @Override
        public void next() {
            for (int i = number.length-1; i >=0; i-=2) {
                System.out.println(number[i]);

            }
        }

        @Override
        public void hasNext() {
            System.out.println("Why is it for?");
        }
    }


}

