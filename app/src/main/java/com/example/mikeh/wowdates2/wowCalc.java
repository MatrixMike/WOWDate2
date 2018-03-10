//

/**
 * main()
 * @author  (Mike Hewitt)
 * @version (1.1)
 */
/*public static void main (String args[]) {
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
        }

/**
 * weekCheck()
 * @author  (Mike Hewitt)
 * @version (1.1)
 * @param C supply instance(?) of Calendar
 * @param S supply previously organised display format
 */

/*public static void balanceCheck(Calendar C, SimpleDateFormat S){
        String testStr;
        //		Calendar now = Calendar.getInstance();

        //	System.out.println("found something");
        System.out.print(" "+ S.format(C.getTime())+" ");
        }

/**
 * consider a function to return bool if Rent date and another one to return bool if Newstart payment
 *
 */

/* public static boolean LumoFortnight(Calendar C, SimpleDateFormat S){
        return (((
        (C.get(Calendar.DAY_OF_YEAR)) - 50) % 14) == 0 ) // 14 here is for days in fortnight
        ;												// but what is 50 doing?
        //&& (C.get(Calendar.DAY_OF_WEEK)==2) ))
        }
        */
