package org.learning.generics;

import org.learning.generics.coffee.Generator;

import java.util.*;

class Customer {
    private static long counter = 1;
    private final long id = counter++;
    private Customer() {

    }

    @Override
    public String toString() {
        return "Customer " + id;
    }

    public static Generator<Customer> generator() {
        return new Generator<Customer>() {
            @Override
            public Customer next() {
                return new Customer();
            }
        };
    }
}

class Teller {
    private static long counter = 1;
    private final long id = counter++;
    private Teller() {

    }

    @Override
    public String toString() {
        return "Teller " + id;
    }

    public static Generator<Teller> generator = new Generator<Teller>() {
        @Override
        public Teller next() {
            return new Teller();
        }
    };
}

public class BankTeller {
    public static void serve(Teller t, Customer c) {
        System.out.println(t + " serves " + c);
    }

    public static void main(String[] args) {
        Random rand = new Random(47);
        Queue<Customer> line = new LinkedList<>();
        Generators.fill(line, Customer.generator(),15);
        List<Teller> tellers = new ArrayList<>();
        Generators.fill(tellers,Teller.generator,4);
        for(Customer c : line) {
            serve(tellers.get(rand.nextInt(tellers.size())),c);
        }
    }

}
