import java.util.*;

class Hotel {
         
 String name,c_name,c_phnum,c_addharnum;
  long mo_number;
  double salary,c_age;
  double bill_of_food, bill_of_room;
  int i, n;
  boolean tt=true;
  static int c = 0, x = 0;
  String new_Password;
  Scanner sc = new Scanner(System.in);

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    Hotel h = new Hotel(5);
	Hotel f[] = new Hotel[10];
    Hotel a[] = new Hotel[7];
   
    a[0] = new Hotel();
    a[1] = new Hotel();
    a[2] = new Hotel();
    a[3] = new Hotel();
    a[4] = new Hotel();
    a[5] = new Hotel();
    a[6] = new Hotel();
    for (int i = 0; i < 10; i++) {
      f[i] = new Hotel();
    }
	a[0].name = "Ankit Bhayani Chef";
	a[0].salary = 20000;
    a[0].mo_number = 9574315467L;
    a[1].name = "Sanjay Gujjar";
    a[1].salary = 18000;
    a[1].mo_number = 8934592751L;
    a[2].name = "Tejas Shah";
    a[2].salary = 21500;
    a[2].mo_number = 9163459769L;
    a[3].name = "Jatin Modi";
    a[3].salary = 30500;
    a[3].mo_number = 9846923419L;
    a[4].name = "Jeni Luise ";
    a[4].salary = 25000;
    a[4].mo_number = 9265425781L;
    a[5].name = "Ruhi Pandya";
    a[5].salary = 20500;
    a[5].mo_number = 8467928446L;
    a[6].name = "Rohit Mishra";
    a[6].salary = 50000;
    a[6].mo_number = 9967483187L;

