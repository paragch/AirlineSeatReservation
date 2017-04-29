import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by paragchatterjee on 29/04/2017.
 */
public class Reservation {

    public String reserve(String [] resSeats , String [] seatSideBySide)
    {
        List<String> reservedSeats= new ArrayList<String>(Arrays.asList(resSeats));

        List<String> seatsSideBySide= new ArrayList<String>(Arrays.asList(seatSideBySide));

        String familyBooking = makeFamilyBooking(reservedSeats,seatsSideBySide);

        return familyBooking;
    }




    public String makeFamilyBooking(List<String> reservedSeats, List<String> seatsSideBySide)
    {

        List<String> available = seatsSideBySide.stream()
                .filter(e ->
                        (reservedSeats.stream()
                        .filter(d -> e.contains(d))
                        .count())== 0)
                .collect(Collectors.toList());

        StringBuilder b = new StringBuilder();
        available.forEach(b::append);



        return b.toString().substring(0,6);

    }
}
