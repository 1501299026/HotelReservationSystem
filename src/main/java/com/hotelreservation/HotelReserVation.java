package com.hotelreservation;

import com.hotelreservation.com.hotel.Hotel;

import java.util.ArrayList;

public class HotelReserVation {

    private List<Hotel> hotelList = new ArrayList<>();

    public void addHotel(Hotel hotel) {
        hotelList.add(hotel);
    }
    public List<Hotel> getHotels() {

        return hotelList;
    }
}



