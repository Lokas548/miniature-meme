import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class DataProperty implements Validation {
    @Override
    public boolean checkDateOfBirth(String date) {
        int today = LocalDate.now().getYear();
        int intDate = Integer.parseInt(date);
        if(intDate > 1900 && intDate < today){
            return true;
        }
        return false;
    }


    @Override
    public boolean checkSex(String sex) {
            if(sex.equals("male") || sex.equals("female")) {
                return true;
            }
            return false;
        }

}

