package com.example.mikeh.wowdates2;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.*;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int daysAhead = 365;
    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
//                    testmjh();
                    wow1();
//                    Toast toast = Toast.makeText(getApplicationContext(), "Your toast message.",
//                            Toast.LENGTH_SHORT);
                //    toast.setGravity(Gravity.TOP|Gravity.LEFT, 0, 0);
                    toast.show();
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }
        public void testmjh (){
            Integer J;
        }

        public  void wow1 () {
            String Instalment = "Food day";
            Double LumoInstalments = 75.00;
            Integer Instalments = 24;			// loop control
            int dateTolerance = 0;		// orig was 7 but set to zero to work for toda

            Calendar cldr = Calendar.getInstance();  // change 'M' - MM -> 2 digits; MMM -> 3 letters
            Calendar today = Calendar.getInstance();
            SimpleDateFormat dateformatter =   new SimpleDateFormat("dd-MMM-yyyy");  // ("dd-MM-yyyy E 'at' hh:mm:ss a zzz");

            cldr.set(Calendar.YEAR, 2018);			// set the year (start date for repayment) 11/09/2017
            cldr.set(Calendar.MONTH, 1);			// set the month September
            cldr.set(Calendar.DAY_OF_MONTH, 2);	// set the date
//        System.out.printf("Lumo Bill payment " + Instalment +" "+ "scheme%n%n");
            System.out.printf("WOW 2018  " + Instalment +" "+ "scheme%n%n");
            for (int n= 1; n<Instalments;  n=n+1) {
                {
                    if ((cldr.get(Calendar.YEAR)  == 2018) && (cldr.get(Calendar.MONTH) == 2 ) && (cldr.get(Calendar.DAY_OF_MONTH)  == 30))	// Good Friday

                    {
                        System.out.print("Good Friday");
                    }
                    if ((cldr.get(Calendar.YEAR)  == today.get(Calendar.YEAR)) &&
                            (cldr.get(Calendar.DAY_OF_YEAR) <= (dateTolerance + today.get(Calendar.DAY_OF_YEAR))))
                    {System.out.printf(">"); // %n for newline
                    }else System.out.printf(" ");
                    balanceCheck(cldr, dateformatter);		// prints the date
//                System.out.printf("Installment %3d%n", n );  // make use of defined string "Instalment"
                    System.out.printf("%s %3d%n", Instalment, n);
                    if (LumoFortnight(cldr, dateformatter)) {

                        System.out.println(Instalment + "s" + Instalments);
                        //				                    balanceCheck(cldr, dateformatter));
                    }
                }
                cldr.add(Calendar.DAY_OF_YEAR, +14);  //  examine why cldr and Calendar
                // 14 here is for days in fortnight
            }
            // return true;
        }

        /**
         * weekCheck()
         * @author  (Mike Hewitt)
         * @version (1.1)
         * @param C supply instance(?) of Calendar
         * @param S supply previously organised display format
         */

        public void balanceCheck(Calendar C, SimpleDateFormat S){
            String testStr;
            //		Calendar now = Calendar.getInstance();

            //	System.out.println("found something");
            System.out.print(" "+ S.format(C.getTime())+" ");
            Toast toast = Toast.makeText(getApplicationContext(), S.format(C.getTime()),
                    Toast.LENGTH_SHORT);
            toast.show();
        }
        public boolean LumoFortnight(Calendar C, SimpleDateFormat S){
            return (((
                    (C.get(Calendar.DAY_OF_YEAR)) - 50) % 14) == 0 ) // 14 here is for days in fortnight
                    ;												// but what is 50 doing?
            //&& (C.get(Calendar.DAY_OF_WEEK)==2) ))
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
