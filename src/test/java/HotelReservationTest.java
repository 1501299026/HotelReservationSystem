import com.hotelreservation.HotelReservationServices;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

    public class HotelReservationTest<Hotel> {
        @Test
        public void givenHotel_whenInvokeAddHotel_shoulBeAbleToAdd() {
            HotelReservationServices hotelReservationService = new HotelReservationServices();
            Hotel hotel = new Hotel("Lakewood",110);
            hotelReservationService.addHotel(hotel);
            List hotelList = hotelReservationService.getHotels();
            Assertions.assertTrue(hotelList.contains(hotel));
        }
    }