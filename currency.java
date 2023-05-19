import java.util.*;
public class currency {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double ch, amount, rupee, dollar, yen, euro, swiss, yuan, pound;
        System.out.println(" CURRENCY CONVERTER");
        System.out.println("________________\n");
        System.out.println("WELCOME TO CURRENCY CONVERTER !");
        System.out.println("________________\n");
        System.out.println("Which Currency Do You Want To Convert ?");
        System.out.println("-----------------------------------------------");
        System.out.println("1->rupee \n2->dollar \n3->yen \n4->euro \n5->swiss \n6->yuan \n7->pound \nchoose any one ");
        ch=sc.nextInt();
        System.out.println("-----------------------------------------------");
        System.out.println("How Much Money Do You Want To Convert:");
        amount=sc.nextFloat();
        System.out.println("________________\n");

        if(ch == 1)
        {
            System.out.println("Your Choice Is RUPEE");

            dollar=amount/82;
            System.out.println("Your "+amount+" Rupee is "+dollar+" dollar");

            yen=amount/1.72;
            System.out.println("Your "+amount+" Rupee is "+yen+" yen");

            euro=amount/0.012;
            System.out.println("Your "+amount+" Rupee is "+euro+" euro");

            swiss=amount/0.012;
            System.out.println("Your "+amount+" Rupee is "+swiss+" swiss");

            yuan=amount/0.088;
            System.out.println("Your "+amount+" Rupee is "+yuan+" yuan");

            pound=amount/0.010;
            System.out.println("Your "+amount+" Rupee is "+pound+" pound");
        }
        else if(ch == 2)
        {
            System.out.println("Your Choice Is DOLLAR");

          rupee=amount/81.64;
          System.out.println("Your "+amount+" Dollar is "+rupee+" rupee");

          yen=amount/138.74;
          System.out.println("Your "+amount+" Dollar is "+yen+" yen");

          euro=amount/0.96;
          System.out.println("Your "+amount+" Dollar is "+euro+" euro");

          swiss=amount/0.95;
          System.out.println("Your "+amount+" Dollar is "+swiss+" swiss");

          yuan=amount/7.21;
          System.out.println("Your "+amount+" Dollar is "+yuan+" yuan");

          pound=amount/0.83;
          System.out.println("Your "+amount+" Dollar is "+yuan+" yuan");
        }
        else if(ch == 3)
        {
            System.out.println("Your Choice Is YEN");

            rupee=amount/0.59;
            System.out.println("Your "+amount+" Yen is "+rupee+" rupee");

            dollar=amount/0.0072;
            System.out.println("Your "+amount+" Yen is "+dollar+" dollar");

            euro=amount/0.0069;
            System.out.println("Your "+amount+" Yen is "+euro+" euro");

            swiss=amount/0.0068;
            System.out.println("Your "+amount+" Yen is "+swiss+" swiss");


            yuan=amount/0.052;
            System.out.println("Your "+amount+" Yen is "+yuan+" yuan");

            pound=amount/0.0060;
            System.out.println("Your "+amount+" Yen is "+pound+" pound");
        }
        else if(ch == 4)
        {
            System.out.println("Your Choice Is EURO");

            rupee=amount/84.67;
            System.out.println("Your "+amount+" Euro is "+rupee+" rupee");

            dollar=amount/1.04;
            System.out.println("Your "+amount+" Euro is "+dollar+" dollar");

            yen=amount/143.99;
            System.out.println("Your "+amount+" Euro is "+yen+" yen");

            swiss=amount/0.98;
            System.out.println("Your "+amount+" Euro is "+swiss+" swiss");

            yuan=amount/7.48;
            System.out.println("Your "+amount+" Euro is "+yuan+" yuan");

            pound=amount/0.86;
            System.out.println("Your "+amount+" Euro is "+pound+" pound");
        }
        else if(ch == 5)
        {
            System.out.println("Your Choice Is SWISS");

            rupee=amount/86.11;
            System.out.println("Your "+amount+" Swiss is "+rupee+" rupee");

            dollar=amount*0.94525;
            System.out.println("Your "+amount+" Swiss is "+rupee+" rupee");

            yen=amount*0.0068;
            System.out.println("Your "+amount+" Swiss is "+yen+" yen");

            euro=amount*0.9825;
            System.out.println("Your "+amount+" Swiss is "+euro+" euro");

            yuan=amount/7.60;
            System.out.println("Your "+amount+" Swiss is "+yuan+" yuan");

            pound=amount*1.139323;
            System.out.println("Your "+amount+" Swiss is "+pound+" pound");
        }
        else if(ch == 6)
        {
            System.out.println("Your Choice Is YUAN");

            rupee=amount/11.33;
            System.out.println("Your "+amount+" Yuan is "+rupee+" rupee");

            dollar=amount/0.14;
            System.out.println("Your "+amount+" Yuan is "+dollar+" dollar");

            yen=amount/19.28;
            System.out.println("Your "+amount+" Yuan is "+yen+" yen");

            euro=amount/0.13;
            System.out.println("Your "+amount+" Yuan is "+euro+" euro");

            swiss=amount/0.13;
            System.out.println("Your "+amount+" Yuan is "+swiss+" swiss");

            pound=0.12;
            System.out.println("Your "+amount+" Yuan is "+pound+" pound");
        }
        else if(ch == 7)
        {
            System.out.println("Your Choice Is POUND");

            rupee=amount/97.88;
            System.out.println("Your "+amount+" Pound is "+rupee+" rupee");

            dollar=amount/1.20;
            System.out.println("Your "+amount+" Pound is "+rupee+" rupee");

            yen=amount/166.53;
            System.out.println("Your "+amount+" Pound is "+yen+" yen");

            euro=amount/1.16;
            System.out.println("Your "+amount+" Pound is "+euro+" euro");

            swiss=amount/1.14;
            System.out.println("Your "+amount+" Pound is "+swiss+" swiss");

            yuan=amount/8.64;
            System.out.println("Your "+amount+" Pound is "+yuan+" yuan");
        }
    }
}