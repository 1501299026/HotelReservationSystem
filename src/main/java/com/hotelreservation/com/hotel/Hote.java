package com.hotelreservation.com.hotel;

public class Hote {

        public String hotelName;
        public int dailyRate;
        public Hotel(String hotelName, int dailyRate) {
            this.hotelName = hotelName;
            this.dailyRate = dailyRate;
        }
        public static void main(String[] args) {
            System.out.println("Welcome to Hotel Reservation Program");
        }
    }