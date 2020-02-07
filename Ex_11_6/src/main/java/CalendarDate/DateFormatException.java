/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalendarDate;

/**
 *
 * @author Slava
 */
public class DateFormatException extends Exception {

    public DateFormatException() {
    }

    public DateFormatException(String string) {
        super(string);
    }

    public DateFormatException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public DateFormatException(Throwable thrwbl) {
        super(thrwbl);
    }

    public DateFormatException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }


    
}
