import java.util.*;
class scientific{
    public void SIN(int x1)
    {
        double y1 = Math.toRadians(x1);
        System.out.println("Result is: "+(Math.sin(y1)));
    }
    public void COS(int x2)
    {
        double y2 = Math.toRadians(x2);
        System.out.println("Result is: "+(Math.cos(y2)));
    }
    public void TAN(int x3)
    {
        double y3 = Math.toRadians(x3);
        System.out.println("Result is: "+(Math.tan(y3)));
    }
}
public class Calculator2{
    public static void main(String[] args) {
        int num1=0,num2=0,num=0,count = 0, n=0,l=0,b=0,s1=0,s2=0,s3=0,base=0,h=0,side=0,radius=0,fact=1,option,ex;
        do
        {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Normal Calculator  2. Scientific Calculator 3. Area Calculator" );
        System.out.print("Enter your choice: ");
        option = sc.nextInt();
        scientific sic = new scientific();
        switch(option)
        {
          case 1:
            System.out.println("Enter your choice from the following menu:");
            System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Count\n6.Factorial");
            option = sc.nextInt();
            if(option!=6&&option!=5){
                System.out.println("Enter the first number:");
                num1=sc.nextInt();
                System.out.println("Enter the Second number:");
                num2=sc.nextInt();
            }
			else if(option==5){
				System.out.println("Enter the number:");
                num =sc.nextInt();
			}
			else if(option==6){
				System.out.println("Enter the number:");
                n =sc.nextInt();
			}
            switch(option)
            {
                case 1:
                System.out.println("Addition of "+num1+" and "+num2+" is "+(num1+num2));
                break;
                case 2:
                System.out.println("subtraction of "+num1+" and "+num2+" is "+(num1-num2));
                break;
                case 3:
                System.out.println("Multiplication of "+num1+" and "+num2+" is "+(num1*num2));
                break;
                case 4:
                if(num2==0)
                System.out.println("Error!!! In Division denominator cannot be 0!");
                else{
                    System.out.println("In division of "+num1+" by "+num2+" quotient is "+(num1/num2)+" and remainder is "+(num1%num2));
                }
                break;
                case 5:
				while(num!=0){
				 num/=10;
				 ++count;
				}
				System.out.println("Number of digits: " + count);
				case 6:
				if(n!=0){
				for(int i=1;i<=n;i++)
				{
					fact=fact*i;
				}
				System.out.println("Factorial of "+n+" is = "+fact);
				}
				case 7:
                break;
                default:
                System.out.println("Invalid Choice");
            }
            break;
        case 2:
                System.out.println("Enter your choice from the following:");
                System.out.println("1. Addition");
                System.out.println("2. Substraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("5.SIN");
                System.out.println("6.COS");
                System.out.println("7.TAN");
                System.out.println("8.SQUARE OF THE NUMBER");
                System.out.println("9.CUBE OF THE NUMBER");
                System.out.println("10.SQUARE ROOT OF THE NUMBER");
                System.out.println("11.CUBE ROOT OF THE NUMBER");
                option = sc.nextInt();
                    if(option!=5&&option!=6&&option!=7&&option!=8&&option!=9&&option!=10&&option!=11){
                        System.out.println("Enter the first number:");
                        int num3=sc.nextInt();
                        System.out.println("Enter the Second number:");
                        int num4=sc.nextInt();
                    
                switch(option)
                {
                case 1:
                System.out.println("Addition of "+num3+" and "+num4+" is "+(num3+num4));
                break;
                case 2:
                System.out.println("subtraction of "+num3+" and "+num4+" is "+(num3-num4));
                break;
                case 3:
                System.out.println("Multiplication of "+num3+" and "+num4+" is "+(num3*num4));
                break;
                case 4:
                if(num4==0)
                System.out.println("Error!!! In Division denominator cannot be 0!");
                else{
                    System.out.println("In division of "+num3+" by "+num4+" quotient is "+(num3/num4)+" and remainder is "+(num3%num4));
                }
                break;
                default:
                    System.out.println("Error!!!!!Enter valid choice");
                }
            }
                else
                {
                    System.out.print("Enter the number : \n");
                    int num5 = sc.nextInt();
                    switch (option){
                        case 5 :
                            sic.SIN(num5);
                            break;
                        case 6:
                            sic.COS(num5);
                            break;
                        case 7:
                            sic.TAN(num5);
                            break;
                        case 8:
                            System.out.println("\n The square of the Given Number " +num5+ " = " +(num5*num5));
                            break;
                        case 9:
                            System.out.println("\n The cube of the Given Number " +num5+ " = " +(num5*num5*num5));
                            break;
                        case 10:
                            System.out.println("\n The square root of the Given Number " +num5+ " = " +(Math.sqrt(num5)));
                            break;
                        case 11:
                            System.out.println("\n The square root of the Given Number " +num5+ " = " +(Math.cbrt(num5)));
                            break;
                        default:
                            System.out.println("Error!!! Enter valid choice");
                    }
                }
                break;
            case 3:
                    System.out.println("1.PERIMETER OF A RECTANGLE");
                    System.out.println("2.AREA OF A RECTANGLE");
                    System.out.println("3.PERIMETER OF A SQUARE");
                    System.out.println("4.AREA OF A SQUARE");
                    System.out.println("5.PERIMETER OF A CIRCLE");
                    System.out.println("6.AREA OF A CIRCLE");
                    System.out.println("7.PERIMETER OF A TRIANGLE");
                    System.out.println("8.AREA OF A TRIANGLE");
                    System.out.println("9.SURFACE AREA OF  A CUBE");
                    System.out.println("10.VOLUME OF A CUBE");
                    System.out.println("11.SURFACE AREA OF  A SPHERE");
                    System.out.println("12.VOLUME OF A SPHERE");
                    System.out.println("13.SURFACE AREA OF  A CONE");
                    System.out.println("14.VOLUME OF A CONE");
                    System.out.println("15.PERIMETER OF A PARALELLOGRAM");
                    System.out.println("16.AREA OF A PARALELLOGRAM");
                    option = sc.nextInt();
                    if(option!=3&&option!=4&&option!=5&&option!=6&&option!=7&&option!=8&&option!=9&&option!=10&&option!=11&&option!=12&&option!=13&&option!=14&&option!=15&&option!=16&&option!=17&&option!=18){
                        System.out.println("Enter the length:");
                        l=sc.nextInt();
                        System.out.println("Enter the breadth:");
                        b=sc.nextInt();
                    }
                    else if(option!=1&&option!=2&&option!=5&&option!=6&&option!=7&&option!=8&&option!=9&&option!=10&&option!=11&&option!=12&&option!=13&&option!=14&&option!=15&&option!=16&&option!=17&&option!=18){
                        System.out.println("Enter the side of the square:");
                        side=sc.nextInt();
                    }
                    else if(option!=1&&option!=2&&option!=3&&option!=4&&option!=7&&option!=8&&option!=9&&option!=10&&option!=11&&option!=12&&option!=13&&option!=14&&option!=15&&option!=16&&option!=17&&option!=18){
                        System.out.println("Enter the radius of the circle:");
                        radius=sc.nextInt();
                    } 
                    else if(option!=1&&option!=2&&option!=3&&option!=4&&option!=5&&option!=6&&option!=8&&option!=9&&option!=10&&option!=11&&option!=12&&option!=13&&option!=14&&option!=15&&option!=16&&option!=17&&option!=18){
                        System.out.println("Enter the 1st side of the trianle:");
                        s1=sc.nextInt();
                        System.out.println("Enter the 2nd side of the triangle:");
                        s2=sc.nextInt();
                        System.out.println("Enter the 3rd side of the triangle:");
                        s3=sc.nextInt();
                    } 
                    else if(option!=1&&option!=2&&option!=3&&option!=4&&option!=5&&option!=6&&option!=7&&option!=9&&option!=10&&option!=11&&option!=12&&option!=13&&option!=14&&option!=15&&option!=16&&option!=17&&option!=18){
                        System.out.println("Enter the base of the triangle:");
                        base = sc.nextInt();
                        System.out.println("Enter the height of the triangle:");
                        h = sc.nextInt();
                    } 
                    else if(option!=1&&option!=2&&option!=3&&option!=4&&option!=5&&option!=6&&option!=7&&option!=8&&option!=10&&option!=11&&option!=12&&option!=13&&option!=14&&option!=15&&option!=16&&option!=17&&option!=18){
                        System.out.println("Enter the side of the cube:");
                        side=sc.nextInt();
                    }
                    else if(option!=1&&option!=2&&option!=3&&option!=4&&option!=5&&option!=6&&option!=7&&option!=8&&option!=9&&option!=11&&option!=12&&option!=13&&option!=14&&option!=15&&option!=16&&option!=17&&option!=18){
                        System.out.println("Enter the side of the cube:");
                        side=sc.nextInt();
                    }
                    else if(option!=1&&option!=2&&option!=3&&option!=4&&option!=5&&option!=6&&option!=7&&option!=8&&option!=9&&option!=10&&option!=12&&option!=13&&option!=14&&option!=15&&option!=16&&option!=17&&option!=18){
                        System.out.println("Enter the radius of the sphere:");
                        radius=sc.nextInt();
                    }
                    else if(option!=1&&option!=2&&option!=3&&option!=4&&option!=5&&option!=6&&option!=7&&option!=8&&option!=9&&option!=10&&option!=11&&option!=13&&option!=14&&option!=15&&option!=16&&option!=17&&option!=18){
                        System.out.println("Enter the radius of the sphere:");
                        radius=sc.nextInt();
                    }
                    else if(option!=1&&option!=2&&option!=3&&option!=4&&option!=5&&option!=6&&option!=7&&option!=8&&option!=9&&option!=10&&option!=11&&option!=12&&option!=14&&option!=15&&option!=16&&option!=17&&option!=18){
                        System.out.println("Enter the radius of the cone:");
                        radius=sc.nextInt();
                        System.out.println("Enter the side of the cone:");
                        side=sc.nextInt();
                    }
                    else if(option!=1&&option!=2&&option!=3&&option!=4&&option!=5&&option!=6&&option!=7&&option!=8&&option!=9&&option!=10&&option!=11&&option!=12&&option!=13&&option!=15&&option!=16&&option!=17&&option!=18){
                        System.out.println("Enter the radius of the cone:");
                        radius=sc.nextInt();
                        System.out.println("Enter the height of the cone:");
                        h=sc.nextInt();
                    }
                    else if(option!=1&&option!=2&&option!=3&&option!=4&&option!=5&&option!=6&&option!=7&&option!=8&&option!=9&&option!=10&&option!=11&&option!=12&&option!=13&&option!=14&&option!=16&&option!=17&&option!=18){
                        System.out.println("Enter the base of the parallelogram:");
                        base=sc.nextInt();
                        System.out.println("Enter the height of the parallelogram:");
                        h=sc.nextInt();
                    }
                    else if(option!=1&&option!=2&&option!=3&&option!=4&&option!=5&&option!=6&&option!=7&&option!=8&&option!=9&&option!=10&&option!=11&&option!=12&&option!=13&&option!=14&&option!=15&&option!=17&&option!=18){
                        System.out.println("Enter the base of the parallelogram:");
                        base=sc.nextInt();
                        System.out.println("Enter the height of the parallelogram:");
                        h=sc.nextInt();
                    }
                    switch(option)
                        {
                            case 1:
                            System.out.println("PERIMETER = "+(2*(l+b)));
                            break;
                            case 2:
                            System.out.println("AREA = "+(l*b));
                            break;
                            case 3:
                            System.out.println("PERIMETER = "+(4*side));
                            break;
                            case 4:
                            System.out.println("AREA = "+(side*side));
                            break;
                            case 5:
                            System.out.println("PERIMETER = "+(2*Math.PI*radius));
                            break;
                            case 6:
                            System.out.println("AREA = "+(Math.PI*radius*radius));
                            break;
                            case 7:
                            System.out.println("PERIMETER = "+(s1+s2+s3));
                            break;
                            case 8:
                            System.out.println("AREA = "+(0.5*base*h));
                            break;
                            case 9:
                            System.out.println("SURFACE AREA = "+(6*(side*side)));
                            break;
                            case 10:
                            System.out.println("VOLUME = "+(side*side*side));
                            break;
                            case 11:
                            System.out.println("SURFACE AREA = "+4*Math.PI*(radius*radius));
                            break;
                            case 12:
                            System.out.println("VOLUME = "+1.333333333*Math.PI*(radius*radius*radius));
                            break;
                            case 13:
                            System.out.println("SURFACE AREA = "+(Math.PI*radius*side));
                            break;
                            case 14:
                            System.out.println("VOLUME = "+(0.333333333*Math.PI*radius*radius*h));
                            break;
                            case 15:
                            System.out.println("PERIMETER = "+2*(base+h));
                            break;
                            case 16:
                            System.out.println("AREA = "+(base*h));
                            break;
                        }
            break;
            default:
                System.out.println("Error!!! Enter a valid choice");
        }
        System.out.println("Do you want to continue? \n1.Yes\n2.No");
    ex = sc.nextInt(); 
        }while(ex==1);
    }
}