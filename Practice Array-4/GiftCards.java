import java.text.DateFormat;

import java.text.NumberFormat;

import java.text.SimpleDateFormat;

import java.util.Date;

import javax.swing.JOptionPane;
//Sammy Student

public class GiftCards

{

static NumberFormat nf = NumberFormat.getCurrencyInstance();

Date myDate = new Date();

String myDateFormat = "MM/dd/yyyy";

SimpleDateFormat dtToday = new SimpleDateFormat(myDateFormat);

// define the class data members

public boolean expires;

private double balance;

public int cardNum;

private char cardType;

public String issueDate;

private String holder;

// define the member methods

// default constructor

public GiftCards() {}

// overloaded constructor

public GiftCards(String n, double amt)

{

holder = n;

balance = amt;

}

public void IssueGiftCard()

{

System.out.println("");

System.out.println(" Card Issued");

System.out.println(" Today's Date is: " + dtToday.format(myDate));

System.out.println(" Card Holder . . . " + holder);

System.out.println(" Card Amount . . . " + balance);

}
public double getBalance()

{

return balance;

}

public void setBalance(double b)

{

balance = b;

}

public String getHolder()

{

return holder;

}

public void setHolder(String h)

{

holder = h;

}

public void printCurrentGiftCardInfo(double spend)

{

System.out.println("");

System.out.println(" Card Balance");

System.out.println(" Today's Date is: " + dtToday.format(myDate));

System.out.println(" Card Amount . . . " + balance);

}

}
class TestGiftCards

//Sammy Student

{

public static void main(String[] args)

{

GiftCards gc = new GiftCards("", 0.0);

// display opening message

String message = "welcome";

JOptionPane.showMessageDialog(null, "Message: " + message,

"Message", JOptionPane.PLAIN_MESSAGE);

// set the gift card holder's name

String str =
JOptionPane.showInputDialog(null, "gift card holder's name : ");

gc.setHolder(str);

// obtain the gift card number

str = JOptionPane.showInputDialog(null, "gift card number : ");

gc.cardNum = Integer.parseInt(str);

// set the gift card amount

str = JOptionPane.showInputDialog(null, "gift card amount : ");

gc.setBalance(Double.parseDouble(str));

// issue the gift card

gc.IssueGiftCard();

// use the gift card

double useCard = 0;

str =
JOptionPane.showInputDialog(null, "deduct amount from card : ");

useCard = Double.parseDouble(str);

// verify amount to deduct will not yield negative balance

// print current card balance

gc.printCurrentGiftCardInfo(useCard);

}

}