package Assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.exit;

public class Account {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter Bank Account Details: ");
            System.out.println("Enter Bank Account Number: ");
            int accNo = Integer.parseInt(br.readLine());
            System.out.println("Enter Bank Customer Name: ");
            String custName = br.readLine();
            System.out.println("Enter Bank Account Type: ");
            String accountType = br.readLine();
            if (accountType.equalsIgnoreCase("savings")) {
                accountType = "savings";
            } else if (accountType.equalsIgnoreCase("current")) {
                accountType = "current";
            } else {
                System.out.println("Entered Wrong account type,exiting application!!!");
                exit(1);
            }
            System.out.println("Enter Account Balance: ");
            Float bal = Float.parseFloat(br.readLine());

            BankAccount account = new BankAccount(accNo, custName, accountType, bal);

           // System.out.println("----------------------------------");
            System.out.println("Customer Account opening details: ");
            System.out.println("Account Number: " + account.getAccNo());
            System.out.println("Customer Name: " + account.getCustName());
            System.out.println("Account Type: " + account.getAccType());
            System.out.println("Account Balance: " + account.getBalance());

            int choice;
            do {
                System.out.println("Enter 1 to Deposit into account.");
                System.out.println("Enter 2 for Withdrawl from account.");
                System.out.println("Enter 3 for Account Balance.");
                System.out.println("Enter 4 for Exit.");
               // System.out.println("----------------------------------");
                System.out.println("Enter your Choice: ");
                choice = Integer.parseInt(br.readLine());
                switch (choice) {
                    case 1:
                        System.out.println("Enter amount to deposit:");
                        int amount = Integer.parseInt(br.readLine());
                        account.deposit(amount);
                        break;

                    case 2:
                        System.out.println("Enter amount to withdraw:");
                        int remove = Integer.parseInt(br.readLine());
                        account.withdraw(remove);
                        break;

                    case 3:
                        System.out.println("Account Balance: " + account.getBalance());
                        break;

                    case 4:
                        System.out.println("Exiting the application!!!");
                        break;
                }

            } while (choice != 4);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
