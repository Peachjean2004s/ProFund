package Lab4;

public class Lab4Q3 {
    public static void main(String[] args) {
        int amountCharge = 0;
        int hrsPark = 0;
        for (int i = 0; i < args.length; i++) {
            hrsPark = Integer.parseInt(args[i]);
            // your code2
            if (hrsPark <= 2) {
                amountCharge = 4;
            } else if (hrsPark <= 4) {
                //หากจำนวนชั่วโมงที่จอดมากกว่า 2 ชั่วโมง แต่ไม่เกิน 4 ชั่วโมง ค่าจอดรถจะเป็น 4 สำหรับ 2 ชั่วโมงแรก และเพิ่มอีก 3 สำหรับแต่ละชั่วโมงที่เกินมา
                amountCharge = 4 + (hrsPark - 2) * 3;
            } else if (hrsPark <= 24) {
                //หากจำนวนชั่วโมงที่จอดมากกว่า 4 ชั่วโมง แต่ไม่เกิน 24 ชั่วโมง ค่าจอดรถจะเป็น 10 สำหรับ 4 ชั่วโมงแรก และเพิ่มอีก 1 สำหรับแต่ละชั่วโมงที่เกินมา
                amountCharge = 10 + (hrsPark - 4);
                if (amountCharge > 24) {
                    amountCharge = 24;
                }
            } else {
                //int days = hrsPark / 24;
                int days = hrsPark / 24;
                int hrs = hrsPark % 24;
                amountCharge = (days * 24) + (hrs <= 2 ? 4 : hrs <= 4 ? 4 + (hrs - 2) * 3 : hrs <= 24 ? 10 + (hrs- 4) : 0); 
            }

            System.out.println("Parking for " + hrsPark + " hrs, pay " + amountCharge + " baht.");
        } // 4 7 10 11 24 24 127
    }

}
