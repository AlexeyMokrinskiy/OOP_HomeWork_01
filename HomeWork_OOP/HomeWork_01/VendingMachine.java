package HomeWork_OOP.HomeWork_01;

public interface VendingMachine <T extends HotDrinksVendingMachine>{

    void acceptingMoney();
    void productDelivery();
    void deliveryOfChange();
}