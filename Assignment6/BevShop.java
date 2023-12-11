/*
 * Class: CMSC203 
 * Instructor:Khandan Monshi
 * Description: A lot of classes tied together
 * Due: 12/5//2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Josue Castro
*/

import java.util.ArrayList;

public class BevShop extends Object implements BevShopInterface {

    int MIN_AGE_FOR_ALCOHOL = 21;
    int MAX_ORDER_FOR_ALCOHOL = 3;

    int MIN_TIME = 8;
    int MAX_TIME = 23;
    int MAX_FRUIT = 5;

    Order currentOrder;
    ArrayList<Order> orderList;

    public BevShop() 
    {
        orderList = new ArrayList<Order>();
    }

    public boolean isValidTime(int time)
    {
        return time > MIN_TIME && time < MAX_TIME;
    }
    public int getMaxNumOfFruits() {
        return MAX_FRUIT;
    }

    public int getMinAgeForAlcohol() {
        return MIN_AGE_FOR_ALCOHOL;
    }

    public boolean isMaxFruit(int numOfFruits) {
        return numOfFruits > MAX_FRUIT;
    }

    public int getMaxOrderForAlcohol() {
        return MAX_ORDER_FOR_ALCOHOL;
    }

    public boolean isEligibleForMore() {
        return this.getMaxOrderForAlcohol() > currentOrder.findNumOfBeveType(Type.ALCOHOL);
    }

    public int getNumOfAlcoholDrink() {
        return currentOrder.findNumOfBeveType(Type.ALCOHOL);
    }

    public boolean isValidAge(int age) {
        return age >= MIN_AGE_FOR_ALCOHOL;
    }

    public void startNewOrder(int time, Day day, String customerName, int customerAge) 
    {
        Order other = new Order(time, day, new Customer(customerName, customerAge));
        orderList.add(other);
        currentOrder = other;
    }

    public void processCoffeeOrder(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
        currentOrder.addNewBeverage(bevName, size, extraShot, extraSyrup);
    }

    public void processAlcoholOrder(String bevName, Size size) {
        currentOrder.addNewBeverage(bevName, size);
    }

    public void processSmoothieOrder(String bevName, Size size, int numOfFruits, boolean addProtein) {
        currentOrder.addNewBeverage(bevName, size, numOfFruits, addProtein);
    }

    public int findOrder(int orderNo) {
        for (int i = 0; i < orderList.size(); i++) {
            if (orderList.get(i).getOrderNo() == orderNo) {
                return i;
            }
        }
        return -1;
    }
    
    public double totalOrderPrice(int orderNo)
    {
    	 int or = findOrder(orderNo);
    	 currentOrder = orderList.get(or);
    	 return currentOrder.calcOrderTotal();
    }

    public double totalMonthlySale() 
    {
        double total = 0;
        for (int i = 0; i < orderList.size(); i++)
        {
            total += orderList.get(i).calcOrderTotal();
        }
        return total;
    }

    public int totalNumOfMonthlyOrders() 
    {
        return orderList.size();
    }

    public Order getCurrentOrder()
    {
        return currentOrder;
    }

    public Order getOrderAtIndex(int index)
    {
        return orderList.get(index);
    }

    public void sortOrders() {
        Order tempOrder;
        int minIndex;
        for (int i = 0; i < orderList.size() - 1; i++) {
            minIndex = i;
            tempOrder = orderList.get(i);
            for (int j = i + 1; j < orderList.size(); j++) {  // Fixed the loop variable
                if (orderList.get(j).getOrderNo() < tempOrder.getOrderNo()) {
                    tempOrder = orderList.get(j);
                    minIndex = j;
                }
            }
            orderList.set(minIndex, orderList.get(i));
            orderList.set(i, tempOrder);
        }
    }
}