    h.management(a, h, f);
  }

  Hotel(int a) {
    System.out.println("\nWelcome to Hotel Taj ");
  }

  void management(Hotel[] a, Hotel h, Hotel[] f) {
    f[i] = new Hotel();
    while (true) {
      Scanner sc = new Scanner(System.in);
      System.out.println("\nWhat would you like to do  ");
      System.out.println("1 : Know more about our Hotel ");
      System.out.println("2 : Know more about our Employees ");
      System.out.println("3 : Change Employees Details");
      System.out.println("4 : Room Booking");
      System.out.println("5 : Room Details ");
      System.out.println("6 : What do you want to eat ? ");
      System.out.println("7 : Todays Total Revenue");
      System.out.println("8 : Quit ");
      int choise = sc.nextInt();
	  System.out.println(""); 
      switch (choise) {
        case 1:
          {
            info();
            break;
          }
        case 2:
          {
            printEmployee(a);
            break;
          }
        case 3:
          {
            change_details(a);
            break;
          }
        case 4:
          {
            Booking(f);
            break;
          }
        case 5:
          {
            Room_details();
            break;
          }
        case 6:
          {
            CustomerFood(f);
            break;
          }
        case 7:
          {
            finalFoodBill(f);
            break;
          }
        case 8:
          System.out.println("Thank You!");
          return;
        default:
          System.out.println("\nInvalid choice. Please try again.");
          break;
      }
    }
  }

  Hotel() {}

  void info() {
    System.out.println(
      "Taj Skyline is a chain of luxury hotels and a subsidiary of the Indian Hotels Company Limited"
    );
    System.out.println("Founded	 : 1902; 121 years ago");
    System.out.println("Founder	 : Jamsetji Tata");
    System.out.println("Services : Hotels and resorts");
    System.out.println(
      "Address  : The Taj Skyline, Sindhu Bhavan Marg, PRL Colony, Thaltej, Ahmedabed, Gujarat 380058"
    );
  }

  void printEmployee(Hotel[] a) {
    boolean dd1 = true;
    int count = 0;
	x=0;
    while (dd1) {
		sc.nextLine();
      System.out.println("Enter Password");
      new_Password = sc.nextLine();
      if ((new_Password).equals("LJU999")) {
        for (int i = 0; i < 7; i++) {
          x++;
          System.out.println("		Employee " + x + " Name: " + a[i].name);
          System.out.println("		Employee " + x + " Salary: " + a[i].salary);
          System.out.println("		Employee " + x + " Mobile Number: " + a[i].mo_number);
			System.out.println("\n                ************************************               \n");
        }

        dd1 = false;
        break;
      } else {
        System.out.println("Invalid Combintion,try again");
        count++;
        if (count == 3) {
          System.out.println("Your system will be lock for 10 minutes");
          break;
        }
      }
    }
  }
  
  void finalFoodBill(Hotel[] f) {
    double Total_food_bill = 0, Total_room_bill = 0;
    for (int i = 0; i < 10; i++) {
      Total_food_bill += f[i].bill_of_food;
      Total_room_bill += f[i].bill_of_room;
    }
    System.out.println("Today's Total Food Revenue is: " + Total_food_bill);
    System.out.println("Today's Total Room Revenue is: " + Total_room_bill);
    System.out.println(
      "Today's Total Revenue is: " + (Total_food_bill + Total_room_bill)
    );
  }

  void CustomerFood(Hotel[] f) {
    boolean bb;
    for (i = i; i < c; i++) {
      bb = true;

      while (bb) {
        System.out.println();
        System.out.println("Enter Order of Room Number " + (i + 1));
        System.out.println();
        System.out.println("STARTERS\n");
        System.out.println("1.Hot & sour Soup ----------------200");
        System.out.println("2.Tomato soup---------------------200");
        System.out.println("3.Chili panner--------------------300");
        System.out.println("4.Pasta---------------------------250");
        System.out.println("5.Cheese bole---------------------300");
        System.out.println("\nMAIN COURCE\n");
        System.out.println("6.Panjabi sabji(kaju masala)------500");
        System.out.println("7.paneer haandi-------------------450");
        System.out.println("8.cheese butter masala------------600");
        System.out.println("9.naan----------------------------150");
        System.out.println("10.rumali roti--------------------100");
        System.out.println("11.butter chapati-----------------50");
        System.out.println("12.Jeera Rice---------------------300");
        System.out.println("13.Dal Fry------------------------250");
        System.out.println("\nDRINKS\n");
        System.out.println("14.Maaza--------------------------40");
        System.out.println("15.thums up-----------------------40");
        System.out.println("16.sprite-------------------------40");
        System.out.println("17.Butter milk--------------------50");
        System.out.println("\nDESSERTS\n");
        System.out.println("18.brownie------------------------150");
        System.out.println("19.Ice Cream(american dryfruites)-150");
        System.out.println("20.Cocolate Ice Cream-------------150");
        System.out.println("21.Donuts-------------------------200");
        System.out.println("22.Strawberry Ice Cream-----------150");
        System.out.println("23.special kulfi------------------100");
        System.out.println("24.Exit----------------");
        System.out.println("Enter Your Choice");
        int ch = sc.nextInt();
        if (ch == 24) {
          bb = false;
        }
        if (ch != 24) {
          System.out.println("Enter number quantity");
          n = sc.nextInt();
        }
        switch (ch) {
          case 1:
            {
              f[i].bill_of_food += (200 * n);
              System.out.println("Your Bill is :" + f[i].bill_of_food);
  
              break;
            }
          case 2:
            {
              f[i].bill_of_food += (200 * n);
              System.out.println("Your Bill is :" + f[i].bill_of_food);
              break;
            }
          case 3:
            {
              f[i].bill_of_food += (300 * n);
              System.out.println("Your Bill is:" + f[i].bill_of_food);
              break;
            }
          case 4:
            {
              f[i].bill_of_food += (250 * n);
              System.out.println("Your Bill is:" + f[i].bill_of_food);
              break;
            }
          case 5:
            {
              f[i].bill_of_food += (300 * n);
              System.out.println("Your Bill is:" + f[i].bill_of_food);
              break;
            }
          case 6:
            {
              f[i].bill_of_food += (500 * n);
              System.out.println("Your Bill is:" + f[i].bill_of_food);
              break;
            }
          case 7:
            {
              f[i].bill_of_food += (450 * n);
              System.out.println("Your Bill is:" + f[i].bill_of_food);
              break;
            }
          case 8:
            {
              f[i].bill_of_food += (600 * n);
              System.out.println("Your Bill is" + f[i].bill_of_food);
              break;
            }
          case 9:
            {
              f[i].bill_of_food += (150 * n);
              System.out.println("Your Bill is:" + f[i].bill_of_food);
              break;
            }
          case 10:
            {
              f[i].bill_of_food += (100 * n);
              System.out.println("Your Bill is:" + f[i].bill_of_food);
              break;
            }
          case 11:
            {
              f[i].bill_of_food += (50 * n);
              System.out.println("Your Bill is:" + f[i].bill_of_food);
              break;
            }
          case 12:
            {
              f[i].bill_of_food += (300 * n);
              System.out.println("Your Bill is:" + f[i].bill_of_food);
              break;
            }
          case 13:
            {
              f[i].bill_of_food += (250 * n);
              System.out.println("Your Bill is:" + f[i].bill_of_food);
              break;
            }
          case 14:
            {
              f[i].bill_of_food += (40 * n);
              System.out.println("Your Bill is:" + f[i].bill_of_food);
              break;
            }
          case 15:
            {
              f[i].bill_of_food += (40 * n);
              System.out.println("Your Bill is:" + f[i].bill_of_food);
              break;
            }
          case 16:
            {
              f[i].bill_of_food += (40 * n);
              System.out.println("Your Bill is:" + f[i].bill_of_food);
              break;
            }
          case 17:
            {
              f[i].bill_of_food += (50 * n);
              System.out.println("Your Bill is:" + f[i].bill_of_food);
              break;
            }
          case 18:
            {
              f[i].bill_of_food += (150 * n);
              System.out.println("Your Bill is:" + f[i].bill_of_food);
              break;
            }
          case 19:
            {
              f[i].bill_of_food += (150 * n);
              System.out.println("Your Bill is:" + f[i].bill_of_food);
              break;
            }
          case 20:
            {
              f[i].bill_of_food += (150 * n);
              System.out.println("Your Bill is:" + f[i].bill_of_food);
              break;
            }
          case 21:
            {
              f[i].bill_of_food += (200 * n);
              System.out.println("Your Bill is:" + f[i].bill_of_food);
              break;
            }
          case 22:
            {
              f[i].bill_of_food += (150 * n);
              System.out.println("Your Bill is:" + f[i].bill_of_food);
              break;
            }
          case 23:
            {
              f[i].bill_of_food += (100 * n);
              System.out.println("Your Bill is:" + f[i].bill_of_food);
              break;
            }
          case 24:
            {
              System.out.println("Thank you!");
              break;
            }
          default:
            {
              System.out.println("Enter A Valid Choice");
              break;
            }
        }
      }
    }
  }

  void Booking(Hotel[] f) {
    if (c == 9) {
      System.out.println("Room is not available");
      return;
    }

    System.out.println("\n**WELCOME TO OUR SUITE\n");
    System.out.println("\nWe have one bed Suite and two bed Suite\n");
	System.out.println("\n1) One bed with A.C. price is 5000 for one day ");
    System.out.println("\n2) One bed with NON A.C. price is 4500 for one day ");
    System.out.println("\n3) Two bed with A.C. price is 8000 for one day ");
    System.out.println("\n4) Two bed with NON A.C. price is 7500 for one day \n");
    System.out.println("1 : One bed");
    System.out.println("2 : Two bed");
    System.out.println("3 : Exit");

   
    int n1 = sc.nextInt();
    switch (n1) {
      case 1:
        {
          System.out.println("\nwe have A.C. Suite and NON A.C. Suite\n");
          System.out.println("1 : A.C.");
          System.out.println("2 : NON A.C.");
          System.out.println("3 : Exit");
          int nn1 = sc.nextInt();
          switch (nn1) {
            case 1:
              {
                System.out.println(
                  "\none bed with A.C. price is 5000 for one day "
                );
				
		sc.nextLine();
		System.out.println("Enter Name of The Customers : ");
        f[c].c_name = sc.nextLine();
		 tt=true;
        while(tt) {
			String check_phnum="1234567890";
            System.out.println("Enter Your Phone Number : ");
            f[c].c_phnum = sc.nextLine();
            sc.nextLine();
			
			if(f[c].c_phnum.length()!=10)
			{
				System.out.println("Enter valid phone number");
			}
			else
			{
				int l=0;
			for(int i=0;i<10;i++)
			{
			char ch=f[c].c_phnum.charAt(i);
            
			
            if ((check_phnum.indexOf(ch)==-1 )) {
               if(l==0)
			   {
			   System.out.println("Enter A Valid Phone Number : ");
			   }l++;
            } 
            else
			{
				tt=false;
			}
			}
			}
			 }
			 f[c].bill_of_room += 5000;
                c++;
                break;
              }
            case 2:
              {
                System.out.println(
                  "\none bed with NON A.C. price is 4500 for one day "
                );
				
				sc.nextLine();
		 System.out.println("Enter Name of The Customers : ");
        f[c].c_name = sc.nextLine();
		 tt=true;
        while(tt) {
			String check_phnum="1234567890";
            System.out.println("Enter Your Phone Number : ");
            f[c].c_phnum = sc.nextLine();
            sc.nextLine();
			
			if(f[c].c_phnum.length()!=10)
			{
				System.out.println("Enter valid phone number");
			}
			else
			{
				int l=0;
			for(int i=0;i<10;i++)
			{
			char ch=f[c].c_phnum.charAt(i);
            
			
            if ((check_phnum.indexOf(ch)==-1 )) {
               if(l==0)
			   {
			   System.out.println("Enter A Valid Phone Number : ");
			   }l++;
            } 
            else
			{
				tt=false;
			}
			}
			}
			 }
                f[c].bill_of_room += 4500;
                c++;
                break;
              }
            case 3:
              System.out.println("Thank You!");
              return;
            default:
              System.out.println("\nInvalid choice. Please try again.");
              break;
          }
          break;
        }
      case 2:
        {
          System.out.println("\nwe have A.C. Suite and NON A.C. Suite\n");
          System.out.println("1 : A.C.");
          System.out.println("2 : NON A.C.");
          System.out.println("3 : Exit");
          int nn1 = sc.nextInt();
          switch (nn1) {
            case 1:
              {
                System.out.println(
                  "\ntwo bed with A.C. price is 8000 for one day "
                );
				sc.nextLine();
		 System.out.println("Enter Name of The Customers : ");
        f[c].c_name = sc.nextLine();
		 tt=true;
        while(tt) {
			String check_phnum="1234567890";
            System.out.println("Enter Your Phone Number : ");
            f[c].c_phnum = sc.nextLine();
            sc.nextLine();
			
			if(f[c].c_phnum.length()!=10)
			{
				System.out.println("Enter valid phone number");
			}
			else
			{
				int l=0;
			for(int i=0;i<10;i++)
			{
			char ch=f[c].c_phnum.charAt(i);
            
			
            if ((check_phnum.indexOf(ch)==-1 )) {
               if(l==0)
			   {
			   System.out.println("Enter A Valid Phone Number : ");
			   }l++;
            } 
            else
			{
				tt=false;
			}
			}
			}
			 }
                f[c].bill_of_room += 8000;
                c++;
                break;
              }
            case 2:
              {
                System.out.println(
                  "\ntwo bed with NON A.C. price is 7500 for one day "
                );
				sc.nextLine();
		 System.out.println("Enter Name of The Customers : ");
        f[c].c_name = sc.nextLine();
		 tt=true;
        while(tt) {
			String check_phnum="1234567890";
            System.out.println("Enter Your Phone Number : ");
            f[c].c_phnum = sc.nextLine();
            sc.nextLine();
			
			if(f[c].c_phnum.length()!=10)
			{
				System.out.println("Enter valid phone number");
			}
			else
			{
				int l=0;
			for(int i=0;i<10;i++)
			{
			char ch=f[c].c_phnum.charAt(i);
            
			
            if ((check_phnum.indexOf(ch)==-1 )) {
               if(l==0)
			   {
			   System.out.println("Enter A Valid Phone Number : ");
			   }l++;
            } 
            else
			{
				tt=false;
			}
			}
			}
			 }
                f[c].bill_of_room += 7500;
                c++;
                break;
              }
            case 3:
              System.out.println("Thank You!");
              return;
            default:
              System.out.println("\nInvalid choice. Please try again.");
              break;
          }
          break;
        }
      case 3:
        {
          System.out.println("Thank You!");
          return;
        }
      default:
        System.out.println("\nInvalid choice. Please try again.");
        break;
    }
  }

  void Room_details() {
    for (int i = 1; i <= c; i++) {
      System.out.println("Room " + i + " is booked");
    }
    for (int i = c + 1; i <= 10; i++) {
      System.out.println("Room " + i + " is not booked");
    }
  }

  void change_details(Hotel[] a) {
    boolean dd1 = true;
    int count = 0;
    while (dd1) {
		
      System.out.println("Enter Password");
      new_Password = sc.nextLine();
      if ((new_Password).equals("LJU999")) {
        while (true) {
          System.out.println("what do you want to change?");
          System.out.println("1 : Employee Name");
          System.out.println("2 : Employee Salary");
          System.out.println("3 : Employee Mobile number");
          System.out.println("4 : quit");
          int c = sc.nextInt();
          switch (c) {
            case 1:
              {
                System.out.println("Which Employee name  you want to change?");
                System.out.println("1 : Employee One");
                System.out.println("2 : Employee Two");
                System.out.println("3 : Employee Three");
                System.out.println("4 : Employee Four");
                System.out.println("5 : Employee Five");
                System.out.println("6 : Employee Six");
                System.out.println("7 : Employee Seven");
                System.out.println("8 : Quit");
                int n = sc.nextInt();
                switch (n) {
                  case 1:
                    {
                      sc.nextLine();
                      System.out.println(
                        "Enter new name of " + n + " Employee"
                      );
                      a[0].name = sc.nextLine();
                      break;
                    }
                  case 2:
                    {
                      sc.nextLine();
                      System.out.println(
                        "Enter new name of " + n + " Employee"
                      );
                      a[1].name = sc.nextLine();
                      break;
                    }
                  case 3:
                    {
                      sc.nextLine();
                      System.out.println(
                        "Enter new name of " + n + " Employee"
                      );
                      a[2].name = sc.nextLine();
                      break;
                    }
                  case 4:
                    {
                      sc.nextLine();
                      System.out.println(
                        "Enter new name of " + n + " Employee"
                      );
                      a[3].name = sc.nextLine();
                      break;
                    }
                  case 5:
                    {
                      sc.nextLine();
                      System.out.println(
                        "Enter new name of " + n + " Employee"
                      );
                      a[4].name = sc.nextLine();
                      break;
                    }
                  case 6:
                    {
                      sc.nextLine();
                      System.out.println(
                        "Enter new name of " + n + " Employee"
                      );
                      a[5].name = sc.nextLine();
                      break;
                    }
                  case 7:
                    {
                      sc.nextLine();
                      System.out.println(
                        "Enter new name of " + n + " Employee"
                      );
                      a[6].name = sc.nextLine();
                      break;
                    }
                  case 8:
                    {
                      System.out.println("Thank You!");
                      return;
                    }
                  default:
                    System.out.println("\nInvalid choice. Please try again.");
                    break;
                }
                break;
              }
            case 2:
              {
                System.out.println(
                  "Which Employee salary  you want to change?"
                );
                System.out.println("1 : Employee One");
                System.out.println("2 : Employee Two");
                System.out.println("3 : Employee Tree");
                System.out.println("4 : Employee Four");
                System.out.println("5 : Employee Five");
                System.out.println("6 : Employee Six");
                System.out.println("7 : Employee Seven");
                System.out.println("8 : Quit");
                int s = sc.nextInt();
				System.out.println(""); 
                switch (s) {
                  case 1:
                    {
                      sc.nextLine();
                      System.out.println(
                        "Enter new salary of " + s + " Employee"
                      );
                      a[0].salary = sc.nextDouble();
                      break;
                    }
                  case 2:
                    {
                      sc.nextLine();
                      System.out.println(
                        "Enter new salary of " + s + " Employee"
                      );
                      a[1].salary = sc.nextDouble();
                      break;
                    }
                  case 3:
                    {
                      sc.nextLine();
                      System.out.println(
                        "Enter new salary of " + s + " Employee"
                      );
                      a[2].salary = sc.nextDouble();
                      break;
                    }
                  case 4:
                    {
                      sc.nextLine();
                      System.out.println(
                        "Enter new salary of " + s + " Employee"
                      );
                      a[3].salary = sc.nextDouble();
                      break;
                    }
                  case 5:
                    {
                      sc.nextLine();
                      System.out.println(
                        "Enter new salary of " + s + " Employee"
                      );
                      a[4].salary = sc.nextDouble();
                      break;
                    }
                  case 6:
                    {
                      sc.nextLine();
                      System.out.println(
                        "Enter new salary of " + s + " Employee"
                      );
                      a[5].salary = sc.nextDouble();
                      break;
                    }
                  case 7:
                    {
                      sc.nextLine();
                      System.out.println(
                        "Enter new salary of " + s + " Employee"
                      );
                      a[6].salary = sc.nextDouble();
                      break;
                    }
                  case 8:
                    {
                      System.out.println("Thank You!");
                      return;
                    }
                  default:
                    System.out.println("\nInvalid choice. Please try again.");
                    break;
                }
                break;
              }
            case 3:
              {
                System.out.println(
                  "Which Employee mobile number you want to change?"
                );
                System.out.println("1 : Employee One");
                System.out.println("2 : Employee Two");
                System.out.println("3 : Employee Three");
                System.out.println("4 : Employee Four");
                System.out.println("5 : Employee Five");
                System.out.println("6 : Employee Six");
                System.out.println("7 : Employee Seven");
                System.out.println("8 : Quit");
                int m = sc.nextInt();
				System.out.println("");

                switch (m) {
                  case 1:
                    {
                      sc.nextLine();
                      System.out.println(
                        "Enter new mobile number of " + m + " Employee"
                      );
                      a[0].mo_number = sc.nextLong();
                      break;
                    }
                  case 2:
                    {
                      sc.nextLine();
                      System.out.println(
                        "Enter new mobile number of " + m + " Employee"
                      );
                      a[1].mo_number = sc.nextLong();
                      break;
                    }
                  case 3:
                    {
                      sc.nextLine();
                      System.out.println(
                        "Enter new mobile number of " + m + " Employee"
                      );
                      a[2].mo_number = sc.nextLong();
                      break;
                    }
                  case 4:
                    {
                      sc.nextLine();
                      System.out.println(
                        "Enter new mobile number of " + m + " Employee"
                      );
                      a[3].mo_number = sc.nextLong();
                      break;
                    }
                  case 5:
                    {
                      sc.nextLine();
                      System.out.println(
                        "Enter new mobile number of " + m + " Employee"
                      );
                      a[4].mo_number = sc.nextLong();
                      break;
                    }
                  case 6:
                    {
                      sc.nextLine();
                      System.out.println(
                        "Enter new mobile number of " + m + " Employee"
                      );
                      a[5].mo_number = sc.nextLong();
                      break;
                    }
                  case 7:
                    {
                      sc.nextLine();
                      System.out.println(
                        "Enter new mobile number of " + m + " Employee"
                      );
                      a[6].mo_number = sc.nextLong();
                      break;
                    }
                  case 8:
                    {
                      System.out.println("Thank You!");
                      return;
                    }
                  default:
                    System.out.println("\nInvalid choice. Please try again.");
                    break;
                }
                break;
              }
            case 4:
              {
                System.out.println("Thank You!");
                dd1 = false;
                return;
              }
            default:
              System.out.println("\nInvalid choice. Please try again.");
              break;
          }
        }
      } else {
        System.out.println("not matched try again");
        count++;
        if (count == 3) {
          System.out.println("your system will be lock for 10 minutes");
          break;
        }
      }
    }
  }
}