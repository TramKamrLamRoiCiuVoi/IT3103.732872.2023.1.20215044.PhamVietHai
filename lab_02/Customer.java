package lab_02;

import java.util.ArrayList;

import lab_02.DigitalVideoDisc;

public class Customer {
    private String name;
    private Cart cart;
    private ArrayList<DigitalVideoDisc> dvdList;

    public Customer(String name) {
        this.name = name;
        this.cart = new Cart();
        this.dvdList = new ArrayList<>();
    }

    // Duyệt danh sách các DVD có sẵn trong cửa hàng
    public void browseDVDs() {
        for (DigitalVideoDisc dvd : dvdList) {
            System.out.println("Title: " + dvd.getTitle() + ", Category: " + dvd.getCagetory() + ", Price: " + dvd.getCost());
        }
    }

    // Tìm kiếm DVD theo title, category, price
    public void searchDVD(String title, String category, float price) {
        for (DigitalVideoDisc dvd : dvdList) {
            if (dvd.getTitle().equals(title) || dvd.getCagetory().equals(category) || dvd.getCost() == price) {
                System.out.println("Title: " + dvd.getTitle() + ", Category: " + dvd.getCagetory() + ", Price: " + dvd.getCost());
            }
        }
    }

    // Xem thông tin chi tiết của DVD
    public void viewDVDDetails(DigitalVideoDisc dvd) {
        System.out.println("Title: " + dvd.getTitle() + ", Category: " + dvd.getCagetory() + ", Price: " + dvd.getCost());
    }

    // Thêm DVD vào cart
    public void addToCart(DigitalVideoDisc disc) {
        cart.addDigitalVideoDisc(disc);
    }

    // Xem cart của mình
    public void viewCart() {
        cart.viewCart();
    }

    // Sắp xếp danh sách DVD trong giỏ hàng theo title hoặc price
    public void sortCart(String sortBy) {
        cart.sortCart(sortBy);
    }

    // Cập nhật số lượng DVD trong cart của mình
    public void updateCartQuantity(DigitalVideoDisc disc, int newQuantity) {
        cart.updateQuantity(disc, newQuantity);
    }

    // Đặt hàng
    public void placeOrder() {
        cart.placeOrder(name);
    }
}

