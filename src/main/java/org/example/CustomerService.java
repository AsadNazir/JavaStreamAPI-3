package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class CustomerService {
    List<Customer> C;

    CustomerService(List<Customer> C) {
        this.C = C;
    }

    // Generate a list of random customers
    public static List<Customer> generateRandomCustomerList(int count) {
        List<Customer> customerList = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < count; i++) {
            String[] names = {"Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Grace", "Hannah", "Isaac", "Jane"};
            String[] cities = {"New York", "Los Angeles", "Chicago", "Houston", "Miami", "San Francisco", "Seattle"};
            Customer.Gender[] genders = Customer.Gender.values();

            String randomName = names[random.nextInt(names.length)];
            int randomAge = random.nextInt(50) + 20; // Age between 20 and 69
            String randomCity = cities[random.nextInt(cities.length)];
            Customer.Gender randomGender = genders[random.nextInt(genders.length)];
            double randomPurchaseAmount = random.nextDouble() * 1000.0; // Purchase amount between 0.0 and 1000.0

            Customer customer = new Customer(randomName, randomAge, randomCity, randomGender, randomPurchaseAmount);
            customerList.add(customer);
        }

        return customerList;
    }

    List<Customer> AgeFilter(int start, int end) {
        if (start > end) return null;

        return this.C.stream().filter(customer -> (customer.getAge() >= start && customer.getAge() <= end)).toList();

    }

    List<Customer> OrderAlphabet() {
        return this.C.stream()
                .sorted(Comparator.comparing(Customer::getName))
                .toList();
    }

    List<Customer> CityEquals(String cityName) {
        return this.C.stream()
                .filter(customer -> customer.getCity().equalsIgnoreCase(cityName))
                .toList();
    }

    List<Customer> GenderFilter(Customer.Gender gender) {
        return this.C.stream()
                .filter(customer -> customer.getGender() == gender)
                .toList();
    }

    double TotalPurchase() {
        return this.C.stream()
                .mapToDouble(Customer::getPurchaseAmount)
                .sum();
    }

    Customer HighestPurchaseAmount()
    {
        return this.C.stream().max(Comparator.comparing(Customer::getPurchaseAmount)).orElse(null);
    }

    //Took help from CHATGPT
    Map<String, Double> AvgPurchaseByCity()
    {

         return this.C.stream()
                .collect(Collectors.groupingBy(
                        Customer::getCity,
                        Collectors.averagingDouble(Customer::getPurchaseAmount)
                ));
    }

    void ReportGeneration()
    {
        for (Customer a:this.OrderAlphabet()
             ) {
            System.out.println(a.getName()+"\t"+a.getPurchaseAmount()+"$");
        }


        System.out.println("Highest Purchase Amount is : "+this.HighestPurchaseAmount().getPurchaseAmount());
        this.AvgPurchaseByCity().forEach((s, aDouble) -> {
            System.out.println(s+"\t"+aDouble);
        });




    }





}
