 public class Invoice {
    public static void main(String[] args) {
        String Address = "Mirowe Bob Okinyi";
        String soldTo = "c026-01-0922/2022";
        String date = "28/04/2020";
        int ContactNumber = 0100100100;
        int Quantity1 = 4, Quantity2 = 10, Quantity3 = 9,Quantity4 = 10;
        String itemDescription1 = "Pencil",itemDescription2 = "Duster",itemDescription3 = "Pens", itemDescription4 = "Crayon";
        int UnitPrice1 = 20, UnitPrice2 = 50, UnitPrice3 = 30,UnitPrice4 = 80;
        double Amount1 = 80.00, Amount2 = 500.00,Amount3 = 270.00,Amount4 = 800.00;
        double subtotal = Amount1 + Amount2 + Amount3 + Amount4;
        double vat = subtotal * 0.16;
        double totalamount = subtotal + vat;

    
        System.out.println("*****************************Adamson Computers Ltd***********************************");
        System.out.println("#99 ACS Building Gilmore Ave.New Mla..Quezon City * Tel.No:123-4567");
        System.out.println("                       VAT REG. TIN 098-765-4321-0000");
        System.out.println("                              SALES INVOICE");
        System.out.println("");
        System.out.println("");
        System.out.println("Sold to: " +soldTo+"                                   Date:"+date);
        System.out.println("Address: " +Address+"                                  Contact Number:"+ContactNumber);
        System.out.println("");
        System.out.println("==========================================================================================");
        System.out.println("Qty            |Item Description            |Unit Price            |Amount");
        System.out.println("==========================================================================================");
        System.out.println(" " +Quantity1+"             |"+itemDescription1+"                      |"+UnitPrice1+"                    |"+Amount1);
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println(" " +Quantity2+"            |"+itemDescription2+"                      |"+UnitPrice2+"                    |"+Amount2);
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println(" " +Quantity3+"             |"+itemDescription3+"                        |"+UnitPrice3+"                    |"+Amount3);
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println(" " +Quantity4+"            |"+itemDescription4+"                      |"+UnitPrice4+"                    |"+Amount4);
        System.out.println("==========================================================================================");
        System.out.println("                                                                   |Sub Total"+subtotal+"   |");
        System.out.println("                                                                   =======================");
        System.out.println("                                                                   |VAT(16%) "+vat+"     |");
        System.out.println("                                                                   =======================");
        System.out.println("                                                                   |Total Amount "+totalamount+"|");
        System.out.println("                                                                   =======================");
    }
}
