import java.awt.*;
import java.awt.event.*;

class Taxc extends Frame {
    TextField t, t2, t3, t4, t5, t6, t7, t8, t9, t0, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22, t23, t24, t25, t26, t27;
    Label resultLabel;

    Taxc() {
        setTitle("TaxC");
        setSize(1920, 1080);
        setLayout(null); 
        setVisible(true);
        setBackground(Color.LIGHT_GRAY);

        // Income details
        Label l = new Label("Calculate your income tax");
        l.setFont(new Font("Arial", Font.BOLD, 16)); 

        // Result lable to show the final tax 
        resultLabel = new Label("");
        resultLabel.setFont(new Font("Arial", Font.BOLD, 14));
        resultLabel.setBounds(770, 400, 300, 30);
        add(resultLabel);

      
        Label l2 = new Label("Income Details:");
        l2.setFont(new Font("Arial", Font.PLAIN, 15)); 

        Label l3 = new Label("Gross income From salary");
        l3.setFont(new Font("Arial", Font.PLAIN, 12)); 

        Label l4 = new Label("Income From interest");
        l4.setFont(new Font("Arial", Font.PLAIN, 12)); 

        Label l5 = new Label("Rental Income recieved");
        l5.setFont(new Font("Arial", Font.PLAIN, 12)); 

        Label l6 = new Label("Income From other sources (Interest, Divident, etc)");
        l6.setFont(new Font("Arial", Font.PLAIN, 12)); 

        //Deductions

        Label l7 = new Label("Deductions: ");
        l7.setFont(new Font("Arial", Font.PLAIN, 15)); 
        l7.setBounds(30, 400, 300,30);
        add(l7);

        Label l8 = new Label("Under 80C: ");
        l8.setFont(new Font("Arial", Font.PLAIN, 14));
        l8.setBounds(30, 435, 300, 30);
        add(l8);

        Label l9 = new Label("Life Insurance Premium");
        l9.setFont(new Font("Arial", Font.PLAIN, 12));
        l9.setBounds(30, 470, 300, 30);
        add(l9);
        TextField t5 = new TextField();
        t5.setBounds(30, 500, 300, 30);
        add(t5);

        Label l0 = new Label("Public Provident Fund");
        l0.setFont(new Font("Arial", Font.PLAIN, 12));
        l0.setBounds(30, 534, 300, 30);
        add(l0);
        TextField t6 = new TextField();
        t6.setBounds(30, 558, 300, 30);
        add(t6);

        Label l11 = new Label("Contribution to provident Fund");
        l11.setFont(new Font("Arial", Font.PLAIN, 12));
        l11.setBounds(30, 592, 300, 30);
        add(l11);
        TextField t7 = new TextField();
        t7.setBounds(30, 616, 300, 30);
        add(t7);

        Label l12 = new Label("Tax Saving Fixed Deposite");
        l12.setFont(new Font("Arial", Font.PLAIN, 12));
        l12.setBounds(30, 651, 300, 30);
        add(l12);
        TextField t8 = new TextField();
        t8.setBounds(30, 675, 300, 30);
        add(t8);

        Label l13 = new Label("Repayment of Principle on Housing Loan");
        l13.setFont(new Font("Arial", Font.PLAIN, 12));
        l13.setBounds(30, 710, 300, 30);
        add(l13);
        TextField t9 = new TextField();
        t9.setBounds(30, 734, 300, 30);
        add(t9);

        Label l14 = new Label("ULPI/Tax Sabing Investment Plans");
        l14.setFont(new Font("Arial", Font.PLAIN, 12));
        l14.setBounds(30, 769, 300, 30);
        add(l14);
        TextField t0 = new TextField();
        t0.setBounds(30, 793, 300, 30);
        add(t0);

        Label l15 = new Label("Equity Linked Savings Schemes (ELSS)");
        l15.setFont(new Font("Arial", Font.PLAIN, 12));
        l15.setBounds(30, 828, 300, 30);
        add(l15);
        TextField t11 = new TextField();
        t11.setBounds(30, 852, 300, 30);
        add(t11);

        Label l16 = new Label("Employee Contribution to NPS u/s 80CCD(1)");
        l16.setFont(new Font("Arial", Font.PLAIN, 12));
        l16.setBounds(30, 887, 300, 30);
        add(l16);
        TextField t12 = new TextField();
        t12.setBounds(30, 911, 300, 30);
        add(t12);

        Label l17 = new Label("Tution Fees");
        l17.setFont(new Font("Arial", Font.PLAIN, 12));
        l17.setBounds(30, 946, 300, 30);
        add(l17);
        TextField t13 = new TextField();
        t13.setBounds(30, 970, 300, 30);
        add(t13);


        //under 80D
        Label l19 = new Label("Under 80D: ");
        l19.setFont(new Font("Arial", Font.PLAIN, 14));
        l19.setBounds(400, 85, 300, 30);
        add(l19);

        Label l18 = new Label("For Self & Family");
        l18.setFont(new Font("Arial", Font.PLAIN, 12));
        l18.setBounds(400, 120, 300, 30);
        add(l18);
        TextField t14 = new TextField();
        t14.setBounds(400, 144, 300, 30);
        add(t14);

        Label l20 = new Label("Preventive Checkup");
        l20.setFont(new Font("Arial", Font.PLAIN, 12));
        l20.setBounds(400, 179, 300, 30);
        add(l20);
        TextField t15 = new TextField();
        t15.setBounds(400, 203, 300, 30);
        add(t15);

        Label l21 = new Label("For Parents below 60 years");
        l21.setFont(new Font("Arial", Font.PLAIN, 12));
        l21.setBounds(400, 238, 300, 30);
        add(l21);
        TextField t16 = new TextField();
        t16.setBounds(400, 264, 300, 30);
        add(t16);

        Label l22 = new Label("For Parents above 60 years");
        l22.setFont(new Font("Arial", Font.PLAIN, 12));
        l22.setBounds(400, 299, 300, 30);
        add(l22);
        TextField t17 = new TextField();
        t17.setBounds(400, 323, 300, 30);
        add(t17);


        //other deductions
        Label l23 = new Label("Other Deductions: ");
        l23.setFont(new Font("Arial", Font.PLAIN, 14)); 
        l23.setBounds(400, 400, 300,30);
        add(l23);

        Label l24 = new Label("HRA u/s 10 (13A)");
        l24.setFont(new Font("Arial", Font.PLAIN, 12));
        l24.setBounds(400, 470, 300, 30);
        add(l24);
        TextField t18 = new TextField();
        t18.setBounds(400, 500, 300, 30);
        add(t18);

        Label l25 = new Label("Employee Contribution to NPS (80CCD(1B))");
        l25.setFont(new Font("Arial", Font.PLAIN, 12));
        l25.setBounds(400, 534, 300, 30);
        add(l25);
        TextField t19 = new TextField();
        t19.setBounds(400, 558, 300, 30);
        add(t19);

        Label l26 = new Label("Interest on Housing loan Section 24");
        l26.setFont(new Font("Arial", Font.PLAIN, 12));
        l26.setBounds(400, 592, 300, 30);
        add(l26);
        TextField t20 = new TextField();
        t20.setBounds(400, 616, 300, 30);
        add(t20);

        Label l27 = new Label("Savings Account interest (Section 80TTA)");
        l27.setFont(new Font("Arial", Font.PLAIN, 12));
        l27.setBounds(400, 651, 300, 30);
        add(l27);
        TextField t21 = new TextField();
        t21.setBounds(400, 675, 300, 30);
        add(t21);

        Label l28 = new Label("Professional Tax");
        l28.setFont(new Font("Arial", Font.PLAIN, 12));
        l28.setBounds(400, 710, 300, 30);
        add(l28);
        TextField t22 = new TextField();
        t22.setBounds(400, 734, 300, 30);
        add(t22);

        Label l29 = new Label("Donation u/s 80G");
        l29.setFont(new Font("Arial", Font.PLAIN, 12));
        l29.setBounds(400, 769, 300, 30);
        add(l29);
        TextField t23 = new TextField();
        t23.setBounds(400, 793, 300, 30);
        add(t23);

        Label l30 = new Label("Others");
        l30.setFont(new Font("Arial", Font.PLAIN, 12));
        l30.setBounds(400, 828, 300, 30);
        add(l30);
        TextField t24 = new TextField();
        t24.setBounds(400, 852, 300, 30);
        add(t24);


        //Tax Paid

        Label l31 = new Label("Tax Paid");
        l31.setFont(new Font("Arial", Font.PLAIN, 14)); 
        l31.setBounds(770, 85, 300,30);
        add(l31);

        Label l32 = new Label("TDS");
        l32.setFont(new Font("Arial", Font.PLAIN, 12));
        l32.setBounds(770, 120, 300, 30);
        add(l32);
        TextField t25 = new TextField();
        t25.setBounds(770, 144, 300, 30);
        add(t25);

        Label l33 = new Label("Advance Tax");
        l33.setFont(new Font("Arial", Font.PLAIN, 12));
        l33.setBounds(770, 179, 300, 30);
        add(l33);
        TextField t26 = new TextField();
        t26.setBounds(770, 203, 300, 30);
        add(t26);

        Label l34 = new Label("Self-Assessment Tax");
        l34.setFont(new Font("Arial", Font.PLAIN, 12));
        l34.setBounds(770, 238, 300, 30);
        add(l34);
        TextField t27 = new TextField();
        t27.setBounds(770, 264, 300, 30);
        add(t27);

     
       
        //income details

        TextField t = new TextField();
        TextField t2 = new TextField();
        TextField t3 = new TextField();
        TextField t4 = new TextField();
        
        l.setBounds(30, 50, 300, 30); 
        l2.setBounds(30, 85, 300, 30); 
        l3.setBounds(30, 120, 300, 30); 
        t.setBounds(30, 144, 300, 30);
        l4.setBounds(30, 179, 300, 30); 
        t2.setBounds(30,203, 300, 30 );              
        l5.setBounds(30,238, 300, 30);
        t3.setBounds(30,264, 300,30 );
        l6.setBounds(30, 299, 300, 30); 
        t4.setBounds(30, 323, 300, 30); 

        add(l); 
        add(l2);
        add(l3);
        add(t);
        add(l4);
        add(t2);
        add(l5);
        add(t3);
        add(l6);
        add(t4);

        
        

        // Submit button with event handling
        Button submitButton = new Button("Calculate Tax");
        submitButton.setBounds(770, 324, 300, 30);
        submitButton.setBackground(new Color(128, 0, 128));  
        submitButton.setForeground(Color.WHITE); 
        add(submitButton);
        
        // Add ActionListener to handle button click
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculateTax();
            }
        });

        // Setup for closing the window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose(); 
                System.exit(0); 
            }
        });
    }
    
    @Override
    public void paint(Graphics g) {
        g.setColor(new Color(128, 0, 128)); 
        g.drawLine(370, 20, 370, 1050); 
        g.drawLine(740, 20, 740, 1050); 
        g.drawLine(1110, 20, 1110, 1050); 
    }

    // Method to calculate tax when the button is clicked
    private void calculateTax() {
        try {
            // Retrieve input values from text fields
            double grossSalary = Double.parseDouble(t.getText());
            double interestIncome = Double.parseDouble(t2.getText());
            double rentalIncome = Double.parseDouble(t3.getText());
            double otherIncome = Double.parseDouble(t4.getText());

            // Deductions
            double lifeInsurance = Double.parseDouble(t5.getText());
            double providentFund = Double.parseDouble(t6.getText());
            double housingLoan = Double.parseDouble(t7.getText());

            // Tax calculation
            double totalIncome = grossSalary + interestIncome + rentalIncome + otherIncome;
            double totalDeductions = lifeInsurance + providentFund + housingLoan;
            double taxableIncome = totalIncome - totalDeductions;

            double tax = 0;
            if (taxableIncome > 500000) {
                tax = taxableIncome * 0.2; // Apply 20% tax if income is greater than 50,0000
            } else if (taxableIncome > 250000) {
                tax = taxableIncome * 0.1; // Apply 10% tax if income is between 2,50,000 and 50,0000
            }

           
            resultLabel.setText("Total Tax: ₹" + String.format("%.2f", tax));

        } catch (NumberFormatException ex) {
            
            resultLabel.setText("Please enter valid numbers.");
        }
    }

    public static void main(String[] args) {
        new Taxc(); 
    }
}
