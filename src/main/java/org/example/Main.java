package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {

//        System.out.print("Map Functions");
//
//        //Making a list
//        List<Integer> I = Arrays.asList(1, 2, 3, 4, 5, 8, 5, 6, 7);
//
//        List<Integer> newI = I.stream().map(a -> a * a).toList();
//
//        for (int a : newI) {
//            System.out.println(a);
//        }
//
//        int ans= I.stream().reduce(0,(integer, integer2) -> integer-integer2);
//
//        System.out.println("ans is " + ans);
//
//       //Sort
//
//        List<Integer> Sorted= I.stream().sorted().toList();
//
//        //Sorted List
//        for (int a : Sorted) {
//            System.out.println(a);
//        }
//
//        //Filter
//        System.out.println("Filter");
//        List<Integer> Filter= I.stream().filter(integer -> integer>4).toList();
//        for (int a : Filter) {
//            System.out.println(a);
//        }

        //Customer Class Functions

        List<Customer> C = CustomerService.generateRandomCustomerList(10);
        CustomerService CS = new CustomerService(C);

        //report Generation
        CS.ReportGeneration();


    }
}