import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.*;

/**
 * Created by paragchatterjee on 29/04/2017.
 */
public class ReservationTest {

    Reservation testReservation;
    String [] resSeats ;
    String [] seatSideBySide ;

    @Before
    public void setUp() throws Exception {
         testReservation = new Reservation();
        resSeats =  new String[]{"1A","2B","3C","2D"};
        seatSideBySide = new String[]{"1A1B1C","2A2B2C","3A3B3C", "1D1E1F","2D2E2F","3D3E3F"};

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testReserve() throws Exception {

        assertEquals(testReservation.reserve(resSeats,seatSideBySide),"1D1E1F");
        assertNotEquals(testReservation.reserve(resSeats,seatSideBySide),"3D3E3G");

    }
